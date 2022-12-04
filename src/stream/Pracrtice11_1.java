package stream;

import java.util.Arrays;
import java.util.List;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printInfo() {
		System.out.println(this.x + " " + this.y);
	}

}

public class Pracrtice11_1 {
	public static void main(String[] args) {
		List<Point> list = Arrays.asList(new Point(8, 7), new Point(3, 5), new Point(4, 9), new Point(1, 3),
				new Point(6, 2), new Point(5, 0));

		list.stream().filter(s -> s.x > 3).sorted((a, b) -> a.y - b.y).forEach(s -> s.printInfo());
	}
}
