package chapter7;

public class Main {

	public static void main(String[] args) {
		// 1.勇者を生成
		Hero h = new Hero(); // Heroクラスからインスタンスを生成し、変数ｈに入れる
		
		// 2.フィールドに初期値をセット
		h.name = "ミナト"; // 変数ｈのnameに代入
		h.hp = 100; // 変数hのhpに代入
		// System.out.println("勇者" + h.name + "を生み出しました！");
		
		// 3.勇者のメソッドを呼び出してゆく
		// h.sit(5); // 5秒座れ
		// h.slip(); // 転べ
		// h.sit(25); // 25秒座れ
		// h.run(); // 逃げろ
		
		Matango m1 = new Matango(); // お化けキノコA（1匹目）生成し初期化
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango(); // お化けキノコB（2匹目）生成し初期化
		m2.hp = 48;
		m2.suffix = 'B';
		
		// 冒険の始まり
		h.slip(); // 勇者転ぶ
		m1.run(); // お化けキノコA逃げる
		m2.run(); // お化けキノコB逃げる
		h.run(); // 勇者も逃げる
	}

}
