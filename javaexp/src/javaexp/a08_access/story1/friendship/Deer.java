package javaexp.a08_access.story1.friendship;

public class Deer {
	
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		// private 는 자기자신 클래스에서만 접근 가능
		// System.out.println("private : " + wc.hiddenCloth);
		System.out.println("default : " + wc.hiddenDeer);
	}

}
