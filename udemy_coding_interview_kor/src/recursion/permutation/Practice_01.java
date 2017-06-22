package recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class Practice_01 {
    public static List<String> permutations(String s){
        if(s==null) return null;
        return permRec(s, new boolean[s.length()], "", new ArrayList<String>());
    }
    
    private static List<String> permRec(String s, boolean[] pick, String perm, List<String> list){
        if(perm.length() == s.length()){
            list.add(perm);
            return list;
        }
        
        for(int i=0; i<s.length(); i++){
            if(pick[i]) continue;
            
            pick[i] = true;
            permRec(s, pick, perm+s.charAt(i), list);
            pick[i] = false;
        }
        return list;
    }
}
