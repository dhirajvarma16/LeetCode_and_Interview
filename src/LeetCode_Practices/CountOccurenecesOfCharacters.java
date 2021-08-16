package LeetCode_Practices;

/*String str = "wwwwaadww"
o/p = w4a2d1w2*/
public class CountOccurenecesOfCharacters {
	
	public static void main(String[] args) {
		String str = "wwwwaadww";
		CountOccurenecesOfCharacters coc=new CountOccurenecesOfCharacters();
		System.out.print("Count of Characters "+coc.countOccuerenceOfCharacters(str));
	}	
	public StringBuilder countOccuerenceOfCharacters(String str) {
		char[] ch=str.toCharArray();
		int count=1;
		StringBuilder str2= new StringBuilder();
		int i=0;
		   try {
			for(i=0; i <= ch.length; ++i) {				
				if(ch[i]==ch[i+1]) {
					count++;
				} else {
				str2.append(ch[i]);
				str2.append(count);
				count=1;
				}
				
			}
			} catch (ArrayIndexOutOfBoundsException e) {
				if(ch[i]==ch[ch.length-1]) {
					str2.append(ch[i]);
					str2.append(count);		
					
				}
			}
		return str2;		
	}

}
