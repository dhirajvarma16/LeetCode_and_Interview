package LeetCode_Practices;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		

	}
	/*
	 * 1st Approach
	 */
	public int[] twoSum(int[] nums, int target) {
        int i=0,j=0, len=nums.length;
        int[] arr= new int[2];       
        for(i=0; i<=nums.length; i++) {
        	for(j=i+1; j<nums.length-1; j++)
        	{
        		if(nums[i] + nums[j]== target)
        		{
        			arr[i]=i;
        			arr[j]=j;
        		}
        		
        	}
        }
        
        return arr;        
    }
	
	/*
	 * @2nd Approach
	 */
	
	public int[] twoSum2(int[] nums, int target) {
		Map<Integer,Integer> maps= new HashMap<Integer,Integer>();
		int[] arr=new int[2];
		for(int i=0;i<nums.length;i++) 
		{
			if(maps.containsKey(target-nums[i]))
			{
				arr[0]=i;
				arr[1]=maps.get(target-nums[i]);
			}
		maps.put(nums[i], i);	
		}
	return arr;             
    }

}
