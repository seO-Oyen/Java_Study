package javaexp.a09_exception;

public class A02_ExceptionBasic {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("i : " + i);
			
			if (i == 50) {
				try {
					System.out.println("i : " + i / 0);
				} catch (Exception e) {
					System.out.println("예외가 발생했습니다 : " + e.getMessage());
					break;
				}
			}
		}

	}

}
