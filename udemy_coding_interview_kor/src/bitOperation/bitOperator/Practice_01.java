package bitOperation.bitOperator;

public class Practice_01 {
    
    //n=13, i=3
    //1101
    //0100 AND
    //0100
    public static boolean get(int n, int i){
        int mask = 1 << (i-1);
        return (n & mask) != 0; 
    }
    
    //n=13, i=2
    //1101
    //0010 OR
    //1111
    public static int set(int n, int i){
        int mask = 1 << (i-1);
        return n | mask;
    }
    
    //n=13, i=3
    //1101
    //1011 AND
    //1001
    public static int clear(int n, int i){
        int mask = ~(1 << (i-1));
        return n & mask;
    }
}
