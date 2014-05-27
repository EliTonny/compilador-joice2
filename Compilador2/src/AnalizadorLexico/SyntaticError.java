package AnalizadorLexico;

public class SyntaticError extends AnalysisError
{
    private String lexema;
    private String classe;
    public SyntaticError(String msg, int position, int linha, String classe, String lexema)
	 {
        super(msg, position, linha);
        this.lexema = lexema;
        this.classe = classe;
    }

    public SyntaticError(String msg)
    {
        super(msg);
    }

    public String getLexema() {
        return lexema;
    }

    public String getClasse() {
        return classe;
    }
}
