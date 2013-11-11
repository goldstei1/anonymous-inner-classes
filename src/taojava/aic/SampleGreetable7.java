package taojava.aic;

import java.io.PrintWriter;

public class SampleGreetable7 implements Greetable {
    String name = "five";
    int i = 0;

    @Override
    public Greeter greeter() {
        return new Greeter() {
            int num = ++SampleGreetable7.this.i;
            @Override
            public void greet(PrintWriter pen) {
                pen.println(this.num + " of " + name);
            } // greet(PrintWriter)
        }; // new Greeter
    } // greeter()
} // interface SampleGreetable6

