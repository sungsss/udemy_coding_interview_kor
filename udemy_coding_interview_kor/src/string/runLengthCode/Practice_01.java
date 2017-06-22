package string.runLengthCode;

public class Practice_01 {
    public static String runLengthCode(String s){
        if(s==null) return null;
        
        char[] ca = s.toCharArray();
        String result = "";
        
        int count = 1;
        char prev = ca[0];
        
        for(int i=1; i<ca.length; i++){
            if(prev==ca[i]){
                count++;
            }
            else{
                result = result + prev + count;
                count = 1;
                prev = ca[i];
            }
        }
        result = result + prev +count;
        
        return result;
    }
}
