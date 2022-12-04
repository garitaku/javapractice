interface HasGetAreaMethod {
	double getArea();// 面積を返す
}

abstract class Shape {
	abstract void draw();
}

class Polyline extends Shape {
	// 折れ線を描画する
	void draw() {
		System.out.println("N");
	}
}

class Rectangle extends Shape implements HasGetAreaMethod {
	// 長方形を描画する
	void draw() {
		System.out.println("□");
	}

	public double getArea() {
		System.out.println("RectangleクラスのgetAreaメソッドが呼び出されました");
		return 1;
	}
}

class Circle extends Shape implements HasGetAreaMethod {
	// 円を描画する
	void draw() {
		System.out.println("○");
	}

	public double getArea() {
		System.out.println("CircleクラスのgetAreaメソッドが呼び出されました");
		return 1;
	}
}

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shape[] shapes = new Shape[3];
		shapes[0] = new Polyline();
		shapes[1] = new Rectangle();
		shapes[2] = new Circle();

		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
		}

		HasGetAreaMethod[] closedShapes = new HasGetAreaMethod[2];
		closedShapes[0] = new Rectangle();
		closedShapes[1] = new Circle();

		for (int i = 0; i < closedShapes.length; i++) {
			closedShapes[i].getArea();
		}
	}

}
