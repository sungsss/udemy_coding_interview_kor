package bitOperation.isPowerOfTwo;

public class Practice_01 {
    //2^n
    //10 = 2
    //100 = 4
    //1000 = 8
    //10000 = 16
    //16-1 = 15
    //10000 - 1 = 01111
    //i & (i-1)
    //16 & 15 =>
    //  10000
    //&01111
    //  00000
    public static boolean isPowerOfTwo(int i){
        return (i & (i-1)) == 0;
    }
}
