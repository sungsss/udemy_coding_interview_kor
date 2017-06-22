package string.stringToInt;

public class Practice_01 {
    public static int convertToInt(String s){
        char[] ca = s.toCharArray();
        int num = 0;
        
        for(char c : ca){
            num = num * 10;
            num = num + c - '0';
        }
        
        return num;
    }
}
