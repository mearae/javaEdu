package week12_2;

import javax.swing.*;
import java.awt.*;

class MyFrame3 extends JFrame {
	MyFrame3(){
		setSize(300, 300);
		setTitle("My first Frame");
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		for(int i = 0; i < 100 ; i ++) {
			JLabel label = new JLabel(i+"");
			label.setBounds(i*12, i*12, 50, 20);
			contentPane.add(label);
		}
		setVisible(true);
	}
}

public class NullLayout {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new MyFrame3();
	}
}