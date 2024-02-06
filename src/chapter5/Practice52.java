package chapter5;

public class Practice52 {

	public static void main(String[] args) {
		String address = "yamada@taro";
		String text = "今度、飲みに行きませんか";
		email(address, text);

	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールにを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールにを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}


