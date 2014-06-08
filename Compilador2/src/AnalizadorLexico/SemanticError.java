package AnalizadorLexico;

public class SemanticError extends AnalysisError {

    public SemanticError(String msg, int position, int linha) {
        super(msg, position, linha);
    }
    
    public SemanticError(String msg, Token token) {
        super(msg, token.getPosition(), token.getLinha());
    }

    public SemanticError(String msg) {
        super(msg);
    }
}
