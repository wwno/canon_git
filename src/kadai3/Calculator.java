package kadai3;

public class Calculator {

	public static void main(String[] args) {
		int a = add(3, 7);
		System.out.println(a);

		int b = sub(3, 7);
		System.out.println(b);
		
		double c = avg(3, 7);
		System.out.println(c);
		
	}
	// 足し算メソッドを作りなさいstaticメソッド
	static int add(int x, int y) {
		int result = x + y;
		return result;
	}

	// 引き算メソッドを作りなさい
	static int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	
	// 平均値メソッドを作りなさい
	static double avg(double x,double y) {
		double result = (x + y)/2.0;
				return result;
				}

}
