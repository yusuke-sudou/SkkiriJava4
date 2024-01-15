package chapter4;

public class Code412 {

	public static void main(String[] args) {
		int[] seq = new int[10];
		
		// 塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		// 生成した塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			char[] base = {'A', 'T', 'G', 'C'} ;
			System.out.print(base[seq[i]] + " ");
			// 14行のswitch文を上記2行にまとめられる。
		}

	}

}

// int baseTye = seq[i]; 　　　　　   i番目の数値を取得
// char baseChar = base[baseType];    数値に対応する記号を取得
// System.out.print(baseChar + " ");  記号を画面に表示