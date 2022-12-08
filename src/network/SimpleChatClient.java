package network;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class SimpleChatClientFrame extends JFrame implements ActionListener, Runnable, WindowListener {
	String nickname = "ななしのごんべえ";
	PrintWriter out;
	BufferedReader in;
	JTextArea textArea = new JTextArea(50, 20);//

	JTextField input = new JTextField(20);
	Socket cs;
//	JButton sendButton = new JButton("送信");
	JButton sendMessage = new JButton("送信");
	JButton conectServer = new JButton("接続");
	JButton nameChange = new JButton("名前変更");
	Container container = this.getContentPane();
	JPanel panel = new JPanel();
	JScrollPane sp = new JScrollPane(textArea);

	SimpleChatClientFrame() {
		setTitle("ちゃっとぷろぐらむ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		panel.setLayout(new FlowLayout());
		container.add(sp);
		container.add(panel);
		panel.add(input);
		panel.add(sendMessage);
		panel.add(nameChange);
		panel.add(conectServer);
		input.addActionListener(this);
		sendMessage.addActionListener(this);
		nameChange.addActionListener(this);
		conectServer.addActionListener(this);
		setBounds(600, 300, 500, 300);
		setVisible(true);
		textArea.setEditable(false);

//		conectServer.setEnabled(false);
	}

	public void append_display(String mess) {
		// メッセージを表示内容に追加
		textArea.append(mess);
		// 一番下に持ってくる
		textArea.setCaretPosition(textArea.getText().length());

	}

	public void connect() {
		try {
//			cs = new Socket("192.168.0.154", 5000);// 富永さんのIPアドレス
			cs = new Socket("127.0.0.1", 5000);
			System.out.println("接続しました");
//				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(cs.getOutputStream())));
			in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			out.println(nickname + "が参加しました");
			out.flush();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sendMessage || e.getSource() == input) {
			if (cs != null && cs.isConnected()) {
				String text = input.getText();
				out.println(nickname + ":" + text);
				input.setText("");
				out.flush();
			} else {
				System.err.println("接続されてへんで");
			}
		}

		if (e.getSource() == nameChange) {
			nickname = input.getText();
			input.setText("");
		}
		if (e.getSource() == conectServer) {
			if (conectServer.getText() == "接続解除") {
				System.out.println("接続解除が押されました");
				try {
					out.println(nickname + "が退室しました");
					out.flush();
					if (cs != null) {
						cs.close();
						cs = null;
					}
					if (in != null) {
						in.close();
					}
					if (out != null) {
						out.close();
					}
					System.out.println("接続解除しました");
					conectServer.setText("接続");
				} catch (IOException e1) {
					// TODO 自動生成された catch ブロック
					e1.printStackTrace();
				}
			} else if (conectServer.getText() == "接続") {
				System.out.println("接続が押されました");
				connect();// うまくいかない・・・
				System.out.println("接続しました");
				conectServer.setText("接続解除");
			}
		}
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		while (true) {
			if (cs == null || !cs.isConnected()) {
				System.out.println("繋がっていない");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			else if (cs != null && cs.isConnected()) {
				String message;
				try {
					message = in.readLine();
					System.out.println("サーバーから" + message + "を受け取りました");
					textArea.append(message + "\r\n");
				} catch (IOException e) {
//					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		textArea.append("ニックネームを入力してから「名前変更」を押してね" + "\r\n");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
//		textArea.append("ニックネームを入力してから「名前変更」を押してね" + "\r\n");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}
}

class SimpleChatClient {
	public static void main(String[] args) {
		SimpleChatClientFrame scc = new SimpleChatClientFrame();
		Thread thread = new Thread(scc);
		thread.start();
		System.out.println("スレッド開始！！");
//		SimpleChatClientFrame scc = new SimpleChatClientFrame();
//		scc.connect();
	}
}