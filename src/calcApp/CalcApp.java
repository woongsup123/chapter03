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
			
			List<String> numsStr = Arrays.asList(input.split("[\\+\\-\\*\\/\\(\\)]"));
			List<Double> nums = new ArrayList<Double>();
			
			for (int i = 0; i < numsStr.size(); i++) {
				
				String s = numsStr.get(i);
				
				if (isNumeric(s)) {
					nums.add(Double.parseDouble(s));
				}
			}
			
			List<Arithmetic> arith = new ArrayList<Arithmetic>();
			int openBracketPos = 0;
			int closeBracketPos = 0;
			for (int i = 0; i < input.length(); i++) {
				
				char c = input.charAt(i);
				if (c == '+') {
					arith.add(new Add());
				}
				else if ( c == '-' ) {
					arith.add(new Sub());
				}
				else if ( c == '*' ) {
					arith.add(new Mul());
				}
				else if ( c == '/' ) {
					arith.add(new Div());
				}
				else if ( c == '(' ) {
					openBracketPos = arith.size();
				}
				else if ( c == ')' ) {
					closeBracketPos = arith.size();
					calculate(arith, nums, openBracketPos, closeBracketPos);
				}
			}
			
			System.out.println(calculate(arith, nums, 0, arith.size()));
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
	
	private static Double calculate(List<Arithmetic> arith, List<Double> nums,
									int init, int end) { //from initial sign index to final sign index
		
		for (int i = init; i < end; i++) {
			if (arith.get(i) instanceof Mul || arith.get(i) instanceof Div) {
				double update = arith.get(i).calculate(nums.get(i), nums.get(i+1));
				nums.set(i, update);
				nums.remove(i+1);
				arith.remove(i);
				end--;
				i--;
			}
		}
		
		for (int i = init; i < end; i++) {
			double update = arith.get(i).calculate(nums.get(i), nums.get(i+1));
			nums.set(i, update);
			nums.remove(i+1);
			arith.remove(i);
			end--;
			i--;
		}
		
		return nums.get(0);
	}
	
	public static boolean isNumeric(String str)  
	{  
		try
		{
			double d = Double.parseDouble(str);  
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		return true;  
	}
}
