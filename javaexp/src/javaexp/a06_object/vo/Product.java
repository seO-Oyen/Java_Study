package javaexp.a06_object.vo;

public class Product {
	String name;
	int price;
	int count;

	public Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void showInfo() {
		System.out.println("물건명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("재고수량 : " + count);
	}

}
