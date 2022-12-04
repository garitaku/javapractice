
public class TimesTable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int value = i * j;
				System.out.print(i + "×" + j + "=" + value);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
