package p01;

public class Sample30 {
	
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.out.println("引数を３つ渡してください。");
			return;
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
