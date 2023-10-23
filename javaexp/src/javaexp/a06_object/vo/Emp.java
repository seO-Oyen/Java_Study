package javaexp.a06_object.vo;

public class Emp {
	
	// 기본 속성 (private - 외부접근 불가)
	private int empNo;
	private String eName;
	private String job;
	private double salary;
	
	public Emp() {
		
	}

	public Emp(int empNo, String eName, String job, double salary) {
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void show() {
		System.out.println("사원번호 : " + empNo);
		System.out.println("사원명 : " + eName);
		System.out.println("직책명 : " + job);
		System.out.println("급여 : " + salary);
	}
}
