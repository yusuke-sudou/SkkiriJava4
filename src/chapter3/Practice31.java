package chapter3;

public class Practice31 {

	public static void main(String[] args) {
		System.out.println("こんにちは");
		int isHungry = new java.util.Random().nextInt(2);
		String food = "バナナ";
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		
		

	}

}
