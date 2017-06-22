package dynamicProgramming.fibonacciFaster;

public class Practice_01 {
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static int fibonacciFaster(int n){
        return fiboFasterRec(n, new int[n+1]);
    }
    
    private static int fiboFasterRec(int n, int[] cache){
        if(n==0) return 0;
        if(n==1) return 1;
        
        if(cache[n] != 0){
            return cache[n];
        }
        cache[n] = fiboFasterRec(n-1, cache) + fiboFasterRec(n-2, cache); 
        return cache[n];
    }
}
