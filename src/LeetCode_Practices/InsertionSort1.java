package LeetCode_Practices;

//Insertion sort in Java

import java.util.Arrays;

public class InsertionSort1{

void insertionSort1(int array[]) {
 int size = array.length;

 for (int i = 1; i < size; i++) {
   int key = array[i];
   int j = i - 1;
   while (j >= 0 && key < array[j]) {
     array[j + 1] = array[j];
     --j;
   }
   array[j + 1] = key;
 }
}
public static void main(String args[]) {
 int[] data = { 12,45,23,51,19,8 };
 InsertionSort1 is = new InsertionSort1();
 is.insertionSort1(data);
 System.out.println("Sorted Array in Ascending Order: ");
 System.out.println(Arrays.toString(data));
}
}