package javaexp.a06_objectreview.vo;

public class Bicycle {
	public Bicycle() {
		
	}
	public Bicycle(String model) {
		System.out.println(model);
	}
	public Bicycle(String model, String company) {
		System.out.println(model + ", 제조 : " + company);
	}
}
