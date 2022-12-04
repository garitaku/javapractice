import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("あなたのお名前は？");
		String name = in.next();
		System.out.println(name+"さん。こんにちは。");
		in.close();
	}
}
