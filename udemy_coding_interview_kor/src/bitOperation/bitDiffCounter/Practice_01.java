package bitOperation.bitDiffCounter;

public class Practice_01 {
    public static int bitDiffCounter(int a, int b){
        int diff = a ^ b;
        int count = 0;
        while(diff != 0){
            // a=13, b=1
            //1101, 0001
            //diff = a^b = 1100
            //1100 & 1011 = 1000 => count = 1
            //1000 & 0001 = 0000 => count = 2
            diff = diff & (diff-1);
            count++;
        }
        return count;
    }
}
