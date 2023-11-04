package week13_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextAreaFrame extends JFrame{
	JLabel la = new JLabel("입력 후 엔터키를 입력하시오");
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(6,20);
	JTextArea ta2 = new JTextArea(6,20);
	JTextArea ta3 = new JTextArea(6,20);
	Container c;
	TextAreaFrame(){
		setBounds(100,100,300,500);
		setTitle("Text Area Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.add(tf);
		c.add(new JScrollPane(ta));
		c.add(new JScrollPane(ta2));
		c.add(new JScrollPane(ta3));
				
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x,y);
			}
		});
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append(tf.getText()+"\n");
			}
		});
		
		tf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				ta2.append(tf.getText()+"\n");
			}
		});
		
		tf.setFocusable(true);
		tf.requestFocus();
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("keyTyped");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("keyReleased");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("keyPressed");
				
				char c = e.getKeyChar();
				int x = e.getKeyCode();
				String s = KeyEvent.getKeyText(x);
				
				if(c=='%') {
					TextAreaFrame.this.c.setBackground(Color.yellow);
				} else if(x==KeyEvent.VK_F1) {
					TextAreaFrame.this.c.setBackground(Color.green);
				}
				//System.out.println("Char:"+ c+" Code:"+x+" Test:"+ s);
			}
		});
		
		setVisible(true);
	}
}

public class JTestAreaTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaFrame();
	}

}
