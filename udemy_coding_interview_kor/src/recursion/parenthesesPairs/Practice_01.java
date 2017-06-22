package recursion.parenthesesPairs;

import java.util.ArrayList;
import java.util.List;

public class Practice_01 {
    public static List<String> getPairs(int n){
        if(n==0) return null;
        
        return getPairsRec(n, n, "", new ArrayList<String>());
    }
    
    private static List<String> getPairsRec(int l, int r, String pairs, List<String> list){
        if(l > r) return list;
        
        if(l<0 || r<0) return list;
        
        if(l==0 && r==0){
            list.add(pairs);
            return list;
        }
        
        getPairsRec(l-1, r, pairs+"(", list);
        getPairsRec(l, r-1, pairs+")", list);
        return list;
    }
}
