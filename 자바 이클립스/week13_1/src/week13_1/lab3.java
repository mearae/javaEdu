package week13_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class KMToMileFrame extends JFrame {
	JLabel la = new JLabel("Distance in miles");
	JTextField tf = new JTextField(5);
	JButton btn = new JButton("Convert");
	JLabel resultLabel = new JLabel("Result:");
	private final double KMS_PER_MILE = 1.609;
	KMToMileFrame(){
		setBounds(100, 100, 500, 500);
		setTitle("Lab3-단위환산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setSize(500, 50);
		p.add(la);
		p.add(tf);
		p.add(btn);
		p.setBackground(Color.yellow);
		c.add(p, BorderLayout.NORTH);
		c.add(resultLabel, BorderLayout.CENTER);
		c.setBackground(Color.cyan);
		pack(); //안에 내용에 맞게 크기 조정
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText();
				double mile=0;
				try {
					mile = Double.parseDouble(input);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
				}
				resultLabel.setText(""+KMS_PER_MILE*mile);
			}
		});
	}
}

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KMToMileFrame();
	}

}
