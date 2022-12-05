package network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class SimpleChatClient extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new SimpleChatClient();

		
	}
	
	JTextArea textArea = new JTextArea(5, 20);
	JTextField tf = new JTextField(20);
	
	JButton sendButton = new JButton("送信");
//	JButton receiveButton = new JButton("受信");

	SimpleChatClient() {
		setTitle("チャットアプリ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane sp = new JScrollPane(textArea);
		getContentPane().add(sp);
		getContentPane().add(BorderLayout.EAST, sendButton);
//		getContentPane().add(BorderLayout.WEST, receiveButton);
		getContentPane().add(BorderLayout.SOUTH, tf);
		sendButton.addActionListener(this);
//		receiveButton.addActionListener(this);
		setSize(350, 200);
		setVisible(true);
//		textArea.setEditable(false);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		try {
//			Socket cs = new Socket("192.168.0.154", 5000);//富永さんのIPアドレス
			Socket cs = new Socket("127.0.0.1", 5000);// 自分自身のIPアドレス

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream()));
			PrintWriter pw = new PrintWriter(bw);
			String text = tf.getText();
			pw.println(text);
			pw.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			String message = br.readLine();
			textArea.append(message + "\r\n");

			br.close();
			pw.close();
			cs.close();

		} catch (UnknownHostException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
	}
}