package chapter7;

public class Hero {
	String name; //名前の宣言
	int hp; //HPの宣言

	// 眠る操作（sleepメソッド）
	public void sleep() {
		this.hp = 100; //自分自身のhpフィールド
		System.out.println(this.name + "は、眠って回復した！"); // this.nameは自分自身のnameフィールド
	}
	
	// 座る操作（sitメソッド）
	public void sit(int sec) { // (int sec)で何秒座るか引数で受け取る
		this.hp += sec; // 座る秒数だけHPを回復
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}
	
	// 転ぶ操作（slipメソッド）
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	// 逃げる操作（runメソッド）
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
