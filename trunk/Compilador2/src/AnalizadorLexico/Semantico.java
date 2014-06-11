package AnalizadorLexico;

import java.util.ArrayList;
import java.util.Stack;

public class Semantico implements Constants {

    Stack<Integer> tipos = new Stack<>();
    ArrayList<String> codigo = new ArrayList<>();
    String operador_relacional = "";

    public int getResult() {
        return ((Integer) tipos.peek()).intValue();
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

            int tipo1;
            int tipo2;

            switch (action) {
                case 1:
                case 2:
                case 3:
                case 4:
                    tipo1 = tipos.pop();
                    tipo2 = tipos.pop();
                    if (tipo1 == Constants.t_const_string
                            || tipo1 == Constants.t_boolean
                            || tipo2 == Constants.t_const_string
                            || tipo2 == Constants.t_boolean) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    if (tipo1 == Constants.t_const_float || tipo2 == Constants.t_const_float) {
                        tipos.push(Constants.t_const_float);
                    } else {
                        tipos.push(Constants.t_const_integer);
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
                    tipos.add(Constants.t_const_integer);
                    codigo.add("ldc.i8 " + token.getLexeme());
                    break;
                case 6:
                    tipos.add(Constants.t_const_float);
                    codigo.add("ldc.r8 " + token.getLexeme());
                    break;
                case 7:
                    tipo1 = tipos.pop();
                    if (tipo1 == Constants.t_const_string
                            || tipo1 == Constants.t_boolean) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    tipos.push(tipo1);
                    codigo.add("ldc.i8 -1");
                    codigo.add("mul");
                    break;
                case 11:
                case 12:
                    tipos.push(Constants.t_boolean);
                    if (token.getLexeme().equals("true")) {
                        codigo.add("ldc.i4.1");
                    } else {
                        codigo.add("ldc.i4.0");
                    }
                    break;
                case 13:
                    tipo1 = tipos.pop();
                    if (tipo1 != Constants.t_boolean) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    tipos.add(Constants.t_boolean);

                    codigo.add("ldc.i4.1");
                    codigo.add("xor");

                    break;
                case 14:
                    switch (tipos.peek()) {
                        case Constants.t_boolean:
                            codigo.add("call void [mscorlib]System.Console::Write(bool)");
                            break;
                        case Constants.t_const_float:
                            codigo.add("call void [mscorlib]System.Console::Write(float64)");
                            break;
                        case Constants.t_const_integer:
                            codigo.add("call void [mscorlib]System.Console::Write(int64)");
                            break;
                        case Constants.t_const_string:
                            codigo.add("call void [mscorlib]System.Console::Write(string)");
                            break;
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
                    if (tipo1 != Constants.t_boolean || tipo2 != Constants.t_boolean) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    tipos.push(Constants.t_boolean);
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
                    if (tipo1 == Constants.t_boolean || tipo2 == Constants.t_boolean) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    if (tipo1 != tipo2) {
                        throw new SemanticError("Tipos incompatíveis em operação", token);
                    }
                    tipos.push(Constants.t_boolean);
                    if (operador_relacional == "==") {
                        codigo.add("ceq");
                    } else if (operador_relacional == "!=") {
                        codigo.add("ceq");
                        codigo.add("not");
                    } else if (operador_relacional == "<") {
                        codigo.add("clt");
                    } else if (operador_relacional == "<=") {
                        codigo.add("cgt");
                        codigo.add("not");
                    } else if (operador_relacional == ">") {
                        codigo.add("cgt");
                    } else if (operador_relacional == ">=") {
                        codigo.add("clt");
                        codigo.add("not");
                    }
                    break;
                case 22:
                    tipos.add(Constants.t_const_string);
                    codigo.add("ldstr " + token.getLexeme());
                    break;
                case 23:
                    //????????????????????????????????????
                    break;
            }
        } catch (SemanticError ex) {
            throw ex;
        } catch (Exception ex) {
            throw new SemanticError("Erro no método executeAction da classe Semantico");
        }
    }
}
