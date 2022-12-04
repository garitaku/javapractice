package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WeatherForecastServer {
	static String[] weathers = { "晴れ", "曇り", "雨", "晴れのち曇り", "晴れのち雨", "曇りのち晴れ" };

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(5000);
			while (true) {
				Socket cs = ss.accept();
				PrintWriter pw = new PrintWriter(cs.getOutputStream());

				String weather = getWeaterForecast();
				pw.println(weather);
				pw.close();
				System.out.println("[" + weather + "]の予報を送りました");
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	static String getWeaterForecast() {
		// TODO 自動生成されたメソッド・スタブ
		return weathers[(int) (Math.random() * weathers.length)];
	}
}
