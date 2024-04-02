package functionalPrograming;

import java.util.Arrays;

public class removeDupicateElementswithStream {

    public static int duplicateRemoveValue(int[] nums) {
        final int[] j = {0};
        Arrays.stream(nums)
                .distinct()
                .forEach(num -> {
            if (nums[j[0] != num) {
                j[0]++;
                nums[j[0]] = num;
            }
        });
        return j[0] + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        duplicateRemoveValue(arr);
    }
}
