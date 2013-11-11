package taojava.aic;

import java.io.PrintWriter;

public class SampleGreetable8 implements Greetable {
    int i = 0;

    @Override
    public Greeter greeter() {
        return new Greeter() {
            int greetNum = i;
            int num = ++i;
            @Override
            public void greet(PrintWriter pen) {
                pen.println("Greeting " + greetNum + " from greeter " + num + " of " + i);
            } // greet(PrintWriter)
        }; // new Greeter
    } // greeter()
} // interface SampleGreetable4
