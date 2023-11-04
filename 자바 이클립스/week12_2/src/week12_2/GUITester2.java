package week12_2;

import java.awt.*;
import javax.swing.*;

import java.util.Calendar;

class MyFrame2 extends JFrame{
	MyFrame2(){
		setSize(300,300);
		setTitle("My first Frame");
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,50,10));
		c.add(new JLabel("OK1"));
		c.add(new JLabel("OK2"));
		c.add(new JLabel("OK3"));
		c.add(new JLabel("OK4"));
		c.add(new JLabel("OK5"));
		
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(new JButton("B1"),BorderLayout.EAST);
		p.add(new JButton("B2"),BorderLayout.WEST);
		p.add(new JButton("B3"),BorderLayout.CENTER);
		p.add(new JButton("B4"),BorderLayout.NORTH);
		p.add(new JButton("B5"),BorderLayout.SOUTH);
		//setContentPane(p);
		
		JPanel g = new JPanel();
		g.setLayout(new GridLayout(2,4));
		g.add(new JButton("B1"));
		g.add(new JButton("B2"));
		g.add(new JButton("B3"));
		g.add(new JButton("B4"));
		g.add(new JButton("B5"));
		g.add(new JButton("B6"));
		g.add(new JButton("B7"));
		g.add(new JButton("B8"));
		//setContentPane(g);
		
		JPanel n = new JPanel();
		String os = System.getProperty("os.name");
		String arch = System.getProperty("os.arch");
		String user = System.getProperty("user.name");
		int cp = Runtime.getRuntime().availableProcessors();
		long m = Runtime.getRuntime().totalMemory();
		
		n.setLayout(new GridLayout(5,2,10,10));
		JLabel osTxt = new JLabel("OS:");
		n.add(osTxt);
		n.add(new JTextField(os));
		n.add(new JLabel("ARCH:"));
		n.add(new JTextField(arch));
		n.add(new JLabel("USER:"));
		n.add(new JTextField(user));
		n.add(new JLabel("CPU:"));
		n.add(new JTextField(""+cp));
		n.add(new JLabel("MEM:"));
		n.add(new JTextField(""+m));
		//setContentPane(n);
		c.add(p);
		c.add(g);
		setVisible(true);
	}
}

public class GUITester2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new MyFrame2();
	}

}
