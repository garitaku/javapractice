package graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel implements MouseListener, MouseMotionListener {
	public MyPanel2() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	static int counter = 0;

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("マウスがドラッグされました" + e.getX() + " " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("マウスが移動しました" + e.getX() + " " + e.getY());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("マウスがクリックされました" + e.getX() + " " + e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("マウスのボタンが押されました");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("マウスのボタンが離されました");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		counter++;
		System.out.println("マウスがパネル内に入りました:" + counter + "回目");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("マウスがパネルの外に出ました");
	}
}

public class MouseEventExample extends JFrame {
	public static void main(String[] args) {
		new MouseEventExample();
	}

	MouseEventExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel2());
		setSize(300, 200);
		setVisible(true);
	}
}
