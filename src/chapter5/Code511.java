package chapter5;

public class Code511 {
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println("10+20=" + add(10, 20));
		System.out.println("10+20+30=" + add(10, 20, 30));

	}

}

// 同じ型でも個数が違えばオーバーロードできる

//　オーバーロードとは、仮引数の個数や方が異なれば、同じ名前のメソッドを複数定義できる。
//　引数は同じで、戻り値の型だけが異なるものは定義できない。

