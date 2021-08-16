package LeetCode_Practices;
import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ArraryProgram {

	public static void main(String[] args) {
		
		int[] expenses={2200,2350,2130,2600,2190};
		LinkedList<String> list= new LinkedList<String>();
		list.add("spider man");
		list.add("thor");
		list.add("hulk");
		list.add("icon man");
		list.add("captain america");
				
		for (int i : expenses) {
			System.out.println("Expenses :" + i);
		}		
		list.add("black panther");
		list.remove("black panther");		
		list.add(3, "black panther");
		
		System.out.println("Heros :" +list);
		
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		LinkedList<Integer> listodd= new LinkedList<Integer>();
				
		for(int i=1; i<=a;i++) {
			if(i%2!=0) {
				listodd.add(i);
			}
		}
		
		System.out.println("List of Odds :" + listodd);
	}

}
