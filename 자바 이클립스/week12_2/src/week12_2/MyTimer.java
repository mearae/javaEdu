package week12_2;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyTimerThread extends Thread{
	JLabel label = new JLabel();
	public MyTimerThread() {
		JFrame frame =new JFrame();
		frame.setTitle("My Timer");
		frame.setSize(300,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Container c = frame.getContentPane();
		c.add(label);
		
		frame.setVisible(true);
	}
	public void run() {
		long currentMillis = System.currentTimeMillis();
		while(true) {
			long elapsed = System.currentTimeMillis() - currentMillis;
			long ms,sec,min;
		
			ms=elapsed % 1000;
			sec=elapsed / 1000 % 60;
			min=elapsed / 1000 / 60;
			label.setFont(new Font("∞ÌµÒ√º",0,40));
			label.setText(String.format("%02d:%02d:%03d",min,sec,ms));
		}
	}
}

public class MyTimer {
	public static void main(String[] args) {
		MyTimerThread thread = new MyTimerThread();
		thread.start();
	}
}
