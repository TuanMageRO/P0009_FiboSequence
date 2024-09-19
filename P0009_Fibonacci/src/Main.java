
public class Main {
    public static void main(String[] args) {
        solveData sd = new solveData();
        int n = sd.checkInteger("Enter the number of Fibonacci sequence: ", 1, 92);
        sd.display(n);
    }
}
