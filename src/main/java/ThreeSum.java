import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0;i<nums.length-2;i++){
            for (int j=i+1; j<nums.length-1;j++){
                for (int k=j+2;k< nums.length;k++){
                    if (nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list= Arrays.asList(nums[i],nums[j],nums[k]);
                        result.add(list);
                        while (j < n - 1 && nums[j] == nums[j + 1])
                            j++;
                        while (k < n - 1 && nums[k] == nums[k + 1])
                            k++;
                    }
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] in= {-1,0,1,2,-1,-4};

    }
}
