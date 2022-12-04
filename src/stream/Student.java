package stream;

public class Student {
	public static void main(String[] args) {
		Student a = new Student("石原", Gender.MALE);
		Student b = new Student("野口", Gender.MALE);
		Student c = new Student("大泉", Gender.FEMALE);
		Student d = new Student("南", Gender.FEMALE);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(a));
	}

	Student(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	enum Gender {
		MALE, FEMALE, UNKNOWN
	};

	String name = "匿名";
	Gender gender = Gender.UNKNOWN;

	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.name == s.name && this.gender == s.gender;

	}
}


