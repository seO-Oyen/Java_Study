package javaexp.a08_access.story2.son1home;

import javaexp.a08_access.story2.woodcutterhome.WoodCutter;

public class Son1 extends WoodCutter {
	
	public void callWoodCutterInhit() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private : " + wc.privSecurity);
//		System.out.println("default : " + wc.savingMoney);
//		System.out.println("protected : " + wc.inhiritance);
		System.out.println("public : " + wc.announce);
	}

}
