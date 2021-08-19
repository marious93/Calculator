package Calculator;

import static org.junit.Assert.*;

public class ContextTest {

    @org.junit.Test
    public void run() throws Exception{
        Context context = new Context();
        assertEquals(0, context.run("C"));
        assertEquals(2, context.run("C2"));
        assertEquals(5, context.run("C0+5="));
        assertEquals(5, context.run("C1+4="));
        assertEquals(5, context.run("C2+3="));
        assertEquals(10, context.run("C1+9="));
        assertEquals(5, context.run("C125/25-2+3-1="));
    }
}