package practice3;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		while(!(input = scan.nextLine()).equals("quit")) {
			
			input = concatenate(input);
			
			String[] nums = input.split("[\\+\\-\\*\\/]");

			Arithmetic arith = null;
			for (int i = 0; i < input.length(); i++) {
				
				switch (input.charAt(i)){
				case '+':
					arith = new Add();
					break;
				case '-':
					arith = new Sub();
					break;
				case '*':
					arith = new Mul();
					break;
				case '/':
					arith = new Div();
					break;
				default:
					break;
				}
				
				if (arith != null) {
					break;
				}
			}
			
			double ans = arith.calculate(Double.parseDouble(nums[0]), Double.parseDouble(nums[1]));
			System.out.println(ans);
		}
	}
	
	public static String concatenate(String str) {
		String sum = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sum += str.charAt(i);
			}
		}
		return sum;
	}

}
