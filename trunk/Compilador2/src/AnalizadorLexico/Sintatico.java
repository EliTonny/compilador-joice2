package AnalizadorLexico;

import java.util.Stack;
public class Sintatico implements Constants
{
    private Stack stack = new Stack();
    private Token currentToken;
    private Token previousToken;
    private Lexico scanner;
    private Semantico semanticAnalyser;

    private static final boolean isTerminal(int x)
    {
        return x < ParserConstants.FIRST_NON_TERMINAL;
    }

    private static final boolean isNonTerminal(int x)
    {
        return x >= ParserConstants.FIRST_NON_TERMINAL && x < ParserConstants.FIRST_SEMANTIC_ACTION;
    }

    private static final boolean isSemanticAction(int x)
    {
        return x >= ParserConstants.FIRST_SEMANTIC_ACTION;
    }

    private boolean step() throws LexicalError, SyntaticError, SemanticError
    {
        if (currentToken == null)
        {
            int pos = 0;
            if (previousToken != null)
                pos = previousToken.getPosition()+previousToken.getLexeme().length();

            currentToken = new Token(DOLLAR, "$", pos, -1);
        }

        int x = ((Integer)stack.pop()).intValue();
        int a = currentToken.getId();

        if (x == EPSILON)
        {
            return false;
        }
        else if (isTerminal(x))
        {
            if (x == a)
            {
                if (stack.empty())
                    return true;
                else
                {
                    previousToken = currentToken;
                    currentToken = scanner.nextToken();
                    return false;
                }
            }
            else
            {
                throw new SyntaticError(ParserConstants.PARSER_ERROR[x], currentToken.getPosition(), currentToken.getLinha(),currentToken.getClasse(), currentToken.getLexeme());
            }
        }
        else if (isNonTerminal(x))
        {
            if (pushProduction(x, a))
                return false;
            else
                throw new SyntaticError(ParserConstants.PARSER_ERROR[x], currentToken.getPosition(), currentToken.getLinha(), currentToken.getClasse(), currentToken.getLexeme());
        }
        else // isSemanticAction(x)
        {
            semanticAnalyser.executeAction(x-ParserConstants.FIRST_SEMANTIC_ACTION, previousToken);
            return false;
        }
    }

    private boolean pushProduction(int topStack, int tokenInput)
    {
        int p = ParserConstants.PARSER_TABLE[topStack-ParserConstants.FIRST_NON_TERMINAL][tokenInput-1];
        if (p >= 0)
        {
            int[] production = ParserConstants.PRODUCTIONS[p];
            //empilha a produ��o em ordem reversa
            for (int i=production.length-1; i>=0; i--)
            {
                stack.push(new Integer(production[i]));
            }
            return true;
        }
        else
            return false;
    }

    public void parse(Lexico scanner, Semantico semanticAnalyser) throws LexicalError, SyntaticError, SemanticError
    {
        this.scanner = scanner;
        this.semanticAnalyser = semanticAnalyser;

        stack.clear();
        stack.push(new Integer(DOLLAR));
        stack.push(new Integer(ParserConstants.START_SYMBOL));

        currentToken = scanner.nextToken();

        while ( ! step() )
            ;
    }
}
