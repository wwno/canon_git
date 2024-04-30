package kadai3;

public class CalcPoints1 {

	public static void main(String[] args) {
		
		int price = 1000;
		// プレミア会員のポイント計算
		int p1 = getPoints(price, true);//インスタンス生成
		System.out.println("プレミア会員には" + p1 + "ポイント付与されます");
		
		// 無料会員のポイント計算
		int p2 = getPoints(price, false);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");
		}
		// ポイント計算メソッド
	static int getPoints(int price,boolean y) {
		int result;//フィールド
		if(y==true) {
			result = (int)(price*0.2);
			return result;
			
		}else {
			result=(int)(price*0.1);
			return result;
		}
		
	}

}
