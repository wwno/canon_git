
public class IntroduceMethod {

	public static void main(String[] args) {
		introduce("田中太郎", 25);
		System.out.println("---");
		introduce("鈴木一郎", 30);
		
		System.out.println();

	}
	// 自己紹介と10年後の年齢を出力するメソッドを作りなさい
	
	static void introduce(String name,int age) {
		System.out.println(name + age + "です");
		System.out.println("１０年後は" + (age + 10) + "です");
		
	}
}
