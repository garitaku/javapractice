package stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December");
		list.stream().filter(s -> s.length() <= 5).sorted().map(s -> "[" + s + "]").forEach(s -> System.out.println(s));

	}

}
