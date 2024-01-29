package chapter5;

public class Code510 {
	// 1つめ
	public static int add(int x, int y) {
		return x + y;
	}
	
	// 2つめ
	public static double add(double x, double y) {
		return x + y;
	}
	
	// 3つめ
	public static String add(String x, String y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		//　１つめが呼び出される
		
		System.out.println(add(3.5, 2.7));
		//　２つめが呼び出される
		
		System.out.println(add("Hello", "world"));
		//　３つめが呼び出される

	}

}
