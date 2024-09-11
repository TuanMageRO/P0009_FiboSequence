
public class solveData {
    public void fibonacciArray(int size) {
        int f1 = 0;
        int f2 = 1;
        System.out.println("The " + size + " sequence of fibonacci: ");
        System.out.print(f1 + ", " + f2);
        
        for(int i = 2; i < size; ++i) {
            int tmp = f1 + f2;
            System.out.print(", " + tmp);
            f1 = f2;
            f2 = tmp;
        }
        System.out.println("");
    }    
}
