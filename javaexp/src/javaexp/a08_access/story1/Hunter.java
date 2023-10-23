package javaexp.a08_access.story1;

import javaexp.a08_access.story1.friendship.WoodCutter;

public class Hunter {

	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		// System.out.println("private : " + wc.hiddenCloth);
		// default는 같은 패키지 클래스끼리만 접근이 가능
		// System.out.println("default : " + wc.hiddenDeer);
	}
	
}
