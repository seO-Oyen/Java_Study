package javaexp.a06_objectreview.vo;

public class Student {
	private int num;
	private String name;
	private Subject subject;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void showMyPoint() {
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
		
		if (subject != null) {
			subject.showSubject();
		} else {
			System.out.println("없음");
		}
	}

}
