package gui;

import java.awt.BorderLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class ScrollBarExample extends JFrame implements AdjustmentListener {
	public static void main(String[] args) {
		new ScrollBarExample();
	}

	JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL, 50, 5, 0, 105);
	JLabel lb = new JLabel("50", JLabel.CENTER);

	ScrollBarExample() {
		sb.addAdjustmentListener(this);
		getContentPane().add(BorderLayout.NORTH, sb);
		getContentPane().add(BorderLayout.CENTER, lb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 80);
		setVisible(true);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		JScrollBar sb = (JScrollBar) e.getSource();
		lb.setText("" + sb.getValue());
	}

}
