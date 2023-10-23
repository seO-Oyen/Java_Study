package javaexp.a07_inherit;

import javaexp.a07_inherit.vo.Mother;
import javaexp.a07_inherit.vo.Player;

// 0922 # 상속
public class A01_Basic {

	public static void main(String[] args) {
		
		Son s1 = new Son();
		s1.name = "아들 홍길동";
		s1.age = 25;
		s1.show(); // 상위 클래스에 있으면 그대로 사용 가능

	}

}

class Father {
	String name;
	
	void show() {
		System.out.println("이름 : " + name);
	}
}

class Son extends Father {
	int age;
	void show2() {
		show();
		System.out.println("나이 : " + age);
	}
}

class Daughter extends Mother {
	private int height;
	
	public void goShpping() {
		System.out.println("쇼핑을 합니다");
	}
}

class Scoccerlayer extends Player {
	
	public void drivingBall() {
		running();
		System.out.println("공을 몰다");
	}
}
