class X {
	X() {
		System.out.println("X");
	}

	void a() {
		System.out.println("x.a");
	}

	void b() {
		System.out.println("x.b");
	}
}

class Y extends X {
	Y() {
		System.out.println("Y");
	}

	void a() {
		System.out.println("y.a");
	}
}

public class Practice7_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		X x = new X();
		x.a();
		x.b();
		System.out.println("------------------");
		Y y = new Y();
		y.a();
		y.b();
	}

}
