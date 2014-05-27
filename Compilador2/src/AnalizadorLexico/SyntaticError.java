package AnalizadorLexico;

public class SyntaticError extends AnalysisError
{
    private String lexema;
    public SyntaticError(String msg, int position, int linha, String lexema)
	 {
        super(msg, position, linha);
        this.lexema = lexema;
    }

    public SyntaticError(String msg)
    {
        super(msg);
    }

    public String getLexema() {
        return lexema;
    }
}
