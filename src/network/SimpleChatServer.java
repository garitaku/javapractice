package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleChatServer {
	public static void main(String[] args) {
		try {
			System.out.println("サーバー起動ちう");
			ServerSocket ss = new ServerSocket(5000);
			while (true) {
				Socket cs = ss.accept();
				ChatThread chat = new ChatThread(cs);
				chat.start();

//				BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
//				
//				String message = br.readLine();
//				System.out.println(message + "を受け取りました");
//
////				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream()));
//				PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(cs.getOutputStream())));
//				pw.println(message);
////				pw.flush();
//				pw.close();
//				br.close();
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}

class ChatThread extends Thread {

	protected Socket cs;

	public ChatThread(Socket cs) {
		this.cs = cs;
	}
	
	public void run() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			String message = "メッセージはありません。";
			message = in.readLine();
			System.out.println(message + "を受け取りました");
			PrintWriter out;
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(cs.getOutputStream())));
			out.println(message);
			out.flush();
//			pw.flush();
			out.close();
			in.close();

		} catch (IOException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

	}

}