package taisaku;

public class Test44 {

	public static void main(String[] args) {
		// 要素数20の配列宣言
		int[] num = new int[20];
		
		// 配列に0から5ずつ増加する値を代入するためのfor文
		for (int i = 0; i < num.length; i++) {
			num[i] = i*5;
		}
		
		// [0]～[10]の奇数の値をカンマ区切りで表示
		System.out.print("奇数：");
		for (int i = 0; i <= 10; i++) {
			
			// 配列の要素が奇数かどうか確認するための条件文
			if (i % 2 == 1) {
				// 奇数の場合、カンマで区切って表示
				System.out.print(num[i] + ",");
			}
		}
		
		System.out.println(" ");
		
		// [11]～[19]の偶数の値をカンマ区切りで表示
		System.out.print("偶数：");
		for (int i = 11; i <= 19; i++) {
			
			// 配列の要素が偶数かどうか確認するための条件文
			if (i % 2 == 0) {
				// 偶数の場合、カンマで区切って表示
				System.out.print(num[i] + ",");
			}
		}

	}

}
