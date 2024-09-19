
import java.util.Scanner;


public class solveData {
    private final Scanner sc = new Scanner(System.in);
    
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
    
    public long fibonacciArray(int size) {
        if(size == 0) return 0;
        if(size == 1) return 1;
        else{
            return fibonacciArray(size-1) + fibonacciArray(size-2);
        }
    }    
    
    public void display(int size) {
        System.out.println("The Fibonacci sequence of length " + size + ": ");
        for(int i = 0; i < size; ++i) {
            System.out.print(fibonacciArray(i));
            if(i < size - 1) System.out.print(", ");
        }
        System.out.println("");
    }
}
