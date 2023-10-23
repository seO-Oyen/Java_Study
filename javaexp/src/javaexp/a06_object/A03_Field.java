package javaexp.a06_object;

import java.util.ArrayList;
import java.util.List;

public class A03_Field {

	public static void main(String[] args) {
		
		/*
		 * # 클래스의 구성요소
		 * 1. 필드 : 객체의 데이터가 저장되는 곳
		 * 		ex) 사람으로 비유하면 두뇌에 정보를 저장하는 것을 말함.
		 * 2. 생성자 : 객체가 가지는기능메서드 중에서 클래스명과 동일하며
		 * 				주로 필드값을 초기화할 때 사용
		 * 				주로 new 키워드를 통해서 해당 선언된 생성자가 호출되는데
		 * 				기본적으로 default 생성자를 통해서 내장된 생성자를 사용할 뿐만 아니라
		 * 				선언된 생성자를 호출해서 처리하는 경우도 많다
		 * 				ex) 선언
		 * 					public Baby (String name, String gender, int age) {
		 * 						this.name = name;
		 * 						this.gender = gender;
		 * 						this.age = age;
		 * 					}
		 * 					호출
		 * 					new Baby("아기1", "남자", 0);
		 * 3. 메서드 : 데이터입력, 데이터의 리턴처리, 조건문이나 반복문에 의해 알고리즘 처리 등
		 * 				여러가지 기능적인 처리를 하는 함수
		 * 		1) 리턴값 선언 / 리턴값 처리
		 * 		2) 입력값 처리
		 * 		3) 중괄호({}) 블럭을 통한 여러가지 비지니스 로직 처리
		 * 
		 * # 필드 
		 * 1. 필드의 종류
		 *  	1) 객체의 고유 데이터 선언
		 * 		2) 객체가 가져야할 부품객체 ( 1:1, 1:다객체 )
		 * 		3) 객체의 현재 상태 데이터
		 * 2. 필드의 접근제어자
		 * 		1) 필드는 일반적으로 private로 접근자를 선언하여 외부에서 직접적으로 접근할 수 없게 한다.  
		 * 			간접적인 접근을 할 수 있다. (특정한 기능 메서드를 통해서)
		 * 			ex) 리모콘과 TV에서 채널을 변경할 때, 리모컨의 버튼을 통해서만 가능
		 * 3. 필드의 사용
		 * 		1) 객체의 생성 후 
		 * 			Person p01 = new Person();
		 * 		2) 참조변수.필드명 형태 (접근제어자가 호출 가능한 범위로 선언시
		 * 			p01.name = "홍길동";
		 * 		3) 하나의 객체안에는 여러가지 형태의 필드를 선언할 수 있다.
		 * 			이름, 나이, 사는 곳 등으로 여러가지 다른 유형으로 선언
		 * 		4) 이 필드는 클래스의 관점에서 보면, 전역변수로 해당 클래스 내에서 다른 구성요소 (생성자, 메서드) 에서는 접근해서
		 * 			할당할 수 있다. 
		 * 		5) 생성자나 메서드의 매개변수나 지역변수가 동일한 명으로 선언되어 있을 때는 this.필드명으로 구분하여 사용
		 * 
		 * */
		
		/*Car c01 = new Car();
		c01.kind = "그랜저";
		c01.maxSpeed = 220;
		Car c02 = new Car();
		c02.kind = "소나타";
		c02.maxSpeed = 200;
		
		System.out.println("c02의 차량의 종류 : " + c02.kind);
		System.out.println("c02의 차량의 최대속도 : " + c02.maxSpeed);*/
		
		
		// 아래의 같은 속성을 가진 클래스를 선언하고, main 에서 호출하세요
		// 1. Bus(버스번호, 경유지(시작~ 끝))
		// 2. Car(종류, 나이, 성별)
		// 3. Computer(제조사, 사양)
		/*Bus bus = new Bus();
		
		bus.busNum = 123;
		bus.placeStart = "강남";
		bus.placeEnd = "역삼";
		
		Car car = new Car();
		
		car.kind = "벤츠";
		car.year = 3;
		car.color = "red";
		
		Computer computer = new Computer();
		computer.com = "삼성";
		computer.spec = "짱좋음";*/
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Student[] students = new Student[3];
		students[0].num = 1;
		students[0].name = "홍길동";
		students[0].kor = 90;
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		
		s1.num = 1;
		s1.name = "홍길동";
		s1.kor = 80;
		s2.num = 2;
		s2.name = "철수";
		s2.kor = 50;
		s3.num = 3;
		s3.name = "영희";
		s3.kor = 78;
		
		System.out.println((s1.kor + s2.kor + s3.kor) / 3.0);

	}

}

class Bus {
	int busNum;
	String placeStart;
	String placeEnd;
}

class Car{
	String kind;
	int year; 
	String color;
}

class Computer {
	String com;
	String spec;
}

class Student {
	int num;
	String name;
	int kor;
}

/*class Car {
	String kind;
	int maxSpeed;
	
}*/




