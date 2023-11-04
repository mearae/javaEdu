package week5_2;

import java.util.Scanner;
class Book {
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void printBook() {
		System.out.println("(" + this.title + ", " + this.author + ")");
	}
}

public class BookArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book[] bookArray= new Book[2];
		for(int i = 0;i < bookArray.length; i++) {
			String title;
			String author;
			System.out.println("제목>>");
			title = scanner.next();
			System.out.println("저자>>");
			author = scanner.next();
			bookArray[i] = new Book(title,author);
		}
		for(int i = 0;i < bookArray.length; i++) {
			bookArray[i].printBook();
		}
		scanner.close();
	}
}