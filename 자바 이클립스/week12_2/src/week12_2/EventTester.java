package week12_2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class CountFrame extends JFrame{
	int i;
	JButton button = new JButton("ī��Ʈ+");
	JButton mbutton = new JButton("ī��Ʈ-");
	JLabel label = new JLabel("ȫ�浿", SwingConstants.CENTER);
	CountFrame() {
		setBounds(100,100,300,200);
		setTitle("Event Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		getContentPane().add(button,BorderLayout.WEST);
		getContentPane().add(mbutton,BorderLayout.EAST);
		getContentPane().add(label,BorderLayout.CENTER);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("ī��Ʈ:"+ ++i);
			}
		});
		
		mbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("ī��Ʈ:"+ --i);
			}
		});
	}
//		button.addActionListener(new MyListener());
//	}
//	
//	class MyListener implements ActionListener{
//		int i;
//		public void actionPerformed(ActionEvent e) {
//			label.setText("ī��Ʈ:"+ i++);
//			CountFrame.this.setTitle("�̺�Ʈâ");
//		}
//	}
}

public class EventTester {
	public static void main(String[] args) {
		JFrame frame = new CountFrame();
	}

}
