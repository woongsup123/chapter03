package goodsApp;

import java.util.Scanner;

public class GoodsApp {
	
	private static final int NUM = 3;
	
	public static void main(String[] args) {
	
		Goods goods[] = new Goods[NUM];
		for (int i = 0; i < goods.length; i++) {
			goods[i] = new Goods();
		}
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < goods.length; i++) {
		
			String[] str = in.nextLine().split(" ");
			
			goods[i].setType(str[0]);
			goods[i].setPrice(Integer.parseInt(str[1]));
			goods[i].setNum(Integer.parseInt(str[2]));
			
			Goods.setStocks(Goods.getStocks() + Integer.parseInt(str[2]));
		
		}
		
		for (int i = 0; i < goods.length; i++) {
			
			System.out.println(goods[i].getType() + "(가격: " + goods[i].getPrice() + "원)이 "
								+ goods[i].getNum() + "개 입고 되었습니다.");
		}
		System.out.println("총 입고 개수: " + Goods.getStocks());
		in.close();
	}
}
