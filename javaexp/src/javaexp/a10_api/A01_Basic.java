package javaexp.a10_api;

import java.util.ArrayList;

public class A01_Basic {
	public static void main(String[] args) {
		Person p01 = new Person();
		System.out.println(p01); // => 주소값이 나옴
		
		// Object는 최상위 이기에 다형성에 의해서 
		Object ob1 = new Person();
		Object ob2 = "안녕";
		Object ob3 = new ArrayList();
		
	}

}

// 자바의 모든 클래스는 묵시적으로 extends Object 로 처리되고 있다.
// Object 는 자바의 최상위 부모 클래스
class Person {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "비밀 : " +  super.toString();
	}
	
	
}