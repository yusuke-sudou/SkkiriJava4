package chapter3;

public class For3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i < 10; i++) {
			// iは1から9までの繰り返し
			for (int j = 1; j < 10; j++) {
				// jは1から9までの繰り返し
				System.out.print(i * j);
				// 掛け算の結果を出力
				System.out.print(" ");
				// 空白を出力
			}
			System.out.println("");
			//　改行を出力
		}

	}

}
// for文のループを2重にして九九の表尾を出力