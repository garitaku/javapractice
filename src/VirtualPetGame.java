abstract class VirtualPet {
	String name;
	int maxEnergy;
	int energy;

//---------------------------------------------------------
	VirtualPet(String name, int maxEnergy, int energy) {// コンストラクタ
		this.name = name;
		this.maxEnergy = maxEnergy;
		this.energy = energy;
	}
//----------------------------------------------------------	

	void sleep() {// VirtualPet共通のメソッド
		System.out.println(this.name + ":よく寝た。体力が回復したよ。");
		this.energy = this.maxEnergy;
	}

	void printInfo() {// VirtualPet共通のメソッド
		System.out.println("[状態出力]");
		System.out.println("名前:" + this.name);
		System.out.println("最大体力:" + this.maxEnergy);
		System.out.println("体力:" + this.energy);
	}

	abstract void move();

}

class VirtualDog extends VirtualPet {// VirtualPetクラスを継承
	VirtualDog(String name, int maxEnergy, int energy) {
		super(name, maxEnergy, energy);
	}

	void move() {
		if (this.energy < 10) {
			System.out.println(this.name + ":疲れちゃって、これ以上歩けないよ。");
		} else {
			System.out.println(this.name + ":歩いたよ。体力が10減った。最大体力が1増えた。");
			this.energy -= 10;
			this.maxEnergy += 1;
		}
	}
}

class VirtualBird extends VirtualPet {
	VirtualBird(String name, int maxEnergy, int energy) {
		super(name, maxEnergy, energy);
	}

	void move() {
		if (this.energy < 10) {
			System.out.println(this.name + ":疲れちゃって、これ以上飛べないよ");
		} else {
			System.out.println(this.name + ":パタパタ。飛んだよ。体力が10減った。最大体力が1増えた。");
		}
		this.energy -= 10;
		this.maxEnergy += 1;
	}
}

public class VirtualPetGame {
	public static void moveAndSleep(VirtualPet pet) {
		pet.move();
		pet.sleep();
	}

	public static void main(String[] args) {
		VirtualDog taro = new VirtualDog("タロ", 100, 50);
		VirtualBird piyo = new VirtualBird("ピヨ", 60, 30);

//		taro.walk();
//		piyo.fly();
//		taro.printInfo();
//		piyo.printInfo();
//		taro.sleep();
//		piyo.sleep();
//		taro.printInfo();
//		piyo.printInfo();
		moveAndSleep(taro);
		moveAndSleep(piyo);

	}
}
//class VirtualDog {
//	String name;
//	int maxEnergy;
//	int energy;
//}
//
//public class VirtualPetGame {
//
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		VirtualDog taro = new VirtualDog();
//		taro.name = "タロ";
//		taro.maxEnergy = 100;
//		taro.energy = 50;
//
//		VirtualDog jiro = new VirtualDog();
//		jiro.name = "ジロ";
//		jiro.maxEnergy = 80;
//		jiro.energy = 40;
////		バーチャルペットジロの情報を出力
//		System.out.println("名前:" + jiro.name);
//		System.out.println("最大体力:" + jiro.maxEnergy);
//		System.out.println("体力:" + jiro.energy);
////		バーチャルペットタロの情報を出力
//		System.out.println("名前:" + taro.name);
//		System.out.println("最大体力:" + taro.maxEnergy);
//		System.out.println("体力:" + taro.energy);
//	}
//
//}
