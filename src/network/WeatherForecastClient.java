package network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WeatherForecastClient extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new WeatherForecastClient();
	}

	JTextArea textArea = new JTextArea(5, 20);
	JButton button = new JButton("予報を取得する");

	WeatherForecastClient() {
		setTitle("天気予報受信クライアント");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane sp = new JScrollPane(textArea);
		getContentPane().add(sp);
		getContentPane().add(BorderLayout.SOUTH, button);
		button.addActionListener(this);

		setSize(350, 200);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Socket cs = new Socket("127.0.0.1", 5000);
			BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			String weather = br.readLine();
			br.close();
			textArea.append("サーバーから受け取った予報:" + weather + "\r\n");

		} catch (UnknownHostException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
	}
}
