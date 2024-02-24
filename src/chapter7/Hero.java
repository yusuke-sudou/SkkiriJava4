package chapter7;

public class Hero {
	String name; //名前の宣言
	int hp; //HPの宣言

	// 眠る操作
	public void sleep() {
		this.hp = 100; //自分自身のhpフィールド
		System.out.println(this.name + "は、眠って回復した！"); // this.nameは自分自身のnameフィールド
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
