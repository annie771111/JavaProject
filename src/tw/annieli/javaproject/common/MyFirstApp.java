package tw.annieli.javaproject.common;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("hola");
	JFrame jf =new JFrame("title");
	jf.add(new JButton("Don't press me"));
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setSize(150,150);
	jf.setVisible(true);
}
}