package recursion.parenthesesPairs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> result = Practice_01.getPairs(2);
        for(String s : result){
            System.out.println(s);
        }
    }
}
