package LeetCode_Practices;

import java.util.HashMap;
import java.util.Map;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

public class RomantoInteger {

	public static void main(String[] args) {
		Map<Character,Integer> map= new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int total=0;
		String str="IV";
		for(int i=0; i<str.length()-1;i++) {
			if(map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
				total-= map.get(str.charAt(i));
			} else {
		       total+= map.get(str.charAt(i));
		}
		}
		total += map.get(str.charAt(str.length()-1));
		System.out.print("Numerical Format "+ total);
	}

}
