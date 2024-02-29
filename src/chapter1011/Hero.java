package chapter1011;

public class Hero {

	String name = "ミナト";
	int hp = 100;
	
	// 転ぶ
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

}
