package chapter5;

public class Code55 {

	public static void main(String[] args) {
		add(100, 20);
		add(200,50);
	}
	
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}

////////////引数を利用したメソッドの定義///////////

// public static void メソッド名（引数リスト）{
//   メソッドの処理
// }



///////////引数を利用したメソッドの呼び出し///////////

// メソッド名（引数リスト）