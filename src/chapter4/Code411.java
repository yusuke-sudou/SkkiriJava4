package chapter4;

public class Code411 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
			// if文を使い、条件に合致する要素があればカウントする
		}
		System.out.println("50点以上の科目の数は" + count);

	}

}
