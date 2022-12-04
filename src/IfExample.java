
public class IfExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int age = 18;
		if (age < 20) {
			System.out.println("未成年ですね");
		}
		age = 20;
		if (age == 20) {
			System.out.println("成人おめでとう");
		}

		if (age < 20) {
			System.out.println("未成年ですね");
		} else {
			System.out.println("二十歳以上ですね");
		}

		age = 12;
		if (age < 4) {
			System.out.println("入場料は無料です");
		} else if (age < 13) {
			System.out.println("子供料金で入場できます");
		} else {
			System.out.println("大人料金が必要です");
		}
	}
}
