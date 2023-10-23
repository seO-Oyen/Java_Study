package javaexp.a09_exception;

import java.io.IOException;
import java.io.InputStream;

public class A04_CompileException {

	public static void main(String[] args) {
		
		/*
		 * # 컴파일 에러
		 * 
		 * 1. 반드시 컴파일 하여야 되는 예외
		 * 2. java의 특정코드는 반드시 예외를 하여야하는 경우가 있다.
		 * 		==> 필수 예외 처리
		 * 3. 주로 해당 코드를 처리했을 때, 왼쪽에 에러가 표시된다.
		 * 4. eclise의 경우, 해당 예외 처리를 하게 한다.
		 * */
		
		try {
			Class.forName("aaa.bbb.ccc");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			InputStream is = System.in;
			char code = (char)is.read();
			System.out.println(code);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
