package taisaku;

public class Test2 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 2; i <= 10; i += 2) {
			count++;
			sum += i;
		}
		System.out.println("偶数の数：" + count);
		System.out.println("偶数の合計：" + sum);

	}

}

// int count = 0;  にて数の初期値を必ず設定する
// int sum = 0;  にて数と同じく合計の初期値も必ず設定する

// (int i = 2; i <= 10; i += 2;)　にて2～10までで2が足され続ける

// count++;  偶数が見つかる度に一つずつ格納されて行き、最終的な数がcountに格納される
// sum += i; 偶数が見つかる度にsumに足されていき、最終的な合計がsumに格納される
