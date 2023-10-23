package javaexp.a07_inherit.starcraft;

// 추상메서드가 1개라도 있으면 추상클래스가 된다
public abstract class Larba {
	
	public void gameInfo() {
		System.out.println("저그 유닛입니다.");
	}
	
	public abstract void attack();

}

