package week13_subject;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.*;
class MyCalculator extends JFrame implements ActionListener{
	JTextField txt = new JTextField(20); JTextField fomula = new JTextField(20);
	JPanel panel = new JPanel(); JButton btnPlus = new JButton("+");
	JButton btnMinus = new JButton("-"); JButton btnMultiple = new JButton("*");
	JButton btnDivide = new JButton("/"); JButton btnEqual = new JButton("=");
	JButton btnDelete = new JButton("del"); JButton btnReset = new JButton("C");
	JButton btnReverse = new JButton("1/x"); JButton btnSquare = new JButton("x^2");
	JButton btnSquareRoot = new JButton("x^1/2");
	LinkedList<Double> arg = new LinkedList<Double>();
	LinkedList<String> operator = new LinkedList<String>();
	public void btnOper(JButton e, String strOper) {
		e.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals("")) {return;}
				arg.add(Double.parseDouble(txt.getText()));
				operator.add(strOper); txt.setText(""); printFomula();
			}});}
	public void btnChange(JButton e) {
		e.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				String t = e.getActionCommand();
				if(strArg.equals("")) {return;}
				Double val = Double.parseDouble(strArg);
				if(t.equals(btnReverse.getText())) {val=1/val;}
				else if(t.equals(btnSquare.getText())) {val=Math.pow(val, 2);}
				else if(t.equals(btnSquareRoot.getText())) {val=Math.sqrt(val);}
				txt.setText(val.toString());
			}});}
	public void printFomula() {
		StringBuffer str = new StringBuffer();
		for(int i=0;i<operator.size();i++) {
			str.append(arg.get(i).toString());
			str.append(operator.get(i).toString());}
		fomula.setText(str.toString());
	}
	public MyCalculator() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(fomula,BorderLayout.NORTH);
		add(txt,BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5,4));
		add(panel,BorderLayout.SOUTH);
		panel.add(btnReverse);
		panel.add(btnSquare);
		panel.add(btnSquareRoot);
		panel.add(btnDivide);
		for(int i = 1;i<10;i++) {
			JButton btn = new JButton(""+i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100,50)); panel.add(btn);
			if(i==3) {panel.add(btnMultiple);}
			if(i==6) {panel.add(btnMinus);}
			if(i==9) {panel.add(btnPlus);}
		}
		JButton btnZero=new JButton(""+0);
		btnZero.addActionListener(this);
		btnZero.setPreferredSize(new Dimension(100,50));
		panel.add(btnZero); panel.add(btnReset); panel.add(btnDelete);
		panel.add(btnEqual); pack(); setResizable(false); setVisible(true);
		btnOper(btnPlus,btnPlus.getText()); btnOper(btnMinus,btnMinus.getText());
		btnOper(btnMultiple,btnMultiple.getText());
		btnOper(btnDivide,btnDivide.getText()); btnChange(btnReverse);
		btnChange(btnSquare); btnChange(btnSquareRoot);
		btnDelete.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals("")) {return;}
				String fixedStr = strArg.substring(0, strArg.length()-1);
				txt.setText(fixedStr);			
			}});
		btnReset.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				txt.setText(""); arg.clear(); operator.clear();
				fomula.setText("");
			}});
		btnEqual.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals("")) {return;}
				arg.add(Double.parseDouble(txt.getText()));
				fomula.setText(fomula.getText()+strArg);
				for(int i = 0;i<operator.size();i++) {
					if(operator.size()==0) {break;}
					if(operator.get(i).equals("*")) {
						Double val = arg.get(i)*arg.get(i+1);
						arg.remove(i+1); arg.set(i, val);
						operator.remove(i); i-=1;}
					else if(operator.get(i).equals("/")) {
						Double val = arg.get(i)/arg.get(i+1);
						arg.remove(i+1); arg.set(i, val);
						operator.remove(i); i-=1;}}
				while(true) {
					if(operator.isEmpty()) {break;}
					if(operator.get(0).equals("+")) {
						Double val = arg.get(0)+arg.get(1);
						arg.remove(1); arg.set(0, val);
						operator.remove(0);}
					else if(operator.get(0).equals("-")) {
						Double val = arg.get(0)-arg.get(1);
						arg.remove(1); arg.set(0, val);
						operator.remove(0);}}
				txt.setText(""+arg.get(0)); arg.clear();}});}
	public void actionPerformed(ActionEvent e) {
		String numTxt = e.getActionCommand();
		txt.setText(txt.getText()+numTxt);}}
public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("12211628 / ¹èÁØÇõ");
		MyCalculator frame = new MyCalculator();}}
