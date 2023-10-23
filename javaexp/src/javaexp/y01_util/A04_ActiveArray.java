package javaexp.y01_util;

import java.util.ArrayList;

import javaexp.a06_object.vo.Car;
import javaexp.a06_object.vo.Student;

public class A04_ActiveArray {

	public static void main(String[] args) {
		
		/*
		 * # 동적 배열
		 * 1. 자바의 기본 배열은 한번 크기가 정해지면, 변경을 할 수 없다.
		 * 2. 자바에서는 동적 배열을 지원하는 객체를 api에서 제공하고 있다.
		 * 		1) Collection 안에 List/ArrayList
		 * 3. ArrayList<타입>로 여러가지 객체들을 동적으로 추가하거나 삭제할 수 있다.
		 * */
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		fruits.set(0, "오렌지"); //특정한 index위치 변경
		System.out.println("---변경후---");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		fruits.remove(1);
		System.out.println("---삭제 후---");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// ex) members 라는 이름으로 동적 배열을 위와같이 만들고
		//		회원이름 3명을 추가, 2번째 데이터 변경, 마지막데이터 삭제
		
		ArrayList<String> members = new ArrayList<String>();
		
		members.add("홍길동");
		members.add("김길동");
		members.add("신길동");
		for (String member : members) {
			System.out.println(member);
		}
		
		members.set(1, "이길동");
		System.out.println("# 변경 후 #");
		for (String member : members) {
			System.out.println(member);
		}
		
		members.remove(2);
		System.out.println("# 삭제 후 #");
		for (String member : members) {
			System.out.println(member);
		}
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "홍길동", 2));
		students.add(new Student(2, "김길동", 3));
		students.add(new Student(3, "신길동", 1));
		
		students.set(0, new Student(4, "오길동", 1));
		students.remove(1);
		
		System.out.println("# 학생 동적 배열 리스트 #");
		for (Student student : students) {
			System.out.print(student.getStudentNum() + "\t");
			System.out.print(student.getName() + "\t");
			System.out.println(student.getGrade());
		}
		
		// ex) Car(종류, 속도) 5개를 위 ArrayList형식으로 추가 3번째 변경 1번째 삭제
		ArrayList<Car> cars = new ArrayList<Car>();
		
		cars.add(new Car(20, "그랜저"));
		cars.add(new Car(10, "벤츠"));
		cars.add(new Car(28, "테슬라"));
		cars.add(new Car(46, "현대"));
		cars.add(new Car(31, "기아"));
		
		cars.set(2, new Car(49, "모닝"));
		cars.remove(0);
		
		for (Car car : cars) {
			System.out.print(car.getSpeed() + "\t");
			System.out.println(car.getKind());
		}
		
		
		

	}

}
