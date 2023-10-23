package javaexp.a06_objectreview;

public class A03_Method {

	public static void main(String[] args) {
		
		/*
		 * # 메서드
		 * 1. 객체안에 있는 기능함수를 메서드라고 한다.
		 * 		0) 기본 형식
		 * 			리턴값 메서드명 (매개변수1, 매개변수2, ...) {
		 * 				프로세스 
		 * 				return 실제 리턴값;
		 * 			}
		 * 		1) 리턴값
		 * 			void : 리턴값 없을때
		 * 			실제 리턴값에 할당 가능한 리턴값유형을 선언하여야 한다
		 * 		2) 매개변수
		 * 		3) 프로세스 (로직처리)
		 * 		4) 3개의 구성요소 조합/객체의 필드와 조합된 내용
		 * */

		Person p01 = new Person();
		p01.call();
		int num01 = p01.call02();
		System.out.println("리턴된 데이터 : " + num01);
		System.out.println("리턴된 데이터 : " + p01.call03());
		
		// ex) Calculator 라는 클래스를 선언하고 리턴유형이 없는 메서드,
		// 		25 + 30 합산한 메서드, "+" 리턴한 메서드, 25 * 4.5 리턴한 메서드
		//	 	를 선언하고 호출하세요
		Calculator calculator = new Calculator();
		calculator.method1();
		System.out.println(calculator.method2());
		System.out.println(calculator.method3());
		System.out.println(calculator.method4());
		
		
		Student student = new Student("홍길동", 25, 230101);
		student.showAll();
		student.setName("마길동"); // 변경
		student.setAge(22);
		student.showAll();
		
		// ex) Airplane에 기종, 항로(노선), 속도를 필드로 하여 생성자를 통해서 초기화, show()를 통해서 출력
		Airplane airplane = new Airplane("제주항공", "인천-제주도", 200);
		airplane.show();
		
		
	}

}

class Airplane {
	private String model;
	private String course;
	private int speed;
	
	public Airplane(String model, String course, int speed) {
		this.model = model;
		this.course = course;
		this.speed = speed;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void show() {
		System.out.println("기종 : " + model);
		System.out.println("항로 : " + course);
		System.out.println("속도 : " + speed);
	}
	
}

class Student {
	private String name;
	private int age;
	private int studentId;
	
	public Student(String name, int age, int studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void showAll() {
		System.out.println("# 학생정보 #");
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("학번 : " + studentId);
	}
	
}

class Calculator {
	
	void method1() {
		System.out.println("리턴값이 없습니다.");
	}
	
	int method2() {
		return 25 + 30;
	}
	
	String method3() {
		return "+";
	}
	
	double method4() {
		return 25 * 4.5;
	}
}

class Person {
	
	void call () {
		System.out.println("Person의 메서드 call 호출(리턴값 없음)");
	}
	
	int call02 () {
		return 25;
	}
	
	String call03() {
		return "홍길동";
	}
	
}