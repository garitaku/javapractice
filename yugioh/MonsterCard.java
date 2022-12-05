package yugioh;

import java.util.ArrayList;
import java.util.Scanner;

public class MonsterCard {

	String name;
	int level;
	int atack;
	int defense;

//コンストラクタ↓
	MonsterCard(String name, int level, int atack, int defense) {
		this.name = name;
		this.level = level;
		this.atack = atack;
		this.defense = defense;
	}

//	インスタンスメソッド↓
	void printInfo() {
		System.out.println("------------------------------------");
		System.out.println("名前:" + this.name);
		System.out.println("レベル:" + this.level);
		System.out.println("攻撃力:" + this.atack);
		System.out.println("守備力:" + this.defense);
	}

	int directAtack() {
		this.printInfo();
		System.out.println("------------------------------------");
		System.out.println(this.name + "のダイレクトアタック！プレイヤーに" + this.atack + "ポイントのダメージ！");
		return this.atack;
	}

	int monsterAtack(MonsterCard monster) {
		this.printInfo();
		monster.printInfo();
		if (this.atack > monster.atack) {
			System.out.println("------------------------------------");
			System.out.println("行け！" + this.name + "!" + monster.name + "に攻撃！");
			System.out.println(monster.name + "を粉砕！" + "プレイヤーに" + (this.atack - monster.atack) + "ポイントのダメージ！");
			return this.atack - monster.atack;
		} else if (this.atack == monster.atack) {
			System.out.println("------------------------------------");
			System.out.println("行け！" + this.name + "!" + monster.name + "に攻撃！");
			System.out.println(monster.name + "を粉砕！");
			return 0;
		} else {
			System.out.println("------------------------------------");
			System.out.println("駄目だ！" + this.name + "の攻撃力じゃ、" + monster.name + "には太刀打ちできない！");
			return this.atack - monster.atack;
		}

	}

	void effect() {
	}

	void effect(ArrayList<MonsterCard> field2) {
	}
}

class EffectMonsterCard extends MonsterCard {
	EffectMonsterCard(String name, int level, int atack, int defence) {
		super(name, level, atack, defence);
	}

	void effect() {
	}
}

class BlackMagicianGirl extends EffectMonsterCard {
	BlackMagicianGirl(String name, int level, int atack, int defence) {
		super(name, level, atack, defence);
	}

	void effect() {
		if (this.atack < 3000) {
			System.out.println("------------------------------------");
			System.out.println(this.name + "の効果発動！！");
			System.out.println(this.name + "の攻撃力を1000アップする！");
			this.atack += 1000;
		} else {
			System.out.println("------------------------------------");
			System.out.println(this.name + "の効果発動！！");
			System.out.println("しかし" + this.name + "の攻撃力はこれ以上あがらない！！");
		}

	}
}

class DragonMaidStrahl extends EffectMonsterCard {
	DragonMaidStrahl(String name, int level, int atack, int defence) {
		super(name, level, atack, defence);
	}

	void effect(MonsterCard monster) {
		System.out.println("------------------------------------");
		System.out.println(this.name + "の効果発動！！");
		System.out.println(monster.name + "の効果を無効にして破壊する！");
	}
}

class ManEatingInsect extends EffectMonsterCard {
	ManEatingInsect(String name, int level, int atack, int defence) {
		super(name, level, atack, defence);
	}

	void effect(ArrayList<MonsterCard> field2) {
		System.out.println(this.name + "の効果発動！！");
		System.out.println("どのモンスターを破壊する？");
		for (int i = 0; i < field2.size(); i++) {
			System.out.println(i + ":" + field2.get(i).name);
		}
		Scanner in = new Scanner(System.in);
		int command = in.nextInt();

		System.out.println(field2.get(command).name + "を破壊する！");
		field2.remove(command);

	}
}