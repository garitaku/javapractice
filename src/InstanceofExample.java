class Person {
	void work() {
		System.out.println("人です。仕事します。");
	}

	void workThreeTimes(Person p) {
		p.work();
		p.work();
		p.work();
	}
}

class Student extends Person {
	void work() {
		System.out.println("学生です。勉強します。");
	}
}

class Teacher extends Person {
	void work() {
		System.out.println("教員です。授業をします。");
	}

	void makeTest() {
		System.out.println("試験問題を作ります。");
	}
}

class Car {

}

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Person p = new Person();
//		Teacher t = new Teacher();
//		Student s = new Student();
//		Car c = new Car();
//
//		Person s = new Student();
//		Person t = new Teacher(); 
//		-----------------------------
//		Person c = new Car();不可
//		Car p = new Person();不可
//		-----------------------------

		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();

//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i] instanceof Person) {
//				System.out.println("persons[" + i + "]はPersonクラスのインスタンスです");
//			}
//			if (persons[i] instanceof Student) {
//				System.out.println("persons[" + i + "]はStudentクラスのインスタンスです");
//			}
//			if (persons[i] instanceof Teacher) {
//				System.out.println("persons[" + i + "]はTeacherクラスのインスタンスです");
//			}
//		}

		for (int i = 0; i < persons.length; i++) {
			persons[i].work();
		}
		persons[2].workThreeTimes(persons[0]);

	}

}
