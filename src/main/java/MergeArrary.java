import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrary {

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int j=0,i=m;j<nums2.length;j++){
//         nums1[i]=nums2[j];
//         i++;
//        }
//        Arrays.sort(nums1);
//    }
//
//    public static void main(String[] args) {
//        int[] num1={1,2,3,0,0,0};
//        int[] num2= {2,5,6};
//        int m=3;
//        int n=3;
//        MergeArrary mergeArrary= new MergeArrary();
//        mergeArrary.merge(num1,m,num2,n);
//    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        final int[] i = {m};
        Arrays.stream(nums2, 0, n).forEach(num -> {
            nums1[i[0]] = num;
            i[0]++;
        });
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]
    }
}
