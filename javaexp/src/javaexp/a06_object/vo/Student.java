package javaexp.a06_object.vo;

public class Student {
	int studentNum;
	String name;
	int grade;
	
	public Student(int studentNum, String name, int grade) {
		this.studentNum = studentNum;
		this.name = name;
		this.grade = grade;
	}


	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("번호 : " + this.getStudentNum());
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + getGrade());
	}

}
