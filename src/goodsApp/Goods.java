package goodsApp;

public class Goods {
	private String type = "";
	private int price = 0;
	private int num = 0;
	
	public Goods() {

	}
	public Goods(String type, int price, int num) {
		this.type = type;
		this.price = price;
		this.num = num;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
