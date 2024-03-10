package functionalPrograming;

public class rotateArray3 {
    public void rotate(int[] nums, int k) {
        int a,b,c;
        for(int i=0; i < k ;i++)
        {
            c=nums[nums.length-i];
            for (int g=0;g<nums.length-1;i++)
            {
                a=nums[g];
                b=nums[nums.length-g];
                nums[g]=b;
                nums[(nums.length-1)-g]=a;
            }
        }
        for(int j=0; j < nums.length-1;j++){
            System.out.println(nums[j]);
        }
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotateArray3 rotateArray= new rotateArray3();
        rotateArray.rotate(nums,k);
    }
}
