package week8_2;

class RRNChecker{
	final int[] w = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5}; 
	
	boolean validateRRN(String rrn) {
		rrn = rrn.replace("-", "");
		int checksum = 0;
		for(int i = 0; i < w.length;i++) {
			int n = rrn.charAt(i) - 48; 
			checksum += n*w[i];
		}
		int checkNum = (11 - (checksum%11))%11;
		int validateNum = rrn.charAt(12)-48;
		if(checkNum == validateNum) {
			System.out.println("유효함");
			return true;
		}
		System.out.println("유효하지 않음");
		return false;
	}
	
	boolean verifyLength(String rrn) {
		int length=rrn.length();
		if(length==14) {
			System.out.println("길이 확인");
			return true;
		}
		System.out.println("길이 오류");
		return false;
	}
	
	boolean verifyNumeric(String rrn) {
		rrn=rrn.replace("-", "");
		int i=0;
		for(i=0;i<rrn.length();i++) {
			char c=rrn.charAt(i);
			if(c<'0'||c>'9')
				return false;
		}
		System.out.println("숫자 확인");
		return true;
	}
	
	String[] getSubRRN(String rrn) {
		if(rrn.contains("-") != true){
			System.out.println();
			return null;
		}
		String [] subRRN = rrn.split("-"); // 문자열 분리
		for (int i=0; i<subRRN.length; i++)
			System.out.println("분리" + i + ": " + subRRN[i]);
		return subRRN;
	}
	
	String printGender(String subRRN) {
		char gender = subRRN.charAt(0);
		switch(gender) {
			case '1':
			case '3':
			case '5':
			case '9':
				System.out.println("남성입니다.");
				return "M";
		}
		System.out.println("여성입니다.");
		return "F";
		}
}

public class StringTest {
	static String rrn=" 010814-3114515 ";
	public static void main(String[] args) {
		RRNChecker checker = new RRNChecker();
		rrn=rrn.trim();
		checker.verifyLength(rrn);
		checker.verifyNumeric(rrn);
		String [] subs = checker.getSubRRN(rrn);
		checker.printGender(subs[1]);
		checker.validateRRN(rrn);
	}
}
