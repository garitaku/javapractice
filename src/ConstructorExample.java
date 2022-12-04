public class StudentCard {
	int id;
	String name;

	StudentCard(int id, String name) {
		System.out.println("StudentCardクラスの引数2つのコンストラクタが呼び出されました");
		this.id = id;
		this.name = name;
	}

	StudentCard(String name) {
		System.out.println("StudentCardクラスの引数1つのコンストラクタが呼び出されました");
		this.id = 0;
		this.name = name;
	}

	StudentCard() {
		System.out.println("StudentCardクラスの引数0個のコンストラクタが呼び出されました");
		this.id = 0;
		this.name = "未定";
	}
}

//public class ConstructorExample {
//
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		StudentCard a = new StudentCard(1234, "鈴木次郎");
//
//		System.out.println("aのidの値は" + a.id);
//		System.out.println("aのnameの値は" + a.name);
//
//		StudentCard b = new StudentCard("佐藤花子");
//		System.out.println("bのidの値は" + b.id);
//		System.out.println("bのnameの値は" + b.name);
//
//		StudentCard c = new StudentCard();
//		System.out.println("cのidの値は" + c.id);
//		System.out.println("cのnameの値は" + c.name);
//
//	}
//
//}
