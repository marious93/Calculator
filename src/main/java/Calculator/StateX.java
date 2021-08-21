package Calculator;

public class StateX extends State {
    boolean type = false;
    @Override
    void clear(Context context) {
        context.x = 0;//x number
        context.y = 0;
        context.o = '+';
    }

    @Override
    void digit(Context context, char key) {
        if (!type) {
            context.x = 0;
            type = true;
        }
            context.x = context.x * 10 + Character.getNumericValue(key);
    }

    @Override
    void arifm(Context context, char key) {
        context.state = new StateAction();
        context.state.arifm(context, key);

    }

    @Override
    void equal(Context context) {
        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
