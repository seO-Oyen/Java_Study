package javaexp.a06_object.vo;

import java.util.ArrayList;
import java.util.List;

// 다수의 내용을 포함하는 클래스
public class School {
	private String name; // 학교명
	// 다수의 Student를 동적으로 포함할 수 있는 객체 
	private List<Student> students;
	
	public School() {
		
	}
	
	public School(String name) {
		this.name = name;
		students = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	// 등록된 학생 리스트
	public void showSchoolInfo() {
		System.out.println("# " + name + "학교의 학생정보 #");
		
		if (students.size() > 0) {
			for (Student student : students) {
				System.out.print(student.getStudentNum() + "\t");
				System.out.print(student.getName() + "\t");
				System.out.println(student.getGrade());
			}
		} else {
			System.out.println("학생이 없음");
		}
	}
	
	// 학생 등록
	public void regStudent(Student student) {
		students.add(student);
		System.out.println(student.getName() + " 학생을 등록했습니다");
		System.out.println("현재 학생 수 : " + students.size());
	}

}
