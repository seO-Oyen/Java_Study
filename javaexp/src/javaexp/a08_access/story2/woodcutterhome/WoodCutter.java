package javaexp.a08_access.story2.woodcutterhome;

public class WoodCutter {
	
	private String privSecurity = "천사옷은 뒷동산 바위 밑에";
	String savingMoney = "뒷 마당 항아리 밑에";
	protected String inhiritance = "집 천장 위에";
	public String announce = "막내딸이이달 보름에 결혼합니다.";
	
	public void callWoodCutterInhit() {
		System.out.println("private : " + privSecurity);
		System.out.println("default : " + savingMoney);
		System.out.println("protected : " + inhiritance);
		System.out.println("public : " + announce);
	}
}
