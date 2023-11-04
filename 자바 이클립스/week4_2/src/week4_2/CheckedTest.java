package week4_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedTest {
//	static void someFunction() {
//		try {
//			FileWriter fw = new FileWriter("log.txt");
//			fw.write("Hello, World");
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	static void someFunction() throws IOException{
		FileWriter fw = new FileWriter("z://log.txt");
		fw.write("Hello, World");
		fw.close();
	}
	public static void main(String[] args) {
		
	
		try {
			someFunction();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
