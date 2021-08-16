package LeetCode_Practices;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums= {1,1,1,2,2,5,5,6,7,8};
		RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray= new RemoveDuplicatesfromSortedArray();
		System.out.print(" O/P :->" + removeDuplicatesfromSortedArray.removeDuplicates(nums));
		
		
		
	}
	
	public int removeDuplicates(int[] nums)
    {
        int i=0,j=1,temp;
        if(nums.length==1 ||nums.length==0 )
        {
            return nums.length;
        }
        while(j<nums.length)
           {
              if(nums[i]!=nums[j])
               {
                 i++;
                 nums[i]=nums[j];
               }
            j++;
            }
        
        return i+1;
     }
}
