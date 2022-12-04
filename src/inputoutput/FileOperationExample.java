package inputoutput;

import java.io.File;

public class FileOperationExample {
	public static void main(String[] args) {
		File file = new File("/Users/takuya/Desktop/java/test.txt");
		if (!file.exists()) {
			System.out.println(file + "がありません");
			return;
		}

		if (file.delete()) {
			System.out.println(file + "を削除しました");
		} else {
			System.out.println(file + "を削除できませんでした");
		}
	}
}
