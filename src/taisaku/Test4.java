package taisaku;

public class Test4 {

	public static void main(String[] args) {
		// 要素数20の配列を宣言
		int[] num = new int[20];
		
		// 配列の要素に0から5ずつ加算して代入
		for (int i =0; i < num.length; i++) {
			num[i] = i * 5;
		}
		
		// [0]～[10]の奇数の値をカンマ区切りで表示
		System.out.print("奇数：");
		for (int i = 0; i <= 10; i++) {
			if (num[i] % 2 != 0) {
				System.out.print(num[i]);
				if (i < 10) {
					System.out.print(",");
				}
			}
		}
		System.out.println();
		
		// [11]～[19]の偶数の値をカンマ区切りで表示
		System.out.print("偶数：");
		for (int i = 11; i <= 19; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i]);
				if (i < 19) {
					System.out.print(",");
				}
			}
		}
		System.out.println();

	}

}

// 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
// [0]~[10]の値の奇数のみカンマ区切りで、
// [11]~[19]の値は偶数をカンマ区切りで表示させる

