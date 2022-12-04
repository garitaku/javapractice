package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxExample extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new CheckBoxExample();
	}

	JCheckBox checkBox;

	CheckBoxExample() {
		getContentPane().setLayout(new FlowLayout());
		JButton button = new JButton("OK");
		button.addActionListener(this);
		checkBox = new JCheckBox("チェックボックス");
		checkBox.addActionListener(this);
		getContentPane().add(button);
		getContentPane().add(checkBox);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 80);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if (checkBox.isSelected()) {
			System.out.println("チェックボックスはオンです");
		} else {
			System.out.println("チェックボックスはオフです");
		}
	}

}
