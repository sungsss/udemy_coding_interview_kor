package stack.isPalindrome;

import java.util.Stack;

public class Practice_01 {
	public static boolean isPalindrome(String s){
		Stack<Character> stack = new Stack<Character>();
		int len = s.length();
		
		//example: noon, level, civic ...
		for(int i=0; i<len/2; i++){
			stack.push(s.charAt(i));
		}
		for(int i=(len+1)/2; i<len; i++){
			char c = stack.pop();
			if(s.charAt(i) != c) return false;
		}
		return true;
	}
}
