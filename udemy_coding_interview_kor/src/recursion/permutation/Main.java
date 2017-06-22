package recursion.permutation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> result = Practice_01.permutations("abc");
        for(String s : result){
            System.out.println(s);
        }
    }
}
