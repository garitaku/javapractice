package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(5000);
			while (true) {
				Socket cs = ss.accept();
				PrintWriter writer = new PrintWriter(cs.getOutputStream());
				writer.println("こんにちは。私がサーバーです");
				writer.close();
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
