package AnalizadorLexico;

import java.util.Stack;

public class Semantico implements Constants {

    Stack stack = new Stack();

    public int getResult() {
        return ((Integer) stack.peek()).intValue();
    }

    public void executeAction(int action, Token token) throws SemanticError {
        System.out.println("Ação #" + action + ", Token: " + token);

        switch (action) {
            case 5:
        }
    }
}
