package recursion.bitCombinations;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> result = Practice_01.bitCombinations(3);
        
        for(String s : result){
            System.out.println(s);
        }
    }
}
