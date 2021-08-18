package LeetCode_Practices;

import java.util.Scanner;

public class PrintNearestPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		PrintNearestPrimeNumber prn=new PrintNearestPrimeNumber();
		prn.returnNearestPrimeNumber(value);
		prn.returnNearestPrimeNumber1(value);

	}
	public int returnNearestPrimeNumber(int value){
		int temp=value-1;
		int nearestlow=0;
		int temp1=temp;
		for(int i=temp; i>=1;i--) {
			if(isPrimeNumber(i)) {
			System.out.print("Nearest Prime Number :" + i);
			break;
			} else {
				continue;
			}			
		}
		
		return nearestlow;		
	}
	public int returnNearestPrimeNumber1(int value){
		int temp=value+1;
		int nearestlow=0;
		int temp1=temp;
		for(int i=temp; ;i++) {
			if(isPrimeNumber(i)) {
			System.out.println("Nearest High Prime Number :" + i);
			break;
			} else {
				continue;
			}			
		}
		return nearestlow;		
	}
	
	public boolean isPrimeNumber(int value) {
		boolean flag=false;
		for(int i=2; i<value/2;i++) {
			if(value%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			return true;
		} else { 
			return false;
		}
		
	}

}
