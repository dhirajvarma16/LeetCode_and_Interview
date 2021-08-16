package LeetCode_Practices;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs= {"flower","flow","flight"};
		 StringBuilder sb= new StringBuilder();
			sb=sb.append(strs[0]);
			
			for (String string : strs) {
				 StringBuilder sb2= new StringBuilder();
	            if(sb.length() == 0)  System.out.println("No Prefix :" + sb.toString());
				 int len= sb.length() > string.length() ? string.length(): sb.length();
				for (int i = 0; i < len; i++) {
					if(sb.charAt(i)==string.charAt(i)) {
						sb2.append(sb.charAt(i));
					} else {
						break;
					}
				}
				sb = sb2;
			}
	        System.out.println(" Prefix :" + sb.toString());
	        }
	}


