package dynamicProgramming.fibonacciFaster;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int result = Practice_01.fibonacci(40);
        long end = System.currentTimeMillis();        
        System.out.println(result);
        System.out.println("Running Time: " + (end-start)/1000.0);
        
        start = System.currentTimeMillis();
        int resultFaster = Practice_01.fibonacciFaster(40);
        end = System.currentTimeMillis();
        System.out.println(resultFaster);
        System.out.println("Running Time for faster: " + (end-start)/1000.0);
    }
}

