package taojava.aic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 * A quick demonstration of predicates.
 */
public class PredicateExample {

    // +-----------+-------------------------------------------------------
    // | Utilities |
    // +-----------+

    /** 
     * Print all the elements of the array for which pred holds.
     */
    public static <T> void printMatching(PrintWriter pen, T[] vals,
            Predicate<T> pred) {
        for (T val: vals) {
            if (pred.test(val)) {
                pen.print(val + " ");
            } // if
        } // for
        pen.println();
    } // printMatching(PrintWriter, T[], Predicate<T>)

    // +------+------------------------------------------------------------
    // | Main |
    // +------+

    public static void main(String[] args) throws IOException {
        PrintWriter pen = new PrintWriter(System.out, true);
        BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));
        String[] jabberwocky = new String[] { "Twas", "brillig", "and",
                "the", "slithy", "toves", "did", "gyre", "and", "gimble",
                "in", "the", "wabe", "All", "mimsy", "were", "the", 
                "borogoves", "and", "the", "mome", "raths", "outgrabe" };
        Predicate<String> includesB = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                return str.contains("b");
            } // test(String)
        }; // new Predicate<String>
        Predicate<String> small = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                return str.length() <= 4;
            } // test(String)
        }; // new Predicate<String>
        Predicate<String> endIne = new Predicate<String>() {
            @Override
            public boolean test(String str) {
        	return str.charAt(str.length() - 1) == 'e';
            }
        };
        
	while (true) {
	    pen.println("Please input a string: ");
	    final String pred = eyes.readLine();
	    Predicate<String> includesPred = new Predicate<String>() {
	            @Override
	            public boolean test(String str) {
	                return str.contains(pred);
	            } // test(String)
	        }; // new Predicate<String>
	    printMatching(pen, jabberwocky, includesPred);
	}
        
    } // main(String[])
} // class PredicateExample
