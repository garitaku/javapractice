package inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice7 {
//	public static void main(String[] args) {
//		String str="3.14";
//		double d= Double.parseDouble(str);
//		System.out.println(d);
//	}

	public static void main(String[] args) {
		try {
			// ファイル入力用のストリームを構築
			FileReader fr = new FileReader("/Users/takuya/Desktop/java/test.txt");
			BufferedReader br = new BufferedReader(fr);
			// ファイル出力用のストリームを構築
			FileWriter fw = new FileWriter("/Users/takuya/Desktop/java/test2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String s;// 1行ずつ読み込んだ文字列を格納
			int lineNumber = 1;// 行の番号をカウント
			while ((s = br.readLine()) != null) {
				System.out.println(br + "を読み込みました");
				bw.write(lineNumber + ":" + s + "\r");

				lineNumber++;
			}
			br.close();
			bw.close();

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
