package practice2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner( System.in );
        int intArray[] = new int[5];
        double sum = 0;
        System.out.println("5개의 숫자를 입력하세요.");
        for (int arr : intArray) {
        	arr = in.nextInt();
        	sum += arr;
        }
        
        System.out.println("평균은 " + sum / intArray.length + " 입니다.");
        
        in.close();
	}

}
