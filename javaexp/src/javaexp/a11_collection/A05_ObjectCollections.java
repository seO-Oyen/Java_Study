package javaexp.a11_collection;

import java.util.ArrayList;
import java.util.List;

import javaexp.a11_collection.vo.Person;
import javaexp.a11_collection.vo.Student;


public class A05_ObjectCollections {

	public static void main(String[] args) {
		
		/*
		 * # 객체형 Collection 활용
		 * 1. 자바의 클래스를 만들어서 단위 객체를 사용할 수 있게 하고 이것을 Collection에 활용하는 형태
		 * # 처리순서
		 * 1. class 선언
		 * 		컬렉션에 넣을 단위 내용을 VO클래스로 선언
		 * 2. List/Map에 할당하여 처리하기
		 * 		생성자나 메서드를 통해서 데이터를 넣은 컬렉션을 만든다
		 * 3. 반복문을 통해서 개별 단위 객체를 가지고 오고, 해당 속성들을 getXXX()에 의해서 로딩 및 활용한다.
		 * */
		
		// 학생 정보 (이름 / 국어 / 영어 / 수학)
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("홍길동", 70, 80, 90));
		students.add(new Student("김길동", 80, 80, 95));
		students.add(new Student("신길동", 100, 50, 30));
		
		for (Student student : students) {
			System.out.println(student.getName() + "\t" + student.getKor() + "\t" + student.getEng() + "\t" + student.getMath());
		}
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("홍길동", 21, "서울"));
		persons.add(new Person("김길동", 24, "경기"));
		persons.add(new Person("신길동", 32, "부산"));
		
		for (Person person : persons) {
			System.out.println(person.getName() + "\t" + person.getAge() + "\t" + person.getLoc());
		}

	}

}
