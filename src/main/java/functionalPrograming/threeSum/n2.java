package functionalPrograming.threeSum;

import java.util.*;

//[[-1,-1,2],[-1,0,1]]
public class n2 {

    public List<List<Integer>> threeSumn2(int[] nums){

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i=0; i<nums.length-2;i++){
            int first=nums[i];
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                int sum=first+nums[left]+nums[right];
                if (first+nums[left]+nums[right]==0){
                    result.add(Arrays.asList(first,nums[left],nums[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        int[] in= {-1,0,1,2,-1,-4};

    }
}

