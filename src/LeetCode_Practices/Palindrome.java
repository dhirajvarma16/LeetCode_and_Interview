package LeetCode_Practices;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int inPut=sc.nextInt();
		Palindrome palindrome= new Palindrome();
		palindrome.isPalindrome(inPut);

	}	
	public boolean isPalindrome(int x) {
		int sum=0,r;
		while(x>x/2) {
			r = x%10;
			sum= sum*10+r;
			x=x%10;
		}
		if(x==sum) {	        
		    System.out.println("true");
		    return true;
		    }
		else {
			System.out.println("false");
			return false;
			}
}

}
