package practice3;

public class CurrencyConverter {
	private static double rate = 1100;
	
	public static double toDollar(double won) {
		return won/rate;
	}
	
	public static double toWon(double dollar) {
		return dollar*rate;
	}

	public static void setRate(double r) { //krw/$1
		rate = r;
	}
	
	public static void main(String[] args) {
		setRate(1119.8);
		System.out.println("백만원은 " + CurrencyConverter.toDollar(1000000) + "달러입니다.");
		System.out.println("백달러는 " + CurrencyConverter.toWon(100) + "원입니다.");
	}
}
