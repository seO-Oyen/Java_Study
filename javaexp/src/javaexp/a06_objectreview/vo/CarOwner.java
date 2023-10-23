package javaexp.a06_objectreview.vo;

public class CarOwner {
	
	private String name;
	private Car car;
	
	public CarOwner() {
		
	}

	public CarOwner(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void buyCar(Car car) {
		this.car = car;
	}
	
	public void showMyCarInfo() {
		System.out.println("자동차 주인 이름 : " + name);
		if (car != null) {
			System.out.println("소유차량 정보");
			System.out.println(car.getCompany());
			System.out.println(car.getModel());
			System.out.println(car.getSpeed());
		} else {
			System.out.println("자동차가 없음");
		}
	}
	
}
