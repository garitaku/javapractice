package network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class SimpleChatClientFrame extends JFrame implements ActionListener {

	PrintWriter out;
	BufferedReader in;
	JTextArea textArea = new JTextArea(5, 20);
	JTextField tf = new JTextField(20);
	Socket cs = null;
	JButton sendButton = new JButton("送信");

	SimpleChatClientFrame() {
		setTitle("チャットアプリ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane sp = new JScrollPane(textArea);
		addWindowListener(new MyWindowAdapter());
		getContentPane().add(sp);
		getContentPane().add(BorderLayout.EAST, sendButton);
		getContentPane().add(BorderLayout.SOUTH, tf);
		sendButton.addActionListener(this);

		setSize(350, 200);
		setVisible(true);
//		textArea.setEditable(false);
	}

	public void append_display(String mess) {
		// メッセージを表示内容に追加
		textArea.append(mess);
		// 一番下に持ってくる
		textArea.setCaretPosition(textArea.getText().length());

	}

	public void connect() {
//		Socket cs = new Socket("192.168.0.154", 5000);//富永さんのIPアドレス
		try {
			cs = new Socket("127.0.0.1", 5000);
			System.out.println("接続しました");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream()));
			out = new PrintWriter(bw);
			in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			while (cs != null && cs.isConnected()) {

				String message = in.readLine();
				textArea.append(message + "\r\n");

			}

		} catch (UnknownHostException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} // 自分自身のIPアドレス
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = tf.getText();
		out.println(text);
		tf.setText("");
		out.flush();
	}
}

class MyWindowAdapter extends WindowAdapter {

}

class SimpleChatClient {
	public static void main(String[] args) {
		SimpleChatClientFrame scc = new SimpleChatClientFrame();
		scc.connect();
	}
}