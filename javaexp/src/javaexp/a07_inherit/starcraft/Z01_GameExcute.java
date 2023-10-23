package javaexp.a07_inherit.starcraft;

public class Z01_GameExcute {
	
	public static void main(String[] args) {
		
//		Larba l1 = new Larba();
//		l1.attack(); 
		Dron d1 = new Dron();
		d1.attack(); // 동일한 메서드에서 재정의
		
		Hydra h1 = new Hydra();
		h1.attack();
		
		// 공통으로 동일한 내용 처리
//		l1.gameInfo();
		d1.gameInfo();
		h1.gameInfo();
		
		// 다형성 : 상위 = 하위객체
		Larba l2 = new Dron();
		Larba l3 = new Hydra();
		
		System.out.println("다형성의 의해 만들어진 재정의 메서드");
		l2.attack();
		l3.attack();
		
		
	}

}
