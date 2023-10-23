package javaexp.a06_objectreview;

public class A06_ObjVsObjExp {

	public static void main(String[] args) {
		
		Person2 person = new Person2(20, "홍길동");
		person.showPerson();
		Passport passport = new Passport("123-74", "대한민국", person);
		passport.showPassport();
		person.setPassport(passport);
		person.showPerson();

	}

}

class Person2 {
	private int age;
	private String name;
	private Passport passport;
	public Person2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	public void showPerson() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		
		if (passport != null) {
			System.out.println("여권 번호 : " + passport.getPassportNum());
		} else {
			System.out.println("여권 X");
		}
	}
	
}

class Passport {
	private String passportNum;
	private String country;
	private Person2 person;
	
	public Passport(String passportNum, String country, Person2 person) {
		this.passportNum = passportNum;
		this.country = country;
		this.person = person;
	}

	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Person2 getPerson() {
		return person;
	}
	public void setPerson(Person2 person) {
		this.person = person;
	}
	
	public void showPassport() {
		System.out.println("여권 번호 : " + passportNum);
		System.out.println("나라 : " + country);
		System.out.println("이름 : " + person.getName());
	}
	
}