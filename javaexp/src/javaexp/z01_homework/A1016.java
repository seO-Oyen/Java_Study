package javaexp.z01_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A1016 {

	public static void main(String[] args) {
		/*
		[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
		try {
			// 예외가 발생할 만한 코드
		} catch (예외) {
			// 예외처리
		}
		
		[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
		try {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자 입력 : " + e.getMessage());
		}
		
		[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
		실행 예외 : 실행 한 후 나는 예외 (ex : 숫자 입력이지만 문자를 입력했을 경우)
		컴파일 예외 : 컴파일 단계에서 나는 예외
		
		[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
		> 데이터베이스 접근 또는 다른 에러에 대한 정보를 제공하는 예외
		
		[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
		> 여러가지 예외 경우에 다른 처리를 하기 위해
		
		[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
		> 예외가 발생한 곳에서 try ~ catch 블록으로 예외를 직접 처리할 수 있지만,
			자신이 직접 처리하지 않고, 메서드를 호출한 곳으로 예외를 위임(떠넘김) 할 때
			throws 키워드를 사용하여 위임
			void call() throws NullPointException {
				// 예외 처리
			}
			
			try {
				call();
			} catch (NullPointException e) {
				System.out.pirntln("예외");
			}
		
		[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
		try {
			int[] a = new int[3];
			System.out.println(a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 초과");
		}
		
		[1단계:개념]  8. 예외의 강제란 무엇인가?
		throw new ~~();
		을 하여 강제로 예외를 발생 시킴. 주로 예외발생 테스트할때 사용
		
		[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
			       데이터를 입력하게ㅐ 처리하세요.
			       Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("종료하겠습니까? (예 : 0, 아니오 : 1)");
				if (Integer.parseInt(scan.nextLine()) == 0) {
					break;
				}
				System.out.print("가격 : ");
				int price = Integer.parseInt(scan.nextLine());
				System.out.print("갯수 : ");
				int count = Integer.parseInt(scan.nextLine());

				System.out.println("가격 : " + price);
				System.out.println("갯수 : " + count);
				System.out.println("총계 : " + price * count);
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
			}
			
		}
		 * */
		

	}

}
