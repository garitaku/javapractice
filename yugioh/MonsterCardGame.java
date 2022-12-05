package yugioh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MonsterCardGame {

	public static void main(String[] args) {
		MonsterCard[] cards = new MonsterCard[50];
		cards[0] = new MonsterCard("サイクロプス", 4, 1200, 1000);
		cards[1] = new MonsterCard("ブラック・マジシャン", 7, 2500, 2100);
		cards[2] = new MonsterCard("暗黒騎士ガイア", 7, 2300, 2100);
		cards[3] = new MonsterCard("マンモスの墓場", 3, 1200, 800);
		cards[4] = new MonsterCard("シルバー・フォング", 3, 1200, 800);
		cards[5] = new MonsterCard("黒魔族のカーテン", 2, 600, 500);
		cards[6] = new MonsterCard("トモザウルス", 2, 500, 400);
		cards[7] = new MonsterCard("ダーク・グレイ", 3, 800, 900);
		cards[8] = new MonsterCard("眠り子", 3, 800, 700);
		cards[9] = new MonsterCard("死者の腕", 2, 600, 600);
		cards[10] = new MonsterCard("火炎草", 2, 700, 600);
		cards[11] = new MonsterCard("コピックス", 2, 600, 500);
		cards[12] = new MonsterCard("ララ・ライウーン", 2, 600, 600);
		cards[13] = new MonsterCard("プチリュウ", 2, 600, 700);
		cards[14] = new MonsterCard("デーモン・ビーバー", 2, 400, 600);
		cards[15] = new MonsterCard("プチテンシ", 3, 600, 900);
		cards[16] = new MonsterCard("ダークキラー", 2, 700, 700);
		cards[17] = new MonsterCard("サンダー・キッズ", 2, 700, 600);
		cards[18] = new MonsterCard("バビロン", 2, 700, 600);
		cards[19] = new MonsterCard("紫炎の影武者", 2, 800, 400);
		cards[20] = new MonsterCard("ヒトデンチャク", 2, 600, 700);
		cards[21] = new MonsterCard("命の砂時計", 2, 700, 600);
		cards[22] = new MonsterCard("はにわ", 2, 500, 500);
		cards[23] = new MonsterCard("磁石の戦士α", 4, 1400, 1700);
		cards[24] = new MonsterCard("磁石の戦士β", 4, 1700, 1600);
		cards[25] = new MonsterCard("磁石の戦士γ", 4, 1500, 1800);
		cards[26] = new MonsterCard("ホーリー・エルフ", 4, 800, 2000);
		cards[27] = new MonsterCard("カース・オブ・ドラゴン", 5, 2000, 1500);
		cards[28] = new MonsterCard("青眼の白龍", 8, 3000, 2500);
		cards[29] = new MonsterCard("ガーゴイル", 3, 1000, 500);
		cards[30] = new MonsterCard("幻獣王ガゼル", 4, 1500, 1200);
		cards[31] = new MonsterCard("砦を守る翼竜", 4, 1400, 1200);
		cards[32] = new MonsterCard("真紅眼の黒龍", 7, 2400, 2000);
		cards[33] = new BlackMagicianGirl("ブラック・マジシャン・ガール", 6, 2000, 1700);
		cards[34] = new DragonMaidStrahl("ドラゴンメイド・シュトラール", 10, 3500, 2000);
		cards[35] = new ManEatingInsect("人喰い虫", 2, 450, 600);
		cards[36] = new MonsterCard("ブラッド・ヴォルス", 4, 1900, 1200);
		cards[37] = new MonsterCard("エルフの剣士", 4, 1400, 1200);
		cards[38] = new MonsterCard("暗黒の竜王", 4, 1500, 800);
		cards[39] = new MonsterCard("ガーゴイル・パワード", 4, 1600, 1200);
		cards[40] = new MonsterCard("ジャッジマン", 6, 2200, 1500);
		cards[41] = new MonsterCard("デーモンの召喚", 6, 2500, 1200);
		cards[42] = new MonsterCard("封印されし者の右腕", 1, 200, 300);
		cards[43] = new MonsterCard("封印されし者の左腕", 1, 200, 300);
		cards[44] = new MonsterCard("封印されし者の右足", 1, 200, 300);
		cards[45] = new MonsterCard("封印されし者の左足", 1, 200, 300);
		cards[46] = new MonsterCard("封印されしエクゾディア", 3, 1000, 1000);
//		MakeList.main(args);
//		cards[33].monsterAtack(cards[28]);
//		cards[33].effect();
//		cards[33].monsterAtack(cards[28]);
//		cards[34].effect(cards[33]);
//		cards[32].printInfo();
//		cards[28].monsterAtack(cards[1]);
//		cards[1].monsterAtack(cards[28]);
//		cards[1].directAtack();

		// デッキ作成
		ArrayList<MonsterCard> deck1 = new ArrayList<MonsterCard>();
		deck1.add(cards[1]);
		deck1.add(cards[33]);
		deck1.add(cards[23]);
		deck1.add(cards[24]);
		deck1.add(cards[25]);
		deck1.add(cards[26]);
		deck1.add(cards[27]);
		deck1.add(cards[2]);
		deck1.add(cards[41]);
		deck1.add(cards[30]);
		deck1.add(cards[3]);
		deck1.add(cards[35]);
		deck1.add(cards[37]);
		deck1.add(cards[38]);
		deck1.add(cards[42]);
		deck1.add(cards[43]);
		deck1.add(cards[44]);
		deck1.add(cards[45]);
		deck1.add(cards[46]);
		deck1.add(cards[12]);

		ArrayList<MonsterCard> deck2 = new ArrayList<MonsterCard>();
		deck2.add(cards[3]);
		deck2.add(cards[4]);
		deck2.add(cards[0]);
		deck2.add(cards[40]);
		deck2.add(cards[29]);
		deck2.add(cards[39]);
		deck2.add(cards[36]);
		deck2.add(cards[11]);
		deck2.add(cards[12]);
		deck2.add(cards[13]);
		deck2.add(cards[14]);
		deck2.add(cards[15]);
		deck2.add(cards[16]);
		deck2.add(cards[17]);
		deck2.add(cards[20]);
		deck2.add(cards[18]);
		deck2.add(cards[19]);
		deck2.add(cards[20]);
		deck2.add(cards[21]);
		deck2.add(cards[22]);
//		MonsterCard[] deck1 = new MonsterCard[10];
//		deck1[0] = cards[1];
//		deck1[1] = cards[33];
//		deck1[2] = cards[23];
//		deck1[3] = cards[24];
//		deck1[4] = cards[25];
//		deck1[5] = cards[26];
//		deck1[6] = cards[27];
//		deck1[7] = cards[2];
//		deck1[8] = cards[29];
//		deck1[9] = cards[30];
//		deck1[10] = cards[3];
//		deck1[11] = cards[4];
//		deck1[12] = cards[5];
//		deck1[13] = cards[6];
//		deck1[14] = cards[7];
//		deck1[15] = cards[8];
//		deck1[16] = cards[9];
//		deck1[17] = cards[10];
//		deck1[18] = cards[11];
//		deck1[19] = cards[12];

//		MonsterCard[] deck2 = new MonsterCard[20];
//		deck2[0] = cards[3];
//		deck2[1] = cards[4];
//		deck2[2] = cards[5];
//		deck2[3] = cards[6];
//		deck2[4] = cards[28];
//		deck2[5] = cards[8];
//		deck2[6] = cards[9];
//		deck2[7] = cards[34];
//		deck2[8] = cards[11];
//		deck2[9] = cards[12];
//		deck2[10] = cards[13];
//		deck2[11] = cards[14];
//		deck2[12] = cards[15];
//		deck2[13] = cards[16];
//		deck2[14] = cards[17];
//		deck2[15] = cards[18];
//		deck2[16] = cards[19];
//		deck2[17] = cards[20];
//		deck2[18] = cards[21];
//		deck2[19] = cards[22];

//		System.out.println(deck.length);
//		System.out.println((int)(Math.random()*deck.length));
//		System.out.println(deck[(int)(Math.random()*deck.length)].name);

//		for (int i = 0; i < deck.length; i++) {
//			int random = (int) (Math.random() * deck.length);
//			int swap = 0;
//			deck[swap] = deck[9];
//			deck[9] = deck[random];
//			deck[random] = deck[swap];
//		}
		// デッキシャッフル
		Collections.shuffle(deck1);
		Collections.shuffle(deck2);

		// 手札のリストを作成
		ArrayList<MonsterCard> tehuda1 = new ArrayList<MonsterCard>();
		// デッキの上から4枚を手札にコピー
		for (int i = 0; i < 4; i++) {
			tehuda1.add(deck1.get(i));
		}
		// デッキの上から4枚をリストから取り除く
		for (int i = 0; i < 4; i++) {
			deck1.remove(0);
		}

		ArrayList<MonsterCard> tehuda2 = new ArrayList<MonsterCard>();

		for (int i = 0; i < 4; i++) {
			tehuda2.add(deck2.get(i));
		}

		for (int i = 0; i < 4; i++) {
			deck2.remove(0);
		}

		ArrayList<MonsterCard> field1 = new ArrayList<MonsterCard>();

		ArrayList<MonsterCard> field2 = new ArrayList<MonsterCard>();
//		System.out.println(deck1.size());
//		for(int i=0;i<tehuda1.size();i++) {
//		System.out.println(tehuda1.get(i).name);
//		}
//		randomShuffle(deck1);
//		randomShuffle(deck2);
		int lifePoint1 = 8000;
		int lifePoint2 = 8000;
		int command = 0;
		int syokan = 0;
		int ikenie = 0;
		System.out.println("決闘！！！");
		for (int i = 0; i < 50; i++) {
			// 自分のターン
			if (i == 0 || i % 2 == 0) {
				System.out.println("------------------------------------");
				System.out.println("TURN" + (i + 1));
				if (i != 0) {
					tehuda1.add(deck1.get(0));
					System.out.println("俺のターン！ドロー！！");
					deck1.get(0).printInfo();
					System.out.println("------------------------------------");
					if (deck1.get(0) == cards[42] || deck1.get(0) == cards[43] || deck1.get(0) == cards[44]
							|| deck1.get(0) == cards[45] || deck1.get(0) == cards[46]) {
						System.out.println("これは・・・意味不明のカード！！");
						System.out.println("------------------------------------");
					}
					deck1.remove(0);
				}

				if (tehuda1.contains(cards[42]) && tehuda1.contains(cards[43]) && tehuda1.contains(cards[44])
						&& tehuda1.contains(cards[45]) && tehuda1.contains(cards[46])) {
					System.out.println("------------------------------------");
					System.out.println("エクゾディアが揃ったぜ！");
					System.out.println("怒りの業火！エグゾード・フレイム！！");
					System.out.println("------------------------------------");
					System.out.println("決闘に勝利した！");
					System.exit(0);

				}
				System.out.println("どのモンスターを召喚する？ 9:何も召喚しない");

				for (int j = 0; j < tehuda1.size(); j++) {
					System.out.println(j + ":" + tehuda1.get(j).name + " ATK:" + tehuda1.get(j).atack);
				}
				Scanner in = new Scanner(System.in);
				syokan = in.nextInt();

				if (syokan != 9) {
					if (tehuda1.get(syokan).level > 4) {
						if (field1.size() > 0) {
							System.out.println("------------------------------------");
							System.out.println("このモンスターを召喚するには生贄が必要だ！");
							System.out.println("誰を生贄にしますか？");
							for (int k = 0; k < field1.size(); k++) {
								System.out.println(k + ":" + field1.get(k).name);
							}
							ikenie = in.nextInt();
							System.out.println(field1.get(ikenie).name + "を生贄に・・・");
							field1.remove(ikenie);
						} else {
							System.out.println("------------------------------------");
							System.out.println("生贄がいないとこのモンスターは召喚できない！");
							System.out.println("どのモンスターを召喚する？");

							for (int k = 0; k < tehuda1.size(); k++) {
								if (tehuda1.get(k).level < 5) {
									System.out.println(k + ":" + tehuda1.get(k).name);
								}
							}

							syokan = in.nextInt();

						}
					}
					System.out.println("------------------------------------");
					System.out.println(tehuda1.get(syokan).name + "を召喚！");
					field1.add(tehuda1.get(syokan));
					tehuda1.get(syokan).printInfo();
					tehuda1.remove(syokan);
				}
				for (int j = 0; j < field1.size(); j++) {
					System.out.println("------------------------------------");
					System.out.println(field1.get(j).name + "はどうする？");
					if (field1.get(j) instanceof EffectMonsterCard) {
						System.out.println("0:直接攻撃 1:モンスターに攻撃 2:効果発動");
					} else {
						System.out.println("0:直接攻撃 1:モンスターに攻撃");
					}

					command = in.nextInt();

					switch (command) {
					case 0:
						if (i == 0) {
							System.out.println("1ターン目は攻撃できない！");
							break;
						} else {
							if (field2.size() != 0) {
								System.out.println("相手の場にモンスターがいる！直接攻撃できない！");
							} else {
								int damage = field1.get(j).directAtack();

								lifePoint2 -= damage;
								if (lifePoint2 < 0) {
									lifePoint2 = 0;
								}
								break;
							}

						}

					case 1:
						if (i == 0) {
							System.out.println("1ターン目は攻撃できない！");
						} else {
							if (field2.size() > 0) {
								System.out.println("誰に攻撃する？");
								for (int k = 0; k < field2.size(); k++) {
									System.out.println(k + ":" + field2.get(k).name);
								}

								command = in.nextInt();

								int damage = field1.get(j).monsterAtack(field2.get(command));
								if (field2.size() != 0) {

									if (damage < 0) {
										lifePoint1 += damage;
										if (lifePoint1 < 0) {
											lifePoint1 = 0;
										}
									} else {
										lifePoint2 -= damage;
										if (lifePoint2 < 0) {
											lifePoint2 = 0;
										}
									}
								}
								if (damage >= 0) {
									field2.remove(command);
								}
							} else {
								System.out.println("相手の場にはモンスターがいない！");
								int damage = field1.get(j).directAtack();

								lifePoint2 -= damage;
								if (lifePoint2 < 0) {
									lifePoint2 = 0;
								}
							}
						}
						break;
					case 2:
						field1.get(j).effect();
					case 3:
						field1.get(j).effect(field2);
						break;
					default:
						System.out.println(field1.get(j).name + "は、ボーっとしている。");
//						System.out.println("プレイヤー1は" + field2.get(i).atack + "ポイントのダメージを受けた！");
//						lifePoint2 -= field2.get(j).atack;
					}
//			if (lifePoint2 == 0) {
//				System.out.println("もうやめて！プレイヤー2のライフは0よ！");
//			}

					System.out.println("------------------------------------");
					System.out.println("プレイヤー1");
					System.out.println("LP:" + lifePoint1);
					System.out.println("------------------------------------");
					System.out.println("プレイヤー2");
					System.out.println("LP:" + lifePoint2);
					if (lifePoint1 == 0) {
						System.out.println("------------------------------------");
						System.out.println("決闘に敗北した！");
						System.exit(0);
					} else if (lifePoint2 == 0) {
						System.out.println("------------------------------------");
						System.out.println("決闘に勝利した！");
						System.exit(0);
					}
				}
			} else {
				// 敵のターン
				System.out.println("------------------------------------");
				System.out.println("TURN" + (i + 1));
				if (i != 0) {
					tehuda2.add(deck2.get(0));
					deck2.remove(0);
				}
				command = (int) (Math.random() * tehuda2.size());
				System.out.println("------------------------------------");
				System.out.println("プレイヤー2は" + tehuda2.get(command).name + "を召喚した!");
				tehuda2.get(command).printInfo();

//				for (int j = 0; j < tehuda1.size(); j++) {//手札確認処理敵のためコメントアウト
//					System.out.println(j + ":" + tehuda1.get(j).name);
//				}
//				command = in.nextInt();

//				System.out.println(tehuda1.get(command).name + "を召喚！");
				field2.add(tehuda2.get(command));
				tehuda2.remove(command);

				for (int j = 0; j < field2.size(); j++) {
					// 自分の場の数回ループする
//					System.out.println(field1.get(j).name + "はどうする？");
//					System.out.println("0:直接攻撃 1:モンスターに攻撃 2,3:効果発動");
//					command = in.nextInt();
					for (int k = 0; k < field1.size(); k++) {
						System.out.println("------------------------------------");
						if (field2.get(j).atack > field1.get(k).atack) {
							int damage = field2.get(j).monsterAtack(field1.get(k));
							if (damage < 0) {
								lifePoint2 += damage;
								if (lifePoint2 < 0) {
									lifePoint2 = 0;
								}
							} else {
								lifePoint1 -= damage;
								if (damage >= 0) {
									field1.remove(k);
								}
								if (lifePoint1 < 0) {
									lifePoint1 = 0;
								}
								break;
							}
						}
					}

//					switch (command) {
//					case 0:
//						int damage = field1.get(i).directAtack();
//
//						lifePoint2 -= damage;
//						if (lifePoint2 < 0) {
//							lifePoint2 = 0;
//						}
//						break;
//					case 1:
//						damage = field2.get(i).monsterAtack(field1.get(i));
//						if (damage < 0) {
//							lifePoint1 += damage;
//							if (lifePoint1 < 0) {
//								lifePoint1 = 0;
//							}
//						} else {
//							lifePoint2 -= damage;
//							if (lifePoint2 < 0) {
//								lifePoint2 = 0;
//							}
//						}
//						break;
//					case 2:
//						field1.get(i).effect();
//						break;
//					case 3:
//						field1.get(i).effect(deck2.get(i));
//						break;
//					default:
//						System.out.println(field1.get(i).name + "は、ボーっとしている。");
//						System.out.println("プレイヤー1は" + deck2.get(i).atack + "ポイントのダメージを受けた！");
//						lifePoint2 -= deck2.get(i).atack;
//					}
//			if (lifePoint2 == 0) {
//				System.out.println("もうやめて！プレイヤー2のライフは0よ！");
//			}

				}
				System.out.println("------------------------------------");
				System.out.println("プレイヤー1");
				System.out.println("LP:" + lifePoint1);
				System.out.println("------------------------------------");
				System.out.println("プレイヤー2");
				System.out.println("LP:" + lifePoint2);
				if (lifePoint1 == 0) {
					System.out.println("------------------------------------");
					System.out.println("決闘に敗北した！");
					System.exit(0);
				} else if (lifePoint2 == 0) {
					System.out.println("------------------------------------");
					System.out.println("決闘に勝利した！");
					System.exit(0);
				}
			}

		}
	}

//	public static void randomShuffle(MonsterCard[] deck) {
//		System.out.println("------------------------------------");
//		System.out.println("ショットガン・シャッフルはカードを痛めるぜ！");
//		// Fisher–Yates shuffle
//		Random rnd = ThreadLocalRandom.current();
//		for (int i = deck.length - 1; i > 0; i--) {
//			int index = rnd.nextInt(i + 1);
//			// 要素入れ替え(swap)
//			MonsterCard tmp = deck[index];
//			deck[index] = deck[i];
//			deck[i] = tmp;
//		}
//	}

}
