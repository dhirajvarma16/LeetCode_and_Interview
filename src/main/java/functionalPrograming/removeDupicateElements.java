package functionalPrograming;

import java.util.Arrays;

public class removeDupicateElements {

    public static int duplicateRemoveValue(int[] nums, int remVal){

        int[] result= Arrays.stream(nums).filter(num->num != remVal).toArray();
        System.arraycopy(result,0,nums,0,result.length);
        System.out.println(Arrays.toString(result));
        return result.length;
    }

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int removeVal=1;
        duplicateRemoveValue(arr,removeVal);
    }
}
