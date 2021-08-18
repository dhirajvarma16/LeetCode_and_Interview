package LeetCode_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SearchInsert {

	public static void main(String[] args) {
		
		int[] arr1= {1,3,5,6};
	
		int value=7;
		
		SearchInsert searchInsert=new SearchInsert();
		searchInsert.searchInsert(arr1, value);
	}
	
	public int searchInsert(int[] nums, int target) {
		int k=0;
		List<Integer> arr= Arrays
				             .stream(nums).boxed().collect(Collectors.toList());
		
    	if(arr.contains(target)) {
    		return arr.indexOf(target);
    	} else {
    		for(int i=0; i< nums.length;i++) {
    		 if(arr.get(i)<target) {
    		  k++;
    		  continue;    	
    		 }    		
    		}
    	return k;
    	}    
		
    }

}
