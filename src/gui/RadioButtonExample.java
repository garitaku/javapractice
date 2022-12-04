package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonExample extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new RadioButtonExample();
	}

	RadioButtonExample() {
		getContentPane().setLayout(new FlowLayout());
		JButton ok = new JButton("OK");
		ok.addActionListener(this);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		getContentPane().add(rb1);
		getContentPane().add(rb2);
		getContentPane().add(rb3);
		getContentPane().add(ok);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 80);
		setVisible(true);

	}

	JRadioButton rb1 = new JRadioButton("ラジオボタン1");
	JRadioButton rb2 = new JRadioButton("ラジオボタン2");
	JRadioButton rb3 = new JRadioButton("ラジオボタン3");

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if (rb1.isSelected()) {
			System.out.println("ラジオボタン1が選択されています");
		}
		if (rb2.isSelected()) {
			System.out.println("ラジオボタン2が選択されています");
		}
		if (rb3.isSelected()) {
			System.out.println("ラジオボタン3が選択されています");
		}
	}
}
