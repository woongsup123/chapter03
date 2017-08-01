package practice1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int num = scan.nextInt();
		if (num%3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		scan.close();
	}

}
