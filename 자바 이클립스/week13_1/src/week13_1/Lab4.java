package week13_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class C_and_F_Frame extends JFrame {
	JLabel labelC = new JLabel("섭씨");
	JTextField tfC = new JTextField(5);
	JLabel labelF = new JLabel("화씨");
	JTextField tfF = new JTextField(5);
	JButton btnCF = new JButton("C->F");
	JButton btnFC = new JButton("F->C");
	JButton btnReset = new JButton("Reset");
	C_and_F_Frame(){
		setBounds(100, 100, 500, 500);
		setTitle("Lab4-온도 변환기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setSize(new Dimension(500, 50));
		p.add(labelC);
		p.add(tfC);
		p.add(labelF);
		p.add(tfF);
		p.setBackground(Color.yellow);
		c.add(p, BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setSize(new Dimension(500, 50));
		p2.add(btnCF);
		p2.add(btnFC);
		p2.add(btnReset);
		p2.setBackground(Color.cyan);
		c.add(p2, BorderLayout.CENTER);
		pack();
		
		btnCF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String C=tfC.getText();
				double temperC=0;
				try {
					temperC = Double.parseDouble(C);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "입력에러","경고창",JOptionPane.WARNING_MESSAGE);
				}
				double f= 9/5.0*temperC+32;
				tfF.setText(""+f);
			}
		});
		
		btnFC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String F=tfF.getText();
				double temperF=0;
				try {
					temperF = Double.parseDouble(F);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "입력에러","경고창",JOptionPane.WARNING_MESSAGE);
				}
				double c = 5/9.0*(temperF-32);
				tfC.setText(""+c);
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfC.setText(""+0);
				tfF.setText(""+0);
			}
		});
	}
}

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C_and_F_Frame();
	}

}
