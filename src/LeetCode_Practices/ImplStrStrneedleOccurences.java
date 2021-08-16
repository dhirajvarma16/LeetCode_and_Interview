package LeetCode_Practices;

import java.util.Scanner;

public class ImplStrStrneedleOccurences {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String str1=in.next();
		String str2=in.next();
		ImplStrStrneedleOccurences implStrStrneedleOccurences=new ImplStrStrneedleOccurences();
		implStrStrneedleOccurences.returnIndexOfNeedle(str1,str2);		

	}
	
	public int returnIndexOfNeedle(String str1,String str2) {
		int m=str1.length();
		int n=str2.length();
		if(str2.isEmpty())
		   return 0;
		if(m<n)
		 return -1;
		for(int i=0; i<m; i++) {
			int j;
			for(j=0; j<n ;j++) {
				if(str1.charAt(i)!=str2.charAt(j))
					break;
			}
			if(j==n) 
				return i;
		}
		return 0;
	}

}
