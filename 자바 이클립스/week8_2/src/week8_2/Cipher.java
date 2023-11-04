package week8_2;

public class Cipher {
	public static StringBuffer encrypt(String s, int n) {
		StringBuffer cip = new StringBuffer();
		for(int i=0; i<s.length();i++) {
			char ch =s.charAt(i);
			if(Character.isLowerCase(ch)) {
				ch=(char)((ch-'a'+n)%26+'a');
			}
			else if(Character.isUpperCase(ch)) {
				ch=(char)((ch-'A'+n)%26+'A');				
			}
			cip.append(ch);
		}
		
		return cip;
	}
	
	public static void main(String[] args) {
		System.out.println(encrypt("xyz", 3));
	}
}
