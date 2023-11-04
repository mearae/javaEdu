package testLab;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.event.*;

class ListMake{
	List<Integer> listEx= new LinkedList<Integer> ();
	ListMake(){
		setList();
	}
	void setList() {
		listEx.add(12);
		listEx.add(93);
		listEx.add(24);
		listEx.add(92);
		listEx.add(35);
	}
}

class Counter{
	public int sum=0;
	public synchronized void plus() {
		while(sum==1000) {
			try {wait();}catch(InterruptedException e){}
		}
		sum++;
		notify();
	}
	public synchronized void minus() {
		while(sum==0) {
			try {wait();}catch(InterruptedException e){}
		}
		sum--;
		notify();
	}
	public void print() {System.out.println(sum);}
}

class add extends Thread{
	Counter c;
	add(Counter d) {
		this.c = d;
	}
	public void run() {
		for(int i=0;i<100000;i++) {
			c.plus();
			//if(i%20000==0) {c.print();}
		}
	}
}
class min extends Thread{
	Counter c;
	min(Counter d) {
		this.c = d;
	}
	public void run() {
		for(int i=0;i<100000;i++) {
			c.minus();
			if(i%20000==0) {c.print();}
		}
	}
}

class MyFrame extends JFrame{
	JLabel label = new JLabel("asdf",SwingConstants.LEFT);
	JTextField text = new JTextField("asdf");
	JButton button = new JButton("press");
	JTextArea textarea = new JTextArea(5,20);
	MyFrame(){
		setSize(500,500);
		setTitle("something");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		Container c = getContentPane();
		c.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
			}
		
		});
}
}
class t3 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print("/");
			try {
				sleep(1000);
			} catch(InterruptedException e){
				return;
			}
		}
	}
}

class t4 <K>{
	K tre;
	K[] tre2;
	K make(){
		System.out.println(tre);
		return tre;
	}
	void make2(K in) {
		tre=in;
	}
	<K> void make3() {
		
	}
	void print() {
		System.out.println("I\'m out");
	}	
}

class t5{
	t4 tt= new t4();
	t5(){
		System.out.println(tt);
		System.out.println(tt.getClass());
		System.out.println(tt.getClass().getName());
		System.out.println(tt.getClass().toString());
		System.out.println(tt.toString());
		System.out.println(tt.getClass().getSuperclass());
	}
}

class t6{
	Integer i=Integer.valueOf(1);
	int n=i.intValue();
	String str = i.toString();
	int dn = Integer.parseInt(str);
}

public class Tester  {
	public static void main(String[] args) throws InterruptedException, IOException{
		new t5();
	}
}
