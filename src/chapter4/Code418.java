package chapter4;

public class Code418 {

	public static void main(String[] args) {
		int[][] scores = new int[2][3]; // 2行3列の配列
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		System.out.println(scores[1][1]);

	}

}

// 例：兄弟2人の3科目のテスト結果を格納する2次元配列

// 2次元配列の宣言：要素の型[][] 配列変数名 = new 要素の型[行数][列数];

// 2次元配列の要素の利用：配列変数名[行の添え字][列の添え字];
