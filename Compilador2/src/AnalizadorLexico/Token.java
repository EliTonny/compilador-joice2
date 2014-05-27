package AnalizadorLexico;

public class Token
{
    private int id;
    private String lexeme;
    private int position;
    private int linha;

    public Token(int id, String lexeme, int position, int linha)
    {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
        this.linha = linha;
    }

    public int getLinha() {
        return linha;
    }

    public final int getId()
    {
        return id;
    }

    public final String getLexeme()
    {
        return lexeme;
    }

    public final int getPosition()
    {
        return position;
    }
    
    public final String getClasse()
    {
        if(id == 2)
            return "Identificador";
        else if(id == 3)
            return "Constante Integer";
        else if(id == 4)
            return "Constante Float  ";
        else if(id == 5)
            return "Constante String ";
        else if(id <= 23)
            return "Símbolo Especial ";
        else if(id == 39)
            return "Palavra Reservada";
        else
            return "Desconhecido";
    }

    public String toString()
    {
        return id+" ( "+lexeme+" ) @ "+position;
    };
}
