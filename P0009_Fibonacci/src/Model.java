
public class Model {
    public int fibonacci(int size) {
        if(size == 0) return 0;
        if(size == 1) return 1;
        else{
            return fibonacci(size-1) + fibonacci(size-2);
        }
    }
    
    public int[] getFibonacciSequence(int size) {
        int[] sequence = new int[size];
        for (int i = 0; i < size; ++i) {
            sequence[i] = (int) fibonacci(i);
        }
        return sequence;
    }
}
