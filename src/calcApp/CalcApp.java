package calcApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		while(!(input = scan.nextLine()).equals("quit")) {
			
			input = concatenate(input);
			
			List<Arithmetic> arith = new ArrayList<Arithmetic>();
			
			for (int i = 0; i < input.length(); i++) {
				
				switch (input.charAt(i)){
				case '+':
					arith.add(new Add());
					break;
				case '-':
					arith.add(new Sub());
					break;
				case '*':
					arith.add(new Mul());
					break;
				case '/':
					arith.add(new Div());
					break;
				default:
					break;
				}
			}
			
			List<String> numsStr = Arrays.asList(input.split("[\\+\\-\\*\\/]"));
			List<Double> nums = new ArrayList<Double>();
			
			for (int i = 0; i < numsStr.size(); i++) {
				nums.add(Double.parseDouble(numsStr.get(i)));
			}
			
			System.out.println(calculate(arith, nums));
		}
	}
	
	private static String concatenate(String str) {
		String sum = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sum += str.charAt(i);
			}
		}
		return sum;
	}
	
	private static Double calculate(List<Arithmetic> arith, List<Double> nums) {
		
		
		for (int i = 0; i < arith.size(); i++) {
			if (arith.get(i) instanceof Mul || arith.get(i) instanceof Div) {
				double update = arith.get(i).calculate(nums.get(i), nums.get(i+1));
				nums.set(i, update);
				nums.remove(i+1);
				arith.remove(i);
				i--;
			}
		}
		for (int i = 0; i < arith.size(); i++) {
			double update = arith.get(i).calculate(nums.get(i), nums.get(i+1));
			nums.set(i, update);
			nums.remove(i+1);
			arith.remove(i);
			i--;
		}
		
		return nums.get(0);
	}
}
