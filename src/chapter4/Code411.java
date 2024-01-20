package chapter4;

public class Code411 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;			
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
	}

}

// ある条件と一致する要素の数を数えるカウント集計という処理

// if(scores[i] >= 50)とcount++にて、条件に合致する要素があればカウントする