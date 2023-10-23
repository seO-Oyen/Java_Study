package javaexp.z01_homework;

public class A1010 {
	public static void main(String[] args) {
		
//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
		/*
		 * 1. 부모 클래스
		 * class A {}
		 * 2. 자식 클래스 선언 (extends 사용)
		 * class B extends A {}
		 * 
		 * 자식 클래스는 부모클래스의 내용을 쓸수 있다. (super)
		 * */
//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
		/*
		 * class Parent {
		 * 		String name;
		 * 		Parent() {
		 * 		}
		 * }
		 * class Child extends Parent {
		 * 		String name;
		 * 		Child() {
		 * 			super(); // => 생성자 메소드 상속
		 * 		}
		 * }
		 * */
//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
		/*
		 * 상속받은 클래스를 사용할때
		 * */
//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
		// Dog dog = new Dog("강아지");
//		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//				introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//				introduce() 메서드를 통해 학년도 함께 소개합니다.
		// Student student = new Student("홍길동", 19, 3);
		// student.introduce();
//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. 
//		Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, 
//		Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
		// Dog dog = new Dog("강아지");
		// Cat cat = new Cat("고양이");
//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
		// Employee employee = new Employee("홍길동", 30);
		// employee.setEmployee("토스", "백엔드 개발자");
		// employee.introduce();
//		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고, Student 클래스의 생성자에서는 grade를 초기화합니다.
//      # 위 과제는 개인톡으로 전달부탁합니다.		
		
	}
}

class Person {
	String name; 
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("이름은 " + name + ", 나이는 " + age);
	}
}

class Employee extends Person {
	String company;
	String job;
	
	public Employee(String name, int age) {
		super(name, age);
		name = null;
		job = null;
	}
	
	void setEmployee(String company, String job) {
		this.company = company;
		this.job = job;
	}
	
	void introduce() {
		super.introduce();
		System.out.println("회사는 " + company + ", 직업은 " + job);
	}
	
}


class Student extends Person {
	int grade;

	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	void introduce() {
		super.introduce();
		System.out.println("학년은 " + grade);
	}
}

class Animal2 {
	String kind;
	
	void sound(String sound) {
		System.out.println(this.kind + "는");
		System.out.println(sound + "하고 웁니다");
	}
}
class Dog extends Animal2 {
	Dog(String kind) {
		super.kind = kind;
		
		super.sound("멍멍");
	}
}
class Cat extends Animal2 {
	Cat (String kind) {
		super.kind = kind;
		super.sound("야옹");
	}
}
