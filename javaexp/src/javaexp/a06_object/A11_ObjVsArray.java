package javaexp.a06_object;

import javaexp.a06_object.vo.School;
import javaexp.a06_object.vo.Student;

public class A11_ObjVsArray {

	public static void main(String[] args) {
		
		/*
		 * # 1 : 다관계 처리
		 * - 프로그램에서 여러가지 경우에 1:다관계로 데이터를 처리해야하는 경우가 데이터 관점에서 발생
		 * - 예시
		 * 		1) 학교나 반에서 포함된 학생들 정보 
		 * 		2) 쇼핑몰에서 판매하는 물건들 정보나 회원들 정보
		 * 		3) 출판사에서 출판한 책들
		 * - 처리방법
		 * 		1) 1:다관계에서 여러가지 처리하는 다수의 객체의 단일 데이터에 대한 클래스 설정 구조 처리
		 * 		2) 다수의 객체를포함하는 클래스 선언
		 * 			- 기본 속성
		 * 			- 배열 / 동적배열 형태의 객체 선언
		 * 
		 * */

		School school = new School("쌍용");
		school.showSchoolInfo();
		school.regStudent(new Student(1, "홍길동", 1));
		school.regStudent(new Student(2, "김길동", 1));
		school.regStudent(new Student(3, "신길동", 1));
		school.showSchoolInfo();
		
		
	}

}
