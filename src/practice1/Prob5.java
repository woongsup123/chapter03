package practice1;

public class Prob5 {

	public static void main(String[] args) {
		for (int i = 1; i <=99; i++) {
			int n = 0;
			if (i >= 10) {
				if ((i/10) % 3 == 0) { //10의 자리
					n++;
				}
			}
			if (i % 10 != 0 && (i - i/10 * 10) % 3 == 0) { //1의 자리
				n++;
			}
			if (n != 0) {
				System.out.print(i + " ");
				for (int j = 0; j < n; j++) {
					System.out.print("짝");
				}
				System.out.println("");
			}
		}
	}

}
