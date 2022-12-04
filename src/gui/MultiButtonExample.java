package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiButtonExample extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new MultiButtonExample();
	}

	JButton button1;
	JButton button2;

	MultiButtonExample() {
		button1 = new JButton("ボタン1");
		button2 = new JButton("ボタン2");

		button1.addActionListener(this);
		button2.addActionListener(this);

		getContentPane().add(BorderLayout.WEST, button1);
		getContentPane().add(BorderLayout.EAST, button2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if (e.getSource() == button1) {
			System.out.println("ボタン1が押されました");
		} else if (e.getSource() == button2) {
			System.out.println("ボタン2が押されました");
		}
	}

}
