package functionalPrograming;

import java.util.Arrays;

public class removeDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for (int i=1;i < nums.length;i++){
            if(j==1 || nums[i] != nums[j-2]){
                nums[j++]=nums[i];
            }
        }
        return j;

        /*final int[] j = {0};
        Arrays.stream(nums)
                .forEach(num -> {
                    if (j[0] < 2 || nums[j[0] - 2] != num) {
                        nums[j[0]++] = num;
                    }
                });
        return j[0];*/
    }

    public static void main(String[] args) {
        removeDuplicates2 remover = new removeDuplicates2();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int length = remover.removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + length);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, length)));
    }
}
