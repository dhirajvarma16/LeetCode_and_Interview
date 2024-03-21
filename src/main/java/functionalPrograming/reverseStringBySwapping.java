package functionalPrograming;

import java.util.Scanner;

public class reverseStringBySwapping {

   public String reverseStringBySwap(String string){
        char[] ch=string.toCharArray();
        int left=0,right=ch.length-1;
        char chValue;
        while (left<right){
            chValue=ch[left];
            ch[left]=ch[right];
            ch[right]=chValue;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String stringValue= scanner.nextLine();
        System.out.println("Input String :"+ stringValue);

        reverseStringBySwapping reverseStringBySwapping= new reverseStringBySwapping();
        reverseStringBySwapping.reverseStringBySwap(stringValue);

        System.out.println("Reverse String  " + reverseStringBySwapping.reverseStringBySwap(stringValue));
    }
}
