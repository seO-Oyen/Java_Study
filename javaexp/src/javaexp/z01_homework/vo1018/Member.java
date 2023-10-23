package javaexp.z01_homework.vo1018;

public class Member {
	private String id;
	private String pass;
	private String name;
	private boolean isAdmin;
	private int point;
	
	public Member(String id, String pass, String name, boolean isAdmin, int point) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.isAdmin = isAdmin;
		this.point = point;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
