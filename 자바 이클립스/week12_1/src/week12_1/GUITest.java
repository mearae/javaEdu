package week12_1;

import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

class MyFrame extends JFrame {
	MyFrame(){
		setSize(500, 500);
		//setLocation(500, 500);
		setTitle("My First Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();	//Default : BorderLayout
		c.setLayout(new FlowLayout());
		//c.setComponentOrientation(getComponentOrientation().RIGHT_TO_LEFT);

		//JLabel label = new JLabel("ȫ�浿");
		// //label.setText("ȫ�浿");
		//c.add(label);
		//c.setBackground(Color.yellow);
		//c.add(new JLabel("OK1"));
		//c.add(new JLabel("OK2"));
		//c.add(new JLabel("OK3"));
		
		ImageIcon icon = new ImageIcon("C:/Users/NT767/Desktop/2�г� 1�б�/2 �ڹٱ���������α׷���/Inha.png");
		JLabel imgLabel = new JLabel(icon);
		c.add(imgLabel);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int dateNum = cal.get(Calendar.DAY_OF_WEEK);
		String date="����";
		switch(dateNum) {
		case 1:date="��";
		break;
		case 2:date="��";
		break;
		case 3:date="ȭ";
		break;
		case 4:date="��";
		break;
		case 5:date="��";
		break;
		case 6:date="��";
		break;
		case 7:date="��";
		break;
		}
		
		JLabel txtLabel = new JLabel("��¥:");
		c.add(txtLabel);
		c.add(new JTextField(year + "-" + month + "-" + day + "-" + date,8));
		c.add(new JLabel("�ð�:"));
		c.add(new JTextField(hour+":"+minute));
		//txtLabel.setForeground(Color.blue);
		//txtLabel.setOpaque(true);
		//txtLabel.setBackground(Color.gray);

		setVisible(true);
	}
}

public class GUITest {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new MyFrame();
		//int cnt = 0;
		//while(cnt < 5) {
		//	Thread.sleep(2000);
		//	frame.setVisible(true);
		//	cnt++;
		//}
		//System.exit(0);	
	}
}
