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

		//JLabel label = new JLabel("홍길동");
		// //label.setText("홍길동");
		//c.add(label);
		//c.setBackground(Color.yellow);
		//c.add(new JLabel("OK1"));
		//c.add(new JLabel("OK2"));
		//c.add(new JLabel("OK3"));
		
		ImageIcon icon = new ImageIcon("C:/Users/NT767/Desktop/2학년 1학기/2 자바기반응용프로그래밍/Inha.png");
		JLabel imgLabel = new JLabel(icon);
		c.add(imgLabel);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int dateNum = cal.get(Calendar.DAY_OF_WEEK);
		String date="없음";
		switch(dateNum) {
		case 1:date="일";
		break;
		case 2:date="월";
		break;
		case 3:date="화";
		break;
		case 4:date="수";
		break;
		case 5:date="목";
		break;
		case 6:date="금";
		break;
		case 7:date="토";
		break;
		}
		
		JLabel txtLabel = new JLabel("날짜:");
		c.add(txtLabel);
		c.add(new JTextField(year + "-" + month + "-" + day + "-" + date,8));
		c.add(new JLabel("시간:"));
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
