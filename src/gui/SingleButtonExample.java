package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SingleButtonExample extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new SingleButtonExample();
	}

	SingleButtonExample() {
		JButton button = new JButton("ボタン");

		button.addActionListener(this);
		getContentPane().add(button);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 300);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ボタンが押されました");
	}

}
