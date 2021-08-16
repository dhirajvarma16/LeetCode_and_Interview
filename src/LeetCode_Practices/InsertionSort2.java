package LeetCode_Practices;

public class InsertionSort2 {

	public static void main(String[] args) {
		int temp=0;
		int[] arr= {12,45,23,51,19,8};
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j< arr.length-1;j++) {
				if(arr[i]>arr[j+1]) {
					temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}

}
