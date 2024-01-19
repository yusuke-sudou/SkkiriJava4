package taisaku;

public class Test3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i < 10) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
		}

	}

}

// 1～10までの整数をカンマ区切りで横並びにする（10にはカンマを付けない）

// for文を使用し、（int i = 1; i <= 10; i++）にて1～10までの数字を並べる

// if文の条件式により、もしiが10より小さかったら（i + ","）になり、それ以外なら（i）という式にする