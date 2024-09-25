
import java.util.Scanner;

public class Controller {
    private final Scanner sc = new Scanner(System.in);
    private final Model mod = new Model();
    private final View v = new View();
    public int checkInteger(String mess, int min, int max) {
        int n;
        String err = "Only permits integer in range " + min + " to " + max;
        while(true) {
            try{
                System.out.print(mess);
                n = Integer.parseInt(sc.nextLine());
                if(n < min || n > max) {
                    System.err.println(err);
                    continue;
                }
                return n;
            }
            catch (NumberFormatException e) {
                System.err.println("Illegal Input (only permit integer)");
            }
        }
    }
    
    public void run() {
        int size = checkInteger("Enter the number of Fibonacci sequence: ", 1, 45);
        int[] sequence = mod.getFibonacciSequence(size);
        v.display(sequence);
    }
    
    
}
