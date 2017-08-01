package practice3;

public class Div extends Arithmetic{
	
	public double calculate(double a, double b) {	
		if (b == 0) {
			throw new IllegalArgumentException("0으로 나눌 수 없습니다");
		}
		return a / b;
	}
}
