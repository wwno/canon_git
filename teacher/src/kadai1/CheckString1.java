package kadai1;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		//キーボード入力するためのおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("パスワード：");
		String pw = scan.next();
		
		if (pw.equals("himitu")) { //pw == "himitu"でもOKですが。。。
			System.out.println("一致しました");
		} else {
			System.out.println("一致しませんでした");
		}

	}

}
