package kadai3;

public class CalcPoints1 {

	public static void main(String[] args) {
		int price = 1000;
		
		// プレミア会員のポイント計算 
		int p1 = getPoints(price, true);
		System.out.println("プレミア会員には" + p1 + "ポイント付与されます");

		// 無料会員のポイント計算 
		int p2 = getPoints(price, false);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");
	}
	
	static int getPoints(int price, boolean premier) {
		double per = premier == true ? 0.2 : 0.1;
		
//		double per = 0.0;
//		
//		if (premier == true) {
//			per = 0.2;
//		} else {
//			per = 0.1;
//		}
		
		int point = (int)(price * per);
		
		return point;
	}

}
