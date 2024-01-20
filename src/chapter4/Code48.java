package chapter4;

public class Code48 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		// 省略記法
		
		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4] ;
		// 上記で合計の算出。（※　indexは0から始まる）
		int avg = sum / scores.length;
		// 上記で平均の算出。
		
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
	}

}
