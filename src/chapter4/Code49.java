package chapter4;

public class Code49 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			// scores[i]でループのたびにiの値が0～4で変化する
		}

	}

}

// scores[i]のようにindex（添え字）に変数を指定することができる。

///////////　配列活用の定石　////////////
// パターン1　ループによる全要素の利用
// パターン2　ループによる集計
// パターン3　添え字に対応した情報の利用

///////// ループによる全要素の利用　/////////
// 上記文は、添え字にループ変数を指定しているため、ループの度に0～4と順に変化していく