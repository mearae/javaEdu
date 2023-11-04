package week13_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class ColerSelectionFrame extends JFrame{
	JButton red=new JButton("red");
	JButton blue=new JButton("blue");
	JButton green=new JButton("green");
	ColerSelectionFrame(){
		setTitle("Lab1-배경색 바꾸기");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setSize(new Dimension(500,50));
		p.add(red);
		p.add(blue);
		p.add(green);
		p.setBackground(Color.gray);
		
		c.add(p, BorderLayout.NORTH);
		c.setBackground(Color.cyan);
		
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.red);
			}
		});
		blue.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.blue);
			}
		});
		green.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//c.setBackground(Color.green);
				getContentPane().setBackground(Color.green);
			}
		});
	}
}

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColerSelectionFrame m = new ColerSelectionFrame();
	}

}
