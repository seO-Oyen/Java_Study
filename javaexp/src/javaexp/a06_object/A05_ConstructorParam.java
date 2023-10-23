package javaexp.a06_object;

// 0921 # 매개변수의 선언과 활용
public class A05_ConstructorParam {

	public static void main(String[] args) {
		
		/*new ParamExp();
		// new ParamExp(5); // String str = 5; -> String에 정수를 입력하려니까 에러
		new ParamExp("홍길동"); //String str = "홍길동" 이 처리가 가능하니 에러 X
		new ParamExp(25); // int num01 = 25; 가능 */
		
		// ex) class ParamExp2로 선언하고, 매개변수가 없는 것,
		// 	   문자열 데이터 할당, 정수형 데이터 할당, 실수형 데이터할당
		// 	   생성자를 선언하고 호출하세요
		/*new ParamExp2();
		new ParamExp2("문자열");
		new ParamExp2(4);
		new ParamExp2(2.5);*/
		
		// 전달시 구분해서 넘길 수 있을 때 선언이 가능 
		/*new ParamExp2("홍길동", 25);
		new ParamExp2(25, "홍길동");*/
		
		/*Person01 p01 = new Person01();
		System.out.println("이름 : " + p01.name);
		System.out.println("나이 : " + p01.age);
		System.out.println("주소 : " + p01.loc);
		
		Person01 p02 = new Person01("홍길동", 35);
		System.out.println("매개변수 2 (이름, 나이)");
		System.out.println("이름 : " + p02.name);
		System.out.println("나이 : " + p02.age);
		System.out.println("주소 : " + p02.loc);
		
		Person01 p03 = new Person01("마길동", 27, "서울");
		System.out.println("이름 : " + p03.name);
		System.out.println("나이 : " + p03.age);
		System.out.println("주소 : " + p03.loc);*/
		
		// 객체로 생성하는 순간
		// String 과 같이 객체의 경우 heap메모리에 할당되지 않는 경우 default값이 null
		// 숫자형의 경우 객체는 default로 0이 할당이 된다.
		// main() 에서 쓰는 데이터는 초기화를 하여야 사용이 가능하다.
		// 객체에 종속된 변수는 객체 생성시 자동으로 초기화가 되어있기 때문에 바로 사용할 수 있다.
		Product01 product01 = new Product01();
		Product01 product02 = new Product01("사과");
		Product01 product03 = new Product01(2000);
		Product01 product04 = new Product01("바나나", 5000, 3);
		
		System.out.println("# 매개변수 X");
		System.out.println(product01.name);
		System.out.println(product01.price);
		System.out.println(product01.count);
		
		System.out.println("# 매개변수 1개 (물건명)");
		System.out.println(product02.name);
		System.out.println(product02.price);
		System.out.println(product02.count);
		
		System.out.println("# 매개변수 1개 (가격)");
		System.out.println(product03.name);
		System.out.println(product03.price);
		System.out.println(product03.count);
		
		System.out.println("# 매개변수 3개 (물건명, 가격, 갯수)");
		System.out.println(product04.name);
		System.out.println(product04.price);
		System.out.println(product04.count);
		

	}

}

/*class ParamExp {
	ParamExp() {
		System.out.println("매개변수가 없음.");
	}
	
	// 생성 오버로딩 규칙에 의해서 여러가지 매개변수 추가 선언
	ParamExp (String str) {
		System.out.println("문자열 1개 입력 : " + str);
	}
	
	ParamExp(int num01) {
		System.out.println("정수형 1개 입력 : " + num01);
	}
}*/

/*class ParamExp2 {
	ParamExp2() {
		System.out.println("매개변수 없음");
	}
	
	ParamExp2(String str) {
		System.out.println("문자열 데이터 할당 : " + str);
	}
	
	ParamExp2(int num01) {
		System.out.println("정수형 데이터 할당 : " + num01);
	}
	
	ParamExp2(double num02) {
		System.out.println("실수형 데이터 할당 : " + num02);
	}
	
	ParamExp2 (String name, int age) {
		System.out.println("# 매개변수 2개 #");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	ParamExp2 (int age, String name) {
		System.out.println("# 매개변수 2개 #");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}*/

// 동일한 package에서는 같은 이름의 클래스를 선언하지 못한다.
/*class Person01 {
	String name;
	int age;
	String loc;
	
	Person01() {
		// default 값 설정 처리
		name = "무명";
		age = 1;
		loc = "거주지 없음";
	}
	
	Person01 (String name) {
		this.name = name;
	}
	Person01 (int age) {
		this.age = age;
	}
	
	Person01 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person01 (String name, int age, String loc) {
		this.name = name;
		this.age = age;
		this.loc = loc;
		System.out.println("# 매개변수 3개 생성 (이름, 나이, 주소) #");
	}
}*/

// ex) Product01 클래스에 필드로 물건명, 가격, 갯수를 선언하고
// 		매개변수 없는 것 (초기값선언), 매개변수 1개 (물건), 매개변수1 (가격)
//		매개변수 3개 (물건명, 가격, 갯수) 로 선언하고 호출하게 하세요
class Product01 {
	String name;
	int price;
	int count;
	
	// 매개변수 없는 것
	Product01() {
		// null인경우 의미 없음 "" 경우에는 공백문자가 들어감
		name = "물건명";
		price = 0; // 의미없음. 자동 0 처리
	}
	
	// 매개변수 1개 (물건)
	Product01 (String name) {
		this.name = name;
	}
	
	// 매개변수 1개 (가격)
	Product01 (int price) {
		this.price = price;
	}
	
	// price와 cnt로 이름은 구분되지만 실제 정수형으로 선언되는 것으로 구분하기에 int 를 정의하면 에러 발생
	/*Product01 (int count) {
		this.count = count;
	}*/
	
	// 매개변수 3개 (물건명, 가격, 갯수)
	Product01 (String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
}
