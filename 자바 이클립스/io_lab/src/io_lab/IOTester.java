package io_lab;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import javax.annotation.processing.Filer;

public class IOTester {
	static void binCopy() {
		String src = "c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg";
		String des = "CopyImg.jpg";
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(des);
			int c;
			while((c=fis.read())!=-1) {
				fos.write(c);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void binRead() {
		try {
			FileInputStream fis = new FileInputStream("test.out");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(fis.read());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			fis.close();
			dis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void binWrite() {
		try {
			byte [] buf= {1,2,3,4,5,6,7,8};
			FileOutputStream fos = new FileOutputStream("test.out");
			for(int i =0;i<buf.length;i++) {
				fos.write(buf[i]);
			}
			fos.close();
			
			FileOutputStream out = new FileOutputStream("test.out");
			DataOutputStream fos2 = new DataOutputStream(out);
			fos2.write(2);
			fos2.writeDouble(3.14);
			fos2.writeUTF("안녕하세요");
			fos2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void fileCopy() {
		try {
			FileReader fin = new FileReader("c:\\windows\\system.ini");
			Scanner sc =new Scanner(fin);
			FileWriter fout = new FileWriter("test2.txt");
			int lineNumber = 1;
			while(sc.hasNext()) {
				String line = sc.nextLine();
				fout.write(String.format("%3d %s \n", lineNumber,line));
				System.out.printf("%3d %s \n",lineNumber,line);
				lineNumber++;
			}
			sc.close();
			fin.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void fileWriter() {
		//바이트 단위 : 바이트스트림 FileOutputStream
		//문자 단위 : 문자스트림 FileWriter
		//+ 필터 스트림 : BufferedInputStream, DataInputStream ...
		try {
			FileOutputStream fout = new FileOutputStream("test2.txt");
			fout.write('자');
			fout.close();
			
			FileOutputStream out = new FileOutputStream("test2.txt");
			OutputStreamWriter fout2 = new OutputStreamWriter(out);
			fout2.write("자바 기반 프로그래밍");
			fout2.close();
			
			FileWriter fout3 = new FileWriter("test2.txt");
			fout3.write('사');
			String str = "자바 기반 응용프로그래밍!!!";
			fout3.write(str,1,str.length()-1);
			fout3.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void fileRead() {	// 입력스트림
		//바이트 단위 : 바이트스트림 FileInputStream
		//문자 단위 : 문자스트림 FileReader
		//+ 필터 스트림 : BufferedInputStream, DataInputStream ...
		try {
			//바이트 스트림으로 읽고 출력
			FileInputStream fin = new FileInputStream("test.txt");
			int c;
			while((c=fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
			//바이트 스트림으로 읽고 문자로 변환 후 출력
			System.out.println();
			FileInputStream in = new FileInputStream("test.txt");
			InputStreamReader fin2 = new InputStreamReader(in);
			while((c=fin2.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin2.close();
			
			System.out.println();
			FileReader fin3 = new FileReader("test.txt");
			while((c=fin3.read()) != -1) {
				System.out.print((char)c);
			}
			fin3.close();
			
			//파일을 버퍼 단위로 읽어서 출력
			System.out.println();
			char[] buf = new char[256];
			FileReader fin4 = new FileReader("test.txt");
			fin4.read(buf);
			System.out.println(buf);
			fin4.close();
			
			System.out.println();
			FileReader r = new FileReader("test.txt");
			Scanner sc = new Scanner(r);
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			//BufferedReader fin5 = new BufferedReader(r);
			//System.out.println(fin5.readLine());
			//System.out.println(fin5.readLine());
			//fin5.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fileRead();
		//fileWriter();
		//fileCopy();
		binWrite();
		binRead();
		binCopy();
	}

}
