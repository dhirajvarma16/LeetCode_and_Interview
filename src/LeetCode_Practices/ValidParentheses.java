package LeetCode_Practices;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		ValidParentheses vp=new ValidParentheses();
		vp.isValid("()");

	}
	
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        for(Character c: s.toCharArray()){
	            if(c == '(' || c == '{' || c == '['){
	                stack.push(c);
	            }
	            else {
	                if(!stack.isEmpty()){
	                    Character pop = stack.pop();
	                    if(c ==')' && (pop == '[' || pop == '{') ){
	                        return false;
	                    } else if(c ==']' && (pop == '(' || pop == '{') ){
	                        return false;
	                    } else if(c =='}' && (pop == '(' || pop == '[') ){
	                        return false;
	                    }
	                } else {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty() ? true: false;
	    }

}
