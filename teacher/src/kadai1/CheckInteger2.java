package kadai1;

import java.util.Scanner;

public class CheckInteger2 {

	public static void main(String[] args) {
		//キーボード入力するためのおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("xの値を入力してください：");
		int x = scan.nextInt();
		
		System.out.print("yの値を入力してください：");
		int y = scan.nextInt();
		
		if (x > y) {
			System.out.println("xはyより大きいです");
		} else if (x < y) {
			System.out.println("xはyより小さいです");
		} else { // else if (x == y) {としてもOK
			System.out.println("xとyは等しいです");
		}

	}

}
