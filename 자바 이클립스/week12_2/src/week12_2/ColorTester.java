package week12_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ColorFrame extends JFrame{
	JButton button = new JButton("OK");
	ColorFrame() {
		// TODO Auto-generated constructor stub
		setTitle("Event Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		getContentPane().add(button);
		button.setBackground(Color.green);
		setVisible(true);
		button.addActionListener(new ActionListener() {
			boolean flag = true;
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					button.setText("»Æ¿Œ");
					button.setBackground(Color.yellow);
				}
				else {
					button.setText("OK");
					button.setBackground(Color.green);
				}
				flag = !flag;
			}
		});
	}
}

public class ColorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new ColorFrame();
	}

}
