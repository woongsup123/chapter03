package practice1;

public class Prob2 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i+j);
				if (j != 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
