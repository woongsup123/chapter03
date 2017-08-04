package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		int result = 0;
		
		try {
			result = 1000/a;
		} catch( ArithmeticException e ) {
			System.out.println("Arithmentic Exception");
		}
		
		System.out.println(result);
	}

}
