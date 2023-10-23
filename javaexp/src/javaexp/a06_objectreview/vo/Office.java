package javaexp.a06_objectreview.vo;

public class Office {
	private String location;
	private int capity;
	
	public Office() {
	}
	public Office(String location, int capity) {
		this.location = location;
		this.capity = capity;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapity() {
		return capity;
	}
	public void setCapity(int capity) {
		this.capity = capity;
	}
	
	

}
