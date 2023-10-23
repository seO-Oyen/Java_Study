package javaexp.a06_objectreview;

import javaexp.a06_objectreview.vo.Bicycle;
import javaexp.a06_objectreview.vo.Book;
import javaexp.a06_objectreview.vo.Food;
// 외부패키지에 있는 클래스 import
import javaexp.a06_objectreview.vo.Person;

public class A01_Basic {

	public static void main(String[] args) {
		
		/*
		 * # 클래스와 객체
		 * 1. 클래스는 틀/도면역할로 프로그램이 실제 실행되기 전에 선언하는 것을 말한다.
		 * 2. 객체는 이 틀/도면으로부터 main()에서 실제 실행할 메모리를 할당하여 처리할 수 있는 것을 말한다.
		 * 3. 클래스로부터 여러가지 객체를 만들 수 있다
		 * 
		 * # 연습단계
		 * 1. 클래스 만들어 보기
		 * 		1) 같은 패키지 
		 * 		2) 다른 패키지
		 * 2. 클래스의 기본 구성 형태에 따른 내용 확인
		 * 		1) package : 클래스를 통해서 만들어질 객체가 위치하는 묶음 단위
		 * 		2) 같은 패키지는 바로 사용 가능 / 접근 제어자도 필요없음
		 * 		3) 다른 패키지는 접근제어자 public 필요, import 한 뒤 호출하여 처리
		 * 3. 클래스의 구성 요소
		 * 		1) 필드 : 클래스로부터 만들어질 객체가 사용하는 기본 메모리 부분 설정하는 부분
		 * 				데이터 유형에 따라 선언하고 여러가지로 선언 가능하다
		 * 		2) 생성자 : 객체가 생성할 때, 필드값을 초기화 하기 위한 기능 메서드이다.
		 * 					클래스명하고 동일하다
		 * 		3) 기능메서드 : 객체가 생성된 후, 사용할 공통기능에 대한 처리나 데이터를 저장 / 호출할때 사용된다
		 * 				- 리턴값
		 * 				- 매개변수 
		 * 				- 프로세스
		 * 				위 3가지 구성요소를 혼합해서 원하는 기능 / 로직을 처리한다
		 * 		4) 각 구성요소를 혼합한 객체 처리
		 * 4. 여러개의 객체를 혼합한 내용 처리하기
		 * 		1) 접근제어자 public, default, protected, private 이해 및 연습
		 * */
		
		// 외부패키지에 있는 클래스를 객체화하기 위해서 선언할 때 필요로 하는 접근제어자 : public
		// 1. 해당 클래스에서는 public 이 선언
		// 2. 호출하는 곳에서는 import 
		Person p01;
		Music m01; // 같은 패키지의 경우 public 이 아니더라도 선언 가능
		Bus b01;
		
		
		
		// ex) vo 패키지에 Food 클래스 선언하고 main() 에서 선언하고
		//		하단에 Computer 클래스를 선언하고 main() 호출해서 두 클래스의 접근범위의 차이점을 조원과 함께 이야기한후
		//		처리 cf) package, public, import의 각각 필요성 알고있는가?
		Food f01;
		Computer c01;
		
		// 클래스가 선언되면 여1려개의 참조변수명으로 선언이 가능하다
		Computer com1 = null;
		Computer com2 = null; // heap 메모리에 할당되지 않음 stack영역에 변수만 선언
		Computer com3;
		
		System.out.println(com1);
		System.out.println(com2);

		com3 = new Computer(); // com1에 stack 영역에 Computer 객체가 생성된 heap영역의 주소를 할당한다
		System.out.println(com3);
		// new 생성자()를 생성할 수 있는 이유는 클래스안에 생성자를 선언하지 않으면 컴파일시
		// default 생성자인 public 클래스() {}를 자동으로 생성되기 때문이다
		
		// 선언부분은 접근제어자 class
		// 생성자에도 접근제어자에 의해 접근 여부를 처리한다
		// ==> 클래스를 구성하는 모든 구성요소에 접근제어자에 따라 처리한다
		Food f02 = null;
		f02 = new Food();
		// f02 = new Food("짜장면"); 접근제어자가 public이 아니기에 외부패키지에서는 접근이 불가능 하다
		
		// ex) vo 하위에 Book 클래스 선언
		//		매개변수가 없는 생성자, 매개변수 1개 있는 생성자 호출
		Book book = new Book();
		Book book2 = new Book("자바의 정석");
		
		// ex) Bicycle 클래스를 선언하고
		//		생성자가 없는것, 생성자의 매개변수1, 매개변수 2개 선언하고 호출하세요
		Bicycle bicycle = new Bicycle();
		Bicycle bicycle2 = new Bicycle("좋은거");
		Bicycle bicycle3 = new Bicycle("좋은거", "삼천리");
	}

}

class Bus {}
class Computer {}
