package LeetCode_Practices;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=321,r;
		
		long t=0;
        while(x!=0){
            r=x%10;
            t=t*10+r;
            x=x/10;
	}
        
        System.err.print("Reverse Number :"+ t);
}
	
}
