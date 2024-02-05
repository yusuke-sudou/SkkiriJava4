package chapter5;

public class Practice51 {

	public static void main(String[] args) {
		introduceOneself();
		// mainメソッドから呼び出すための記述

	}
	
	public static void introduceOneself() {
		String name = "湊雄輔";
		int age = 22;
		double height = 169.9;
		char zodiac = '辰';
		System.out.println("私の名前は" + name + "です。");
		System.out.println("歳は" + age + "です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("十二支は" + zodiac + "です。");
	}

}

// 1. メソッドを定義するための枠を準備する

// 2. メソッドの重要事項表明を書く
// 「重要事項表明」とは、メソッド名、引数、戻り値のことをいう

// 3. メソッドの中身を書く（処理内容）

// 4. mainメソッドから呼び出す