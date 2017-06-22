package recursion.countWays;

public class Practice_01 {
    public static int countWays(int n){
        if(n < 0) return 0;
        if(n == 0) return 1;
        
        return countWays(n-1) +
                countWays(n-2) +
                countWays(n-3) +
                countWays(n-4) +
                countWays(n-5) +
                countWays(n-6);
    }
}
