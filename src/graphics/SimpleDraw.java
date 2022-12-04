package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel3 extends JPanel implements MouseListener, MouseMotionListener {
	public MyPanel3() {
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.white);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		Graphics g = getGraphics();
		g.setColor(Color.black);
		g.fillOval(e.getX() - 2, e.getY() - 2, 5, 5);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		Graphics g = getGraphics();
//		g.setColor(Color.black);//色を黒にする
		g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
		g.fillRect(e.getX() - 5, e.getY() - 5, 10, 10);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}
}

public class SimpleDraw extends JFrame {
	public static void main(String[] args) {
		new SimpleDraw();
	}

	SimpleDraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel3());
		setSize(1000, 1000);
		setVisible(true);
	}
}
