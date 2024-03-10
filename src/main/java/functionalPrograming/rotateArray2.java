package functionalPrograming;


public class rotateArray2 {

    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7};
        int rotatationCount=0;
        int k=3;
        int n = arr.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            int a = (i + k) % n; // Corrected the rotation logic
            temp[a] = arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]= temp[i];
        }

        for (int printArray:arr) {
            System.out.println(printArray);
        }

    }
}
