package week4_subject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class UpDownGame {
	
	public static void main(String[] args) {
		int answer = 0;
		boolean correct = false;
		boolean keep = true;
		int gameNumber = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter("log.txt");
			fw.write("학번: 12211628 이름: 배준혁\n");
			System.out.println("학번: 12211628 이름: 배준혁");
			System.out.println("Guess what(1~100)!");
			while(keep) {
				int randomNumber = (int) (Math.random() * 99) + 1;
				int count = 1;
				while(!correct) {
					System.out.print("Input>");
					try {
						answer = scanner.nextInt();
					} catch (InputMismatchException e) {
						scanner.nextLine();
						answer = 0;
						System.out.println("정수를 입력하세요!");
						continue;
					}
					if(answer > randomNumber) {
						System.out.println("DOWN");
						count++;
					}
					else if(answer < randomNumber) {
						System.out.println("UP");
						count++;
					}
					else {
						System.out.println("정답!! " + count + "번만에 맞춤!");
						correct = true;
						fw.write("게임번호 " + gameNumber + " : 정답 " + count + "번 만에 맞춤\n" );
					}
				}
				System.out.print("다시하겠습니까(y/n)>");
				String YN = scanner.next();
				if(YN.equals("n")) {
					keep = false;
				}
				correct = false;
				gameNumber++;
				continue;
			}
			fw.close();
		}
		catch(IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
		scanner.close();
	}
}
