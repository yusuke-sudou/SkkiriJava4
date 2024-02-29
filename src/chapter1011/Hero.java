package chapter1011;

import chapter7.Matango;

public class Hero {

	String name = "ミナト";
	int hp = 100;
	
	// 攻撃
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	// 転ぶ
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}

}
