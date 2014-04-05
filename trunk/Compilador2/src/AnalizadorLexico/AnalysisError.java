package AnalizadorLexico;

public class AnalysisError extends Exception {

    private int position;
    private int linha;

    public AnalysisError(String msg, int position, int linha) {
        super(msg);
        this.position = position;
        this.linha = linha;
    }

    public AnalysisError(String msg) {
        super(msg);
        this.position = -1;
    }

    public int getPosition() {
        return position;
    }

    public int getLinha() {
        return linha;
    }

    @Override
    public String toString() {
        return super.toString() + ", @ " + position + ", @ " + linha;
    }
}
