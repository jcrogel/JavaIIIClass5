public class FibonacciGenerator {


    public static long getFibRecursive(long pos){
        if (pos <= 1){
            return pos;
        }
        return getFibRecursive(pos-1) + getFibRecursive(pos-2);
    }

    public static long getFib(long pos){
        long first = 0;
        long second = 1;
        long result = 0;
        for (int cnt=1; cnt<pos; cnt++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

}
