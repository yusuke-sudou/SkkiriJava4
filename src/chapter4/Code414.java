package chapter4;

public class Code414 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		for (int num : scores) {
			System.out.println(num);
		}

	}

}
// 拡張for文で配列を回す

// for (要素の型　任意の変数　：　配列変数名) {
// for (int num : scores) {

// ループ変数や配列の添え字を記述する必要がなくなる