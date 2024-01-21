package taisaku;

public class Test444 {

	public static void main(String[] args) {
		int[] num = new int[20];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i*5;
		}
		
		System.out.print("奇数：");
		for (int i = 0; i <= 10; i++) {
			if (num[i] % 2 == 1) {
				System.out.print(num[i] + ",");
			}
		}
		
		System.out.println("");
		
		System.out.print("偶数：");
		for (int i = 11; i <= 19; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + ",");
			}
			
		}

	}

}


/////// 間違えたところ//////////

// if文の中身を（num[i] / 2 == 1）→　正しくは(num[i] % 2 == 1)で奇数を抽出する