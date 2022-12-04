package graphics;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
//		g.fillRect(50, 30, 150, 100);
//		g.setColor(new Color(255, 0, 0));
//		g.drawLine(0, 0, 200, 200);

//		g.setColor(Color.RED);
//		g.fillRect(10, 10, 100, 100);
//		g.setColor(Color.BLUE);
//		g.fillRect(120, 10, 100, 100);
//		g.clearRect(0, 0, 1000, 1000);
////		g.draw3DRect(0, 0, 100, 100, getFocusTraversalKeysEnabled());
//		g.setColor(Color.GREEN);
//		int x[] = { 100, 50, 300 };
//		int y[] = { 50, 100, 100 };
//
////		g.drawPolygon(x, y, 3);
//		g.fillPolygon(x, y, 3);
//		g.setColor(Color.MAGENTA);
//		g.drawString("こんにちは", 100, 100);

		int N = 10;// 円周上の点の数
		int r = 200;// 円の半径
		int[] arrayX = new int[N];// 円周上の点のx座標を格納する配列
		int[] arrayY = new int[N];// 円周上の点のy座標を格納する配列

		// 円周上の点のx,y座標値を計算して配列に格納
		for (int i = 0; i < N; i++) {
			arrayX[i] = (int) (250 + r * Math.cos(2 * Math.PI * i / N));
			arrayY[i] = (int) (250 + r * Math.sin(2 * Math.PI * i / N));
		}

		// 円周上の2点を結ぶ直線を描画
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				g.drawLine(arrayX[i], arrayY[i], arrayX[j], arrayY[j]);
			}
		}
	}
}
