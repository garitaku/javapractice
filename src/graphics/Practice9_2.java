package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class PracticePanel extends JPanel {
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.setColor(Color.black);
		g.fillRect(d.width / 2, d.height / 2, d.width / 2, d.height / 2);
	}
}

public class Practice9_2 extends JFrame {

	public static void main(String[] args) {
		new Practice9_2();
	}

	Practice9_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new PracticePanel());
		setSize(1000, 1000);
		setVisible(true);
	}

}
