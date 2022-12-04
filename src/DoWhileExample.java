
public class DoWhileExample {

	public static void main(String[] args) {
		// 条件式の記載が後にあるため、最低一回は命令が実行される
		int i = 5;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
	}

}
