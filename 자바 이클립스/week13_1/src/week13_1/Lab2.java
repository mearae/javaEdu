package week13_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class IconMovingFrame extends JFrame{
	ImageIcon icon = new ImageIcon("C:/Users/NT767/Desktop/2학년 1학기/2 자바기반응용프로그래밍/Inha.png");
	JLabel target = new JLabel(icon);
	JButton up = new JButton("up");
	JButton down = new JButton("down");
	JButton left = new JButton("left");
	JButton right = new JButton("right");
	public IconMovingFrame() {
		// TODO Auto-generated constructor stub
		setTitle("Lab2-아이콘 움직이기");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setSize(new Dimension(500, 50));
		p.add(left);
		p.add(right);
		p.add(up);
		p.add(down);
		p.setBackground(Color.yellow);
		
		c.add(p, BorderLayout.NORTH);
		c.add(target, BorderLayout.CENTER);
		c.setBackground(Color.cyan);
		
		up.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Point curLocation =target.getLocation();
				target.setLocation(curLocation.x,curLocation.y-10);
			}
		});
		down.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Point curLocation =target.getLocation();
				target.setLocation(curLocation.x,curLocation.y-10);
			}
		});
		left.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Point curLocation =target.getLocation();
				target.setLocation(curLocation.x-10,curLocation.y);
			}
		});
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Point curLocation =target.getLocation();
				target.setLocation(curLocation.x+10,curLocation.y);
			}
		});
	}
	
}

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IconMovingFrame();
	}

}
