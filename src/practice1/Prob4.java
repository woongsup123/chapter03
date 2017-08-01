package practice1;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str = scan.nextLine();
		String outputStr = "";
		for (char c : str.toCharArray()) {
			System.out.println(outputStr+=c);
		}
		scan.close();
	}

}
