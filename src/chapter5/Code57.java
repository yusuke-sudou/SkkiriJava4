package chapter5;

public class Code57 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

	public static void main(String[] args) {
		int ans = add(100,10);
		System.out.println("100 + 10 = " + ans);

	}

}

/////////　戻り値を利用したメソッドの定義　//////////

// public static 戻り値の型　メソッド名（引数リスト）｛
//　メソッドの処理
//　return 戻り値;
// }
