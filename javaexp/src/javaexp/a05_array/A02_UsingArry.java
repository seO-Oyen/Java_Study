package javaexp.a05_array;

public class A02_UsingArry {

	public static void main(String[] args) {
		
		/*String[] fruits = {"사과", "바나나", "딸기"};
		int[] fruPrices = new int[3];
		fruPrices[0] = 2000; // 배열명[index번호]로 저장할 수 있다.
		fruPrices[1] = 4000;
		fruPrices[2] = 12000;
		// fruPrices[3] = 5000; -> 에러 발생 : 배열의 크기보다 더 많은 index 호출
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruPrices[0]);
		System.out.println(fruPrices[1]);
		System.out.println(fruPrices[2]);
		// 배열에 저장된 데이터 index 호출하여 가져올 수 있다.
		
		System.out.println("과일들의 배열의 크기 : " + fruits.length);
		System.out.println("과일가격의 배열의 크기 : " + fruPrices.length);*/
		
		// ex) 3명의 학생 학점등급을 'A' 등으로 할당하였다. 배열에 할당하여 출력하세요
		/*char grade[] = {'A', 'C', 'D'};
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);*/
		
		// ex) 회원의 몸무게를 소숫점 1자리까지 저장. 5명을 배열로 초기선언 하고 index로 접근하여 할당하고 출력
		/*double weights[] = new double[5];
		weights[0] = 47.9;
		weights[1] = 52.3;
		weights[2] = 54.2;
		weights[3] = 64.1;
		weights[4] = 58.7;
		
		System.out.println(weights[0]);
		System.out.println(weights[1]);
		System.out.println(weights[2]);
		System.out.println(weights[3]);
		System.out.println(weights[4]);*/
		
		// int i = 0; : 배열의 시작 index
		// i < weights.length : 배열의 한계치 범위
		// i++ : 배열의 증가 처리
		// weights[i] : 배열의 구성요소 접근 처리
		/*for (int i = 0; i < weights.length; i++) {
			System.out.println(i + 1 + "번째 몸무게 " + weights[i] + "kg");
		}*/
		
		/*for (double weight : weights) {
			System.out.println(weight);
		}*/
		
		// ex) 회원 3명의 이름과 회원의 나이를 배열로 선언 할당 후, 반복문 for 를 통해서 출력하세요
		/*String names[] = {"홍길동", "김철수", "이영희"};
		int ages[] = {20, 43, 38};
		
		System.out.println("번호\t회원명\t나이");
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + 1 + "\t" + names[i] + "\t" + ages[i]);
		}*/
		
		// for (단위 : 배열)
		/*System.out.println("# forEach 구문");
		for (String name : names) {
			System.out.println(name);
		}*/
		
		// ex) 위 ags를 forEach 구문을 통해 출력하고 전역변수를 활용해서 평균나이를 출력
		// 전역변수를 추가 하고 최대나이를 출력하세요
		/*int totalAge = 0;
		int ages[] = {20, 43, 38};
		int maxAge = 0;
		
		for (int age : ages) {
			System.out.println(age);
			totalAge += age;
			if (age > maxAge) maxAge = age;
		}
		
		System.out.println("총 나이 : " + totalAge);
		System.out.println("평균 나이 : " + (double)totalAge / ages.length);
		System.out.println("최대 나이 : " + maxAge);*/
		
		// 영어의 알파벳의 모음 여부 출력하기
		/*char[] greets = {'H', 'e', 'l', 'L', 'o'};
		
		// 모음 여부
		for (char greet : greets) {
			if (greet == 'a' || greet == 'e' || greet == 'i' || greet == 'o' || greet == 'u') {
				System.out.print("[모음]");
			}
			System.out.print(greet + " ");
		}
		System.out.println();
		
		// 대소문자 구분
		for (char greet : greets) {
			if (greet >= 97 && greet <= 122) {
				System.out.print("[소문자]");
			} else {
				System.out.print("[대문자]");
			}
			System.out.print(greet + " ");
		}*/
		
		byte bytes[] = new byte[8];
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte)(Math.random() * 90 + 33);
		}
		
		// byte[] ==> char[] ==> String
		String tmpPass = new String(bytes);
		System.out.println("임의의 비번 : " + tmpPass);
		
		// 33 ~ 122
		/*for (int i = 33; i <= 122; i++) {
			System.out.println(i + " : " + (char)i);
		}*/
		

	}

}
