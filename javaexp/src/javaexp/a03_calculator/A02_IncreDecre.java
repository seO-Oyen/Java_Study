package javaexp.a03_calculator;

public class A02_IncreDecre {

	public static void main(String[] args) {
		
		int no = 0;
		
		System.out.println(++no); // 증가시키고 출력
		System.out.println(++no);
		System.out.println(++no);
		
		System.out.println(no++); // 출력하고 증가
		System.out.println(no++);
		System.out.println(no++);
		
		System.out.println(--no);
		System.out.println(--no);
		System.out.println(--no);
		
		System.out.println(no--);
		System.out.println(no--);
		System.out.println(no--);
		
		int no2 = 0;
		no2 += 2;
		no2 += 2;
		no2 += 2;

		System.out.println(no2);
		
		// ex1) no3을 초기값을 0으로 설정하고, 3씩 3번 증가 한 결과값을 출력
		int no3 = 0;
		no3 += 3;
		no3 += 3;
		no3 += 3;
		
		System.out.println(no3);
		
		// ex2) no4를 초기값을 10으로 설정하고, 1씩 감소 5번한 내용을 출력하세요
		int no4 = 10;
		no4--;
		no4--;
		no4--;
		no4--;
		no4--;
		
		System.out.println(no4);
		
		// ex3) no5를 초기값을 100으로 설정하고, 2씩 5번 감소한 내용을 출력하세요
		int no5 = 100;
		no5 -= 2;
		no5 -= 2;
		no5 -= 2;
		no5 -= 2;
		no5 -= 2;

		System.out.println(no5);
		
		int num01 = 1;
		System.out.println("\n\n# 사칙 누적 연산");
		System.out.println("num01 *= 2 : " + (num01 *= 2));
		System.out.println("num01 *= 2 : " + (num01 *= 2));
		System.out.println("num01 *= 2 : " + (num01 *= 2));
		System.out.println("num01 /= 2 : " + (num01 /= 2));
		System.out.println("num01 /= 2 : " + (num01 /= 2));
		System.out.println("num01 %= 2 : " + (num01 %= 2));
		System.out.println("num01 %= 2 : " + (num01 %= 2));
		
	}

}
