package javaexp.a06_object.vo;

public class Bus {
	// 필드 : 데이터
	private int speed;
	private String bno;
	private String target;
	private int pCount;
	// 생성 : 필드의 초기화
	// 1. 매개변수 없이 생성
	public Bus() {
		
	}
	// 2. 필요할 필드값의 초기화 (객체 생성)
	//		숫자 데이터는 기본적으로 0으로 초기화해준다
	//		main() 에서 객체가 생성될 때 초기화된다
	public Bus(String bno, String target) {
		this.bno = bno;
		this.target = target;
	}
	
	// 3. 기능 메서드
		//	1) 데이터를 직접적으로 호출해서 사용할 수 없지만 간접적으로 특정한 기능에 의해서 처리할 수 있음
		//	2) 특정 기능 수행에 의해서 출력 및 특정 형식으로 처리
	public void speedUp() {
		speed += 10;
		System.out.println("속도 증가 : " + speed);
		if (speed >= 200) {
			speed = 200;
		}
	}
	
	// 속도 줄이기 메서드 선언 및 출력
	public void speedDown() {
		speed -= 10;
		System.out.println("속도 감소 : " + speed);
		
		if (speed <= 0) {
			speed = 0;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public int getpCount() {
		return pCount;
	}
	public void setpCount(int pCount) {
		this.pCount = pCount;
	}
	
	
	
	
	
	
	
	// 메서드 : 객체를 통해서 처리하는 기능적인 수행
		// 1) 필드 저장
		// 2) 필드 호출
		// 3) 기능적인 내용에 따라서 필드값을 변경

}
