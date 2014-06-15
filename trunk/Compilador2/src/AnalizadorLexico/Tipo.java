package AnalizadorLexico;

public enum Tipo {

    nothing(0),
    cte_int(Constants.t_const_integer),
    cte_string(Constants.t_const_string),
    cte_float(Constants.t_const_float),
    cte_bool(Constants.t_boolean),
    programa(50);
    private int value;

    public int getValue()
    {
        return(value);
    }
    
    private Tipo(int value) {
        this.value = value;
    }
}