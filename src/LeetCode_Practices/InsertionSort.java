package LeetCode_Practices;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {12,45,23,51,19,8};
		
		for(int i=1; i< arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(arr[j]>current && j>=0) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1]=current;
		} 
		
		for(int i=0; i< arr.length;i++) {
			System.out.print(" "+ arr[i]);
		}

	}

}
