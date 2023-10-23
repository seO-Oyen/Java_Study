package javaexp.a03_calculator;

public class A05_TripleCalcu {

	public static void main(String[] args) {
		
		/*
		 * # 삼항연산자
		 * 
		 * */
		
		int rNum = (int)(Math.random() * 10 + 1);
		String result = rNum % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println("임의의 수 : " + rNum);
		System.out.println("결과 : " + result);
		
		String result2 = rNum % 3 == 0 ? "3의 배수" : "3의 배수 아님";
		System.out.println("결과 2 : " + result2);
		
		String id = "himan";
		String pass = "7777";
		String loginRst = id.equals("himan") && pass.equals("7777") ? "로그인 성공" : "로그인 실패";
		System.out.println("로그인 결과 : " + loginRst);
		
		// ex) 주사위를 던진 결과가 team01에 할당하고, 4이상 나오면 게임에서 승리한다고 할 때 승리와 패배를 나누어서 출력
		
		int team01 = (int)(Math.random() * 6 + 1);
		
		System.out.println("주사위 수: " + team01 + "\t결과 : " + (team01 >= 4 ? "승리" : "패배"));

		
		// 0, 1, 2 나오게 해서 0 가위 1 바위 2 보를 출력 처리
		int game01 = (int)(Math.random() * 3);
		System.out.println(game01 == 0 ? "가위" : game01 == 1 ? "바위" : "보");
		
	}

}
