package string.isUniqueChar;

import java.util.HashSet;

public class Practice_01 {
    public static boolean isUniqueChar(String s){
        HashSet<Character> set = new HashSet<Character>();
        
        for(char c : s.toCharArray()){
            if(set.contains(c)) return false;
            set.add(c);
        }
        
        return true;
    }
}
