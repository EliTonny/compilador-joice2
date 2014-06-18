package AnalizadorLexico;

import static AnalizadorLexico.Tipo.cte_bool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Semantico implements Constants {

    Stack<Tipo> tipos = new Stack<>();
    ArrayList<String> codigo = new ArrayList<>();
    String operador_relacional = "";
    Tipo tipo = Tipo.nothing;
    HashMap<String, Tipo> tabelaSimbolos = new HashMap<>();
    ArrayList<String> Lista = new ArrayList<>();
    int contadorLabel = 0;

    public int getResult() {
        return tipos.peek().getValue();
    }

    public String getCodigo() {
        String codigoGerado = "";
        for (int i = 0; i < codigo.size(); i++) {
            codigoGerado += codigo.get(i) + "\r\n";
        }
        return codigoGerado;
    }

    public void executeAction(int action, Token token) throws SemanticError {
        try {
            System.out.println("Ação #" + action + ", Token: " + token);

            Tipo tipo1;
            Tipo tipo2;

            switch (action) {
                case 1:
                case 2:
                case 3:
                case 4:
                    tipo1 = tipos.pop();
                    tipo2 = tipos.pop();
                    if (tipo1 == Tipo.cte_string
                            || tipo1 == Tipo.cte_bool
                            || tipo2 == Tipo.cte_string
                            || tipo2 == Tipo.cte_bool) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    if (tipo1 == tipo.cte_float || tipo2 == Tipo.cte_float) {
                        tipos.push(Tipo.cte_float);
                    } else {
                        tipos.push(Tipo.cte_int);
                    }
                    switch (action) {
                        case 1:
                            codigo.add("add");
                            break;
                        case 2:
                            codigo.add("sub");
                            break;
                        case 3:
                            codigo.add("mul");
                            break;
                        case 4:
                            codigo.add("sub");
                            break;
                    }
                    break;
                case 5:
                    tipos.add(Tipo.cte_int);
                    codigo.add("ldc.i8 " + token.getLexeme());
                    break;
                case 6:
                    tipos.add(Tipo.cte_float);
                    codigo.add("ldc.r8 " + token.getLexeme());
                    break;
                case 7:
                    tipo1 = tipos.pop();
                    if (tipo1 == Tipo.cte_string
                            || tipo1 == Tipo.cte_bool) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    tipos.push(tipo1);
                    codigo.add("ldc.i8 -1");
                    codigo.add("mul");
                    break;
                case 11:
                case 12:
                    tipos.push(Tipo.cte_bool);
                    if (token.getLexeme().equalsIgnoreCase("true")) {
                        codigo.add("ldc.i4.1");
                    } else {
                        codigo.add("ldc.i4.0");
                    }
                    break;
                case 13:
                    tipo1 = tipos.pop();
                    if (tipo1 != Tipo.cte_bool) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    tipos.add(Tipo.cte_bool);

                    codigo.add("ldc.i4.1");
                    codigo.add("xor");

                    break;
                case 14:

                    tipo1 = tipos.peek();

                    if (tipo1 == Tipo.cte_bool) {
                        codigo.add("call void [mscorlib]System.Console::Write(bool)");
                    } else if (tipo1 == Tipo.cte_float) {
                        codigo.add("call void [mscorlib]System.Console::Write(float64)");
                    } else if (tipo1 == Tipo.cte_int) {
                        codigo.add("call void [mscorlib]System.Console::Write(int64)");
                    } else if (tipo1 == Tipo.cte_string) {
                        codigo.add("call void [mscorlib]System.Console::Write(string)");
                    }
                    break;
                case 15:
                    String fileName = "programa_do_eli";
                    codigo.add(".assembly extern mscorlib{}");
                    codigo.add(".assembly " + fileName + "{}");
                    codigo.add(".module " + fileName + ".exe");
                    codigo.add("");
                    codigo.add(".class public " + fileName + " {");
                    codigo.add("  .method public static void _principal ()");
                    codigo.add("  {");
                    codigo.add("     .entrypoint");

                    break;
                case 16:
                    // ShowMessage ('Ação: ' + IntToStr (action) + ' - reconhecimento de fim de programa');
                    codigo.add("     ret");
                    codigo.add("  }");
                    codigo.add("}");
                    break;
                case 17:
                    codigo.add("ldstr \"\\r\\n\"");
                    codigo.add("call void [mscorlib]System.Console::Write(string)");
                    break;
                case 18:
                case 19:
                    tipo1 = tipos.pop();
                    tipo2 = tipos.pop();
                    if (tipo1 != Tipo.cte_bool || tipo2 != Tipo.cte_bool) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    tipos.push(Tipo.cte_bool);
                    if (action == 18) {
                        codigo.add("or");
                    } else {
                        codigo.add("and");
                    }
                    break;
                case 20:
                    operador_relacional = token.getLexeme();
                    break;
                case 21:
                    tipo1 = tipos.pop();
                    tipo2 = tipos.pop();
                    if (tipo1 == Tipo.cte_bool || tipo2 == Tipo.cte_bool) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    if (tipo1 != tipo2) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    tipos.push(Tipo.cte_bool);
                    switch (operador_relacional) {
                        case "==":
                            codigo.add("ceq");
                            break;
                        case "!=":
                            codigo.add("ceq");
                            codigo.add("ldc.i4.1");
                            codigo.add("xor");
                            break;
                        case "<":
                            codigo.add("clt");
                            break;
                        case "<=":
                            codigo.add("cgt");
                            codigo.add("ldc.i4.1");
                            codigo.add("xor");
                            break;
                        case ">":
                            codigo.add("cgt");
                            break;
                        case ">=":
                            codigo.add("clt");
                            codigo.add("ldc.i4.1");
                            codigo.add("xor");
                            break;
                    }
                    break;
                case 22:
                    tipos.add(Tipo.cte_string);
                    codigo.add("ldstr " + token.getLexeme());
                    break;
                case 23:
                    //????????????????????????????????????
                    break;
                case 24:
                    switch (token.getLexeme()) {
                        case "integer":
                            //tipo = "int64";
                            tipo = Tipo.cte_int;
                            break;
                        case "boolean":
                            //tipo = "bool";
                            tipo = Tipo.cte_bool;
                            break;
                        case "float":
                            //tipo = "floa64";
                            tipo = Tipo.cte_float;
                            break;
                        case "string":
                            //tipo = "string";
                            tipo = Tipo.cte_string;
                            break;
                    }
                    Lista.clear();
                    break;
                case 25:
                    Lista.add(token.getLexeme());
                    break;
                case 26:
                    for (String id : Lista) {
                        if (tabelaSimbolos.containsKey(id)) {
                            throw new SemanticError("Identificador " + id + " já declarado.", token);
                        }
                        tabelaSimbolos.put(id, tipo);
                        codigo.add(".locals(" + retornaTipo(tipo) + " " + id + ")");
                    }
                    break;
                case 27:
                    for (String id : Lista) {
                        if (!tabelaSimbolos.containsKey(id)) {
                            throw new SemanticError("Identificador " + id + " não declarado", token);
                        }
                        tipo1 = tabelaSimbolos.get(id);
                        if (tipo1 == Tipo.programa) {
                            throw new SemanticError("Identificador inválido", token);
                        }
                        codigo.add("call string [mscorlib]System.Console::ReadLine()");
                        switch (tipo1) {
                            case cte_bool:
                                codigo.add("call " + retornaTipo(tipo1) + " [mscorlib]System.Boolean::Parse(string)");
                                break;
                            case cte_int:
                                codigo.add("call " + retornaTipo(tipo1) + " [mscorlib]System.Int64::Parse(string)");
                                break;
                            case cte_float:
                                codigo.add("call " + retornaTipo(tipo1) + " [mscorlib]System.Double::Parse(string)");
                                break;
                        }
                        codigo.add("stloc " + id);
                    }
                    break;
                case 28:
                    String ident = token.getLexeme();
                    if (!tabelaSimbolos.containsKey(ident)) {
                        throw new SemanticError("Identificador " + ident + " não declarado", token);
                    }
                    tipo1 = tabelaSimbolos.get(ident);
                    if (tipo1 == Tipo.programa) {
                        throw new SemanticError("Identificador inválido", token);
                    }
                    tipos.add(tipo1);
                    codigo.add("ldloc " + ident);

                    break;
                case 29:
                case 30:
                    tipo1 = tipos.pop();
                    for (String id : Lista) {
                        tipo2 = tabelaSimbolos.get(id);
                        if (tipo1 != tipo2) {
                            throw new SemanticError("Tipo inválido na atribuição. "
                                    + "Esperado " + retornaTipo(tipo2)
                                    + " recebido " + retornaTipo(tipo1), token);
                        }
                        if (tipo2 == Tipo.programa) {
                            throw new SemanticError("Identificador inválido", token);
                        }

                        codigo.add("dup");
                        codigo.add("stloc " + id);
                    }
                    codigo.add("pop");
                    break;
                case 31:
                    codigo.add("brfalse L" + contadorLabel);
                    break;
                case 32:
                    codigo.add("L" + contadorLabel++ + ":");
                    break;
                case 33:
                    codigo.add("br L" + (contadorLabel + 1));
                    codigo.add("L" + contadorLabel++ + ":");
                    break;
                case 34:
                    codigo.add("L" + contadorLabel++ + ":");
                    break;
                case 35:
                    codigo.add("brfalse L" + contadorLabel);
                    codigo.add("br L" + (contadorLabel - 1));
                    codigo.add("L" + contadorLabel++ + ":");
                    break;
                case 100:
                    Lista.clear();
                    break;
            }
        } catch (SemanticError ex) {
            throw ex;
        } catch (Exception ex) {
            throw new SemanticError("Erro no método executeAction da classe Semantico");
        }
    }
    /*
     private String retornaTipo(int tipo) {
     switch (tipo) {
     case Constants.t_boolean:
     return "bool";
     case Constants.t_string:
     return "strinh";
     case Constants.t_const_float:
     return "float64";
     case Constants.t_const_integer:
     return "int64";
     }
     return "";
     }*/

    private String retornaTipo(Tipo tipo) {
        switch (tipo) {
            case cte_bool:
                return "bool";
            case cte_string:
                return "string";
            case cte_float:
                return "float64";
            case cte_int:
                return "int64";
            case programa:
                return "programa";
            default:
                return "";
        }
    }
}
