package kadai2;

public class Introduce1 {

	public static void main(String[] args) {
		String[] hobby = {"ダンス", "映画", "バイク"};
		
		System.out.println("私の趣味は、");
		
		for (String h : hobby) {
			System.out.println("・" + h);
		}
		
		System.out.println("です");
	}

}
