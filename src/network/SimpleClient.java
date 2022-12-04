package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
	public static void main(String[] args) {
		try {
			Socket cs = new Socket("127.0.0.1", 5000);
			BufferedReader reader = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			String message = reader.readLine();
			System.out.println("サーバーから受け取った文字列:" + message);
			reader.close();
		} catch (UnknownHostException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
