package javaexp.a06_objectreview.vo;

public class Subject {
	
	private String subject;
	private int score;
	
	public Subject(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void showSubject() {
		System.out.println("과목 : " + subject);
		System.out.println("점수 : " + score);
	}

}
