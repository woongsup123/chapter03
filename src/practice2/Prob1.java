package practice2;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("금액: ");
		
		int units[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		int price = scan.nextInt();

		for (int unit : units) {
			price = LeftOver(price, unit);
		}
		
		scan.close();
	}
		
	static int LeftOver(int total, int unit) {
		
		int num = total / unit;
		
		if (num != 0) {
			System.out.println(String.valueOf(unit) + "원 : " + num + "개");
		}
		
		return total - num*unit;
	}
}
