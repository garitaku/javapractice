package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class TextFieldExample extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new TextFieldExample();
	}

	JMenuBar menuBar = new JMenuBar();
	JMenu menuFile = new JMenu("ファイル");
	JMenuItem menuOpen = new JMenuItem("開く");
	JMenuItem menuExit = new JMenuItem("終了");
	JTextField textField = new JTextField(20);
	JButton clearButton = new JButton("リセット");
	JButton OKButton = new JButton("OK");

	TextFieldExample() {
		menuFile.add(menuOpen);
		menuFile.add(menuExit);
		menuBar.add(menuFile);
		setJMenuBar(menuBar);
		menuOpen.addActionListener(this);
		menuExit.addActionListener(this);

		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(textField);
		getContentPane().add(clearButton);
		getContentPane().add(OKButton);
		clearButton.addActionListener(this);
		OKButton.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if (e.getSource() == clearButton) {
			textField.setText("");
		} else if (e.getSource() == OKButton) {
			System.out.println("入力された値:" + textField.getText());
		} else if (e.getSource() == menuOpen) {
			System.out.println("開くが選択されました");
		} else if (e.getSource() == menuExit) {
			System.exit(0);
		}

	}
}
