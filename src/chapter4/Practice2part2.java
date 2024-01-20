package chapter4;

public class Practice2part2 {

	public static void main(String[] args) {
		int[] moneyList = {121902, 8302, 55100};
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for (int num : moneyList) {
			System.out.println(num);
		}

	}

}

// ①3つの口座残高「121902」「8302」「55100」が格納されているint型配列moneyListを宣言する。

// ②moneyListの要素を1つずつfor文で取り出して画面に表示する。

// ③moneyListの要素を拡張for文で1つずつ取り出して画面に表示する。