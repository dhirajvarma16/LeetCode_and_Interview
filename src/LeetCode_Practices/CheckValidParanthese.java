package LeetCode_Practices;

import java.util.Stack;

public class CheckValidParanthese {

	public static void main(String[] args) {
		String str="()";
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			if('('== str.charAt(i) || '{'==str.charAt(i) || '[' ==str.charAt(i))
			{
			stack.push(str.charAt(i));
			} else if(!stack.isEmpty() && ((str.charAt(i) == ')' && stack.peek() == '(')
					                     || )){
				
			}
			
		}
		

	}

}
