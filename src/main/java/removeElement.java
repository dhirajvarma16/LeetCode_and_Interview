import java.util.Arrays;

public class removeElement {

    public static int removeElementVal(int[] nums,int val){
       int[] result = Arrays.stream(nums).filter(num -> num!=val).toArray();
       System.arraycopy(result,0,nums,0,result.length);
       return result.length;
    }


    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        int val=3;
        System.out.println(removeElementVal(arr,val));
        System.out.println(Arrays.toString(arr));
    }
}
