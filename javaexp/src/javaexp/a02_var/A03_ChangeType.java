package javaexp.a02_var;

public class A03_ChangeType {

	public static void main(String[] args) {

		/*byte num01 = 25;
		int num02 = num01; // 자동형변환
		double num03 = num02; // 자동형변환
		
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		
		double num04 = 24322.345;
		int num05 = (int)num04; // **강제형변환 (casting
		byte num06 = (byte)num05; // 강제형변환
		
		System.out.println(num04);
		System.out.println(num05);
		System.out.println(num06);*/
		
		/*
		 * 자바에서 정수 / 정수 ==> 정수
		 * 
		 * 실수형데이터가 필요한 경우 나눗셈 피연산자 하나를 강제 형변환해서 처리하여야 한다.
		 * */
		
//		System.out.println(10/(double)3);
		
		/*
		 * ex) 사용자로부터초를 입력받아, 해당 초를 '시, 분, 초'의 형태로 출력하세요
		 * */
		
		int time = 5233;
		int hour = time / 3600;
		time -= 3600 * hour;
		int min = time / 60;
		time -= 60 * min;
		
		System.out.println(hour +"시 " + min + "분 " + time + "초");
		
		/*String num01Str = "25";
		int num01 = Integer.parseInt(num01Str);
		
		String num02Str = "3.17";
		double num02 = Double.parseDouble(num02Str);
		
		System.out.println("정수형 변환 숫자 + 10 : " + (num01 + 10));
		System.out.println("실수형 변환 숫자 + 10.5 : " + (num02 + 10.5));*/
		
	}

}
