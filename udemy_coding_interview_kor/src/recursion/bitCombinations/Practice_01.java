package recursion.bitCombinations;

import java.util.ArrayList;

public class Practice_01 {
    public static ArrayList<String> bitCombinations(int n){
        return bitCombRec(n, "", new ArrayList<String>());
    }
    
    public static ArrayList<String> bitCombRec(int n, String s, ArrayList<String> list){
        if(n==s.length()){
            list.add(s);
            return list;
        }
        
        bitCombRec(n, s + "0", list);
        bitCombRec(n, s + "1", list);
        return list;
    }
}
