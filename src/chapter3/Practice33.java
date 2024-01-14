package chapter3;

public class Practice33 {

	public static void main(String[] args) {
		int isHungry = 1;
	    String food = "おにぎり";
	    System.out.println("こんにちは");
	    if (isHungry == 0) {
	      System.out.println("お腹がいっぱいです");
	    } else {
	      System.out.println("はらぺこです");
	    }
	    if (isHungry == 1) {
	      System.out.println(food + "をいただきます");
	    }
	  System.out.println("ごちそうさまでした");
	  }
		

	}


// 設問文の指示を読み解き、if文の2つの形態（基本形、elseなし）を実装する問題です。
// sHungry変数の中身によって、表示動作を変える必要があることから、
// if-else構文を使う必要があることがわかります。設問文の表現から、そのまま

//   if (isHungry == 0) {

//   } else {
 
//   }

// という大きな枠組みをイメージできれば、あとは、画面表示命令を記述することで正解できるでしょう。

// 設問文に「空腹を示すならば」とあるため、isHungryが0と1のどちらが空腹を示すのか、
// 変数に格納される値の意味を理解して解答する必要がある。