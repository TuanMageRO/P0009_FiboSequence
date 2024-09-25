
public class View {
    public void display(int[] arr) {
        int size = arr.length;
        System.out.println("The Fibonacci sequence of length " + size + ": ");       
        for(int i = 0; i < size; ++i) {
            System.out.print(arr[i]);
            if(i < size - 1) System.out.print(", ");
        }
        System.out.println("");
    }
}
