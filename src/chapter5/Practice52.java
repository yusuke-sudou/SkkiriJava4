package chapter5;

public class Practice52 {

	public static void main(String[] args) {
		String title = "お誘い";
		String address = "yamada@taro";
		String text = "今度、飲みに行きませんか";
		email(title, address, text);

	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールにを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}


