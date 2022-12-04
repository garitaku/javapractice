
public class ContinueExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;//2で割った際の余りが0だった場合(偶数の場合)、その後の処理をスキップして次のループに続く
			}
			sum += i;
			System.out.println("変数sumに" + i + "を加えました。sumは" + sum);
		}
	}

}
