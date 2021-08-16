package LeetCode_Practices;

public class BrinarySearchImpl {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10,12,14,16};
		int val=2;
		BrinarySearchImpl brinarySearchImpl= new BrinarySearchImpl();
		System.err.print("Value is present : " + brinarySearchImpl.isPresentByBinarySearch(arr, val));
	}
	
	public boolean isPresentByBinarySearch(int[] arr, int val){
		int start=0, last=arr.length;
		int midindex= 1;
		
		while(arr[midindex]!=val) {			
			midindex= (start+last)/2;			
			if(arr[midindex]>val) 
			{
			 last=midindex;				
			} else if(arr[midindex]<val) {
				start=midindex;				
			} else if(midindex==1 && arr[midindex-1]==val) {
				return true;
			} else if(arr[midindex]==val){
				return true;
			}
		}
		return false;
	}

}
