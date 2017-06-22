package string.wordCount;

import java.util.HashMap;

public class Practice_01 {
    private HashMap<String, Integer> map;
    
    public Practice_01(){
        map = new HashMap<String, Integer>();
    }
    
    public void read(String[] doc){
        for(String word : doc){
            if(!map.containsKey(word)){
                map.put(word, 0);
            }
            map.put(word, map.get(word)+1);
        }
    }
    
    public int getCount(String word){
        if(map.get(word)==null)
            return 0;
        else
            return map.get(word);
    }
}
