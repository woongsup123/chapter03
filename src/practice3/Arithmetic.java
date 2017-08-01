package practice3;

public abstract class Arithmetic {
	private int a = 0;
	private int b = 0;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract double calculate(double d, double e);
	
}
