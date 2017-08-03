package exception;

import java.io.IOException;

public class MyClass {
	public void danger() throws MyException, IOException {
		System.out.println("some code...1");
		System.out.println("some code...2");
		
		if (true) {
			throw new MyException("My CLass Exception 발생");
		}
		
		if (true) {
			throw new IOException("My CLass Exception 발생");
		}
		
		System.out.println("some code...3");
		System.out.println("some code...4");
	}
}
