package week8_Subject;

import java.util.InputMismatchException;
import java.util.Scanner;

class CarList{
	String[] arr= {"1111","2222","1234","9876","9999","8282"};
	String[] name= {"Kim","Park","Jain","John","Umm","Doh"};
	
	boolean numCheck(String i) {
		for(String e : arr) {
			if(e.equals(i)) {
				return true;
			}
		}
		return false;
	}
	
	String findName(String num) {
		for(int i = 0;i<name.length;i++) {
			if(arr[i].equals(num)) {
				return name[i];
			}
		}
		return "";
	}
}

class ParkingPlot{
	CarList list=new CarList();
	String plot[][];
	boolean keep=true;
	
	ParkingPlot(int a,int b){
		plot=new String[a][b];
		System.out.println("배준혁 근무를 시작합니다.");
		for(int i=0;i<plot.length;i++) {
			for(int j=0;j<plot[i].length;j++){
				plot[i][j] = "1";
			}
		}
		System.out.println();
	}		
	
	void place() {
		for(int i=0; i<plot.length; i++) {
			for(int j=0; j<plot[i].length; j++){
				System.out.print("(" + i + ", " + j + ") : ");
				if(plot[i][j]!="1") {
					System.out.print(plot[i][j] + "(" + 
							list.findName(plot[i][j]) + ") ");
				}
				else {
					System.out.print("______ ");
				}
			}
			System.out.println();
		}
		System.out.print("차량 번호를 입력하세요: ");
	}
	
	boolean plotCheck(String car) {
		for(String[] e : plot) {
			for(String e2 : e){
				if(e2.equals(car)) {
					return true;
				}
			}
		}
		return false;
	}
	
	void out(String num) {
		for(int i=0;i<plot.length;i++) {
			for(int j=0;j<plot[i].length;j++){
				if(plot[i][j].equals(num)) {
					System.out.println("차주 " + list.findName(num) + 
							", " + num + " 번 차량 출차했습니다.");
					plot[i][j] = "1";
					return;
				}
			}
		}
	}
	
	void in(String num) {	
		for(int i=0;i<plot.length;i++) {
			for(int j=0;j<plot[i].length;j++){
				if(plot[i][j].equals("1")) {
					System.out.println(num + " 번 차량 (" + i + ", " + j + 
							")에 주차했습니다.");
					plot[i][j]=num;
					return;
				}
			}
		}
	}
	
	void carCheck(String num) {
		if(num.equals("퇴근")) {
			System.out.println("배준혁 퇴근합니다. ");
			keep=false;
			return;
		}

		for(int i=0;i<num.length();i++) {
			if(num.charAt(i) < '0' || num.charAt(i) > '9') {
				System.out.println();
				System.out.println("네 자리 수를 입력하십시오.");
				return;
			}
		}
		if(num.length()!=4) {
			System.out.println();
			System.out.println("네 자리 수를 입력하십시오.");
			return;
		}
		
		if(plotCheck(num)) {
			out(num);
		}
		else if(!plotCheck("1")) {
			System.out.println("만차입니다. ");
		}
		else if(!list.numCheck(num)) {
			System.out.println("등록되지 않은 차량입니다. ");
		}
		else {
			in(num);
		}
		System.out.println();
	}
}

public class CarParking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배준혁(12211628)");
		int a,b=0;
		while(true) {
			try {
				System.out.print("주차장 크기(행과 열)를 입력하세요: ");
				a=scanner.nextInt();
				b=scanner.nextInt();
				scanner.nextLine();
				if(a==0||b==0) {
					System.out.println();
					System.out.println("0보다 큰 수를 입력하십시오. ");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println();
				System.out.println("숫자를 입력해주십시오.");
				scanner.nextLine();
				a=0;
				b=0;
				continue;
			}
		}
		ParkingPlot workPlace=new ParkingPlot(a,b);
		while(workPlace.keep) {
			workPlace.place();
			String fourNum=scanner.nextLine();
			fourNum=fourNum.trim();
			workPlace.carCheck(fourNum);
		}
		scanner.close();
	}
}
