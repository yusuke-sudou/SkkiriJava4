package chapter6;

public class Cacl {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);
		// ドット（.）は日本語で「～の」という意味
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);

	}

}
