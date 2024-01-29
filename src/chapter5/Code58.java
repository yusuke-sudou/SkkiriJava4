package chapter5;

public class Code58 {

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(add(add(10, 20),add(30,40)));

	}

}

// addメソッドの(10,20)、(30,40)がそれぞれ30と70になり()の外側のaddで（30，70）が呼び出されて100になる