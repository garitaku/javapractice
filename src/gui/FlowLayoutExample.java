package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample extends JFrame {
	public static void main(String[] args) {
		new FlowLayoutExample();
	}

	FlowLayoutExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		getContentPane().setLayout(new FlowLayout());
//		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		getContentPane().setLayout(new GridLayout(4, 3));
		getContentPane().add(new JButton("1 January"));
		getContentPane().add(new JButton("2 February"));
		getContentPane().add(new JButton("3 March"));
		getContentPane().add(new JButton("4 April"));
		getContentPane().add(new JButton("5 May"));
		getContentPane().add(new JButton("6 June"));
		getContentPane().add(new JButton("7 July"));
		getContentPane().add(new JButton("8 August"));
		getContentPane().add(new JButton("9 September"));
		getContentPane().add(new JButton("10 October"));
		getContentPane().add(new JButton("11 November"));
		getContentPane().add(new JButton("12 December"));

		setSize(300, 200);
		setVisible(true);
	}
}
