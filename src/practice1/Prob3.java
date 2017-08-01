package practice1;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = num; i >= 0; i-=2) {
			sum += i;
		}
		System.out.println("결과 값: " + sum);
		
		scan.close();
	}
}
