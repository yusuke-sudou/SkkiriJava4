package chapter5;

public class Code54 {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("山");
		hello("ペコ");
		System.out.println("メソッドの呼び出しが終わりました");

	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}

}
 // 引数、(String name)でメソッドに定義し、hello()で()内にnameを入れて使用