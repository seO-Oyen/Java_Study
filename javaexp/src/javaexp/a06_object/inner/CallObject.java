package javaexp.a06_object.inner;

import javaexp.a06_object.Baby;
import javaexp.a06_object.Book;
import javaexp.a06_object.Puppy;

// 앞에 패키지명이 같더라도 모든 패키지가 다르면 다른 패키지명이다
public class CallObject {

	public static void main(String[] args) {
		
		// 외부 패키지에 있는 클래스를 객체로 생성하려면 
		// 1. import
		// 2. 객체 생성해서
		// 3. 해당 구성요소가 접근제어자가 public 이어야한다.
		Puppy p01 = new Puppy();
		// p01.kind는 접근제어자가 public이 아니기에 외부패키지에서는 호출이 안된다.
		p01.name = "댕댕이2";
		
		Book b1 = new Book();
		b1.title = "굿";
//		b1.price = 0; // 에러남 : public 이 아니기 때문 -> 외부에서 직접적으로 호출 불가
		
		// 다른 패키지에 선언된 클래스를 객체로 사용하려면
		// 1. import
		// 2. class 앞에 접근제어자가 public
		Baby baby;

	}

}
