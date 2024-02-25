package chapter7;

public class Main {

	public static void main(String[] args) {
		// 1.勇者を生成
		Hero h = new Hero(); // Heroクラスからインスタンスを生成し、変数ｈに入れる
		
		// 2.フィールドに初期値をセット
		h.name = "ミナト"; // 変数ｈのnameに代入
		h.hp = 100; // 変数hのhpに代入
		System.out.println("勇者" + h.name + "を生み出しました！");
		
	}

}
