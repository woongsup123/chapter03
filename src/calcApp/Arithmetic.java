package calcApp;

public abstract class Arithmetic {
	private double a;
	private double b;
	
	public void setValue(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	
	public abstract double calculate(double a, double b);
	
}
