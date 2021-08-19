package Calculator;

public class StateAnswer  extends State{
    @Override
    void clear(Context context) {
        context.state = new StateX();
        context.state.clear(context);
    }

    @Override
    void digit(Context context, char key) {
        context.state = new StateX();
        context.state.digit(context, key);
    }

    @Override
    void arifm(Context context, char key) {
        context.state = new StateAction();
        context.state.arifm(context, key);
    }

    @Override
    void equal(Context context) {
        int answer = 0;
        switch (context.o){
            case '+': answer = context.x + context.y; break;
            case '-': answer = context.x - context.y; break;
            case '*': answer = context.x * context.y; break;
            case '/': answer = context.x / context.y; break;
        }
        context.x = answer;
    }
}
