package practice2;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		
		Random r = new Random();
		@SuppressWarnings("resource")
		Scanner in = new Scanner( System.in );
		
		String answer = "y";
		
		while(answer.equals("y")) {
			int guess = 0;
			int min = 1;
			int max = 100;
			int k = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int count = 1;
			while (guess != k) {
				System.out.println(min + "-" + max);
				System.out.print(count+ ">>");
				guess = in.nextInt();
				if (guess < k) {
					System.out.println("더 높게");
					if (guess > min) {
						min = guess;
					}
				}
				
				else if (guess > k) {
					System.out.println("더 낮게");
					if (guess < max) {
						max = guess;
					}
				}
				count++;
			}
			
			System.out.println("맞았습니다.");
			System.out.print("다시 하시겠습니까(y/n)>>");
			answer = in.next();
			while(!(answer.equals("y") || answer.equals("n"))) {
				answer = in.next();
			}
		}
		
		in.close();
	}
}
