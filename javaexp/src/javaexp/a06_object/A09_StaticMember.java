package javaexp.a06_object;

// 0921 # static 변수
public class A09_StaticMember {

	public static void main(String[] args) {

		// static 변수는 객체를 생성하지 않더라도 사용할 수 있다.
		Member01.no2++;
		Member01.no2++;
		Member01.no2++;
		
		Member01 member01 = new Member01();
		member01.no1++;
		member01.no2++;
		
		Member01 member02 = new Member01();
		member02.no1++;
		member02.no2++;
		
		Member01 member03 = new Member01();
		member03.no1++;
		member03.no2++;
		
		// 일반 변수는 객체마다 변수가 가지고 있지만
		System.out.println("일반변수 : " + member01.no1);
		System.out.println("일반변수 : " + member02.no1);
		System.out.println("일반변수 : " + member03.no1);
		// static 변수는 객체의 공유 메모리 이기에 모든 객체가 공유하고 있다.
		System.out.println("static변수 : " + member01.no2);
		// static변수는 객체의 공통은 class 변수라고 하기도 하고
		// 클래스명.static변수로 사용하기도 하며
		// 객체 생성없이도 사용할 수 있다.
		System.out.println("static변수 : " + Member01.no2);

		
		Member02 m1 = new Member02(5);
		Member02 m2 = new Member02(7);
		Member02 m3 = new Member02(9);
		
		System.out.println("상수 1 : " + m1.no3);
		System.out.println("상수 2 : " + m2.no3);
		System.out.println("상수 3 : " + m3.no3);
		// m1.no3 = 5; // 상수여서 변경 X
		
		System.out.println("static final 상수 : " + Member03.NO04);
		
		// 객체 생성없이 바로 사용가능하다
		// 사용하는 변수는 static 변수이다
		Member04.call();
		Member04.call();
		Member04.call();
		Member04.call();
		
		System.out.println(Math.PI); // static final
		Math.floor(2.5); // static 메서드
		Math.round(2.5); // static 메서드
		Math.ceil(2.5); // static 메서드
	}

}

class Member01 {
	int no1;
	static int no2;
	
}

class Member02 {
	final int no3;
	Member02(int no3) {
		this.no3 = no3;
	}
}

class Member03 {
	// 객체의 공유메모리인 클래스 단위로 상수 설정했기에 한번 할당하면 더이상 변경하지 못한다.
	static final int NO04 = 15;
}

class Member04 {
	static int no;
	int no2;
	static void call () {
		System.out.println("static 메서드 (객체 생성없이 사용)");
		System.out.println("static 변수 사용 : " + (++no));
		// System.out.println("일반 변수 사용 : " + (++no2)); // 에러발생
	}
}