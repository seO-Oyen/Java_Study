package javaexp.a06_object.vo;

public class Car {
	
	private int speed;
	private String kind;
	
	public Car(int speed, String kind) {
		this.speed = speed;
		this.kind = kind;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

	public void speedUp() {
		speed += 10;
		System.out.println(kind + "의 속도가 올라 " + speed + "km/h 이다");
	}
	public void speedDown() {
		speed -= 10;
		System.out.println(kind + "의 속도가 내려 " + speed + "km/h 이다");
		
	}

}
