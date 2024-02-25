package chapter7;

public class Matango {
	int hp;
	final int LEVEL = 10; //お化けキノコのレベルに初期値10を設定
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}

// フィールドの先頭にfinalを付けると値を書き換えられない定数フィールドになる