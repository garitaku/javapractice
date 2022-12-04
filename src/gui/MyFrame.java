package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public static void main(String[] args) {
		new MyFrame();
	}

	MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(BorderLayout.CENTER, new JButton("へぇ〜"));
//		getContentPane().add(BorderLayout.WEST, new JButton("へぇ〜"));
//		getContentPane().add(BorderLayout.EAST, new JButton("へぇ〜"));
//		getContentPane().add(BorderLayout.NORTH, new JButton("へぇ〜"));
		getContentPane().add(BorderLayout.SOUTH, new JButton("へぇ〜"));
		setSize(300, 200);
		setVisible(true);
	}
}
