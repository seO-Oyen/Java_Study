package javaexp.a06_objectreview;

import javaexp.a06_objectreview.vo.Employee;
import javaexp.a06_objectreview.vo.Office;
import javaexp.a06_objectreview.vo.Student;
import javaexp.a06_objectreview.vo.Subject;

public class A05_ObjVsObjExp {

	public static void main(String[] args) {
		
		/*
		 * ex) Office (포함될 객체)
		 * 		location(위치), capcity(수용인원)
		 * 	   Employee(포함될 객체)
		 * 		name(이름), age(나이)
		 * 		Office office
		 * 
		 * */
		
		Employee emp = new Employee("홍길동", 25);
		emp.showMyOfficeInfo();
		emp.setOffice(new Office("서울 서초동", 20));
		emp.showMyOfficeInfo();
		
		emp.setOffice(new Office("서울 강남구", 30));
		emp.showMyOfficeInfo();
		

		/*
		 * ex) 
		 * Subject 포함될 클래스
		 * 		과목, 점수
		 * 
		 * Student 포함할 클래스
		 * 		번호 이름
		 * 		Subject subject;
		 * 		void showMyPoint()
		 * */
		
		Student student = new Student(2, "홍길동");
		student.showMyPoint();
		student.setSubject(new Subject("국어", 80));
		student.showMyPoint();
		
	}

}
