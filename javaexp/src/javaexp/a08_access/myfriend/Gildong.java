package javaexp.a08_access.myfriend;

public class Gildong {
	// 같은 패키지에서만 공유하는 정보
	String freindPlan = "여름에 제주도 친구들과 여행계획";
	
	void goWeekMeeting() {
		System.out.println("친구들과 주말 모임");
	}
	
	public void callGildongInfo() {
		Gildong g = new Gildong();
		System.out.println(g.freindPlan);
		g.goWeekMeeting();
	}

}
