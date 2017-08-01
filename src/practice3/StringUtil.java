package practice3;

public class StringUtil {
	
	public static String concatenate(String[] str) {
		String sum = "";
		for (String s:str) {
			sum += s;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String[] strArr = {"SuperMan", "BatMan", "SpiderMan"};
		String resultStr = StringUtil.concatenate(strArr);
		System.out.println("결과 문자열 : " + resultStr);
	}

}
