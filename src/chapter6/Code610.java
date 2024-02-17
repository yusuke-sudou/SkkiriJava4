package chapter6;

public class Code610 {

	public static void main(String[] args) {
		int[] heights = {172, 149, 152, 191, 155};
		java.util.Arrays.sort(heights);
		// Javaが備える並び替え命令
		for (int h : heights) {
			System.out.println(h);
		}

	}

}
