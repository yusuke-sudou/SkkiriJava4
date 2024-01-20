package chapter4;

public class practice4part2 {

	public static void main(String[] args) {
		// 初期値を設定
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		
		//　キーボードから数字の入力を受付、変数inputに代入する
		int input = new java.util.Scanner(System.in).nextInt();
		
		// 配列を回しながら、いずれかの要素と等しいか調べる
		// もし等しければ「あたり！」と表示される
		for (int num : numbers) {
			if (input == num) {
				System.out.println("あたり！");
			}
		}

	}

}
