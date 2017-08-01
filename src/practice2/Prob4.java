package practice2;

public class Prob4 {

	public static void main(String[] args) {
		char c[] = reverse("hello! I am glad to meet you.");
		printCharArray(c);

	}
	
	public static char[] reverse(String str) {
		int sizeOfStr = str.length();
		char c[] = new char[sizeOfStr];
		for (int i = 0; i < sizeOfStr; i++) {
			c[i] = str.charAt(sizeOfStr-i-1);
		}
		return c;
	}
	public static void printCharArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		//System.out.println("");
	}
}
