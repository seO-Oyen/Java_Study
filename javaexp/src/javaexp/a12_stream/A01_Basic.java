package javaexp.a12_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A01_Basic {

	public static void main(String[] args) {
		
		/*
		 * # 데이터를 전송하는 Stream
		 * 
		 * 1. 자바에서는 Stream이라는 API 객체를 통해서 데이터를 입력하거나 출력을 하는 등 처리 하고 있다
		 * 		- 파일의 데이터를 입력/출력 또는 파일 자체를 전송 처리
		 * 		- 문자를 입력받아 출력하는 처리
		 * 		- 입력된 문자를 네트워크를 통해 전송하여 전달하는 처리
		 * 2. 기본 객체
		 * 		1) 입력 처리 : InputStream
		 * 			=> Java에서 지원하는 기본 입력 처리 객체
		 * 			System.in : InputStream 객체를 리턴하는 처리객체
		 * 		2) 출력 처리 : OutputStream
		 * 			=> Java에서 지원하는 기본 출력 처리객체
		 * 			System.out : OutputStream 객체를 리턴하는 처리객체
		 * 		- java에서 main() 메서드 프로그램을 통하여 기본적으로 console창에서 키보드를 통해서 입력된 데이터를
		 * 			System.in이라는 InputStream을 통해서 관리할 수 있고, 또한 데이터는 console창에서 출력하는 
		 * 			System.out 객체를 통해서 문자열 형식으로 println()메서드를 통해서 출력할 수 있다.
		 * 
		 * # 기초 예제
		 * 1. InputStream을 통해 입력된 데이터 OutputStream을 통해 출력하기
		 * */
		
		System.out.println("# 기본 입력 Stream 활용 #");
		System.out.print("영문으로 글자 한자를 입력하세요 : ");
		InputStream is = System.in;
		
		try {
			int code = is.read();
			
			// 자바에서 콘솔창에 출력하는 출력스트림 객체 선언
			OutputStream os = System.out;
			System.out.print("입력한 내용 : ");
			os.write(code);
			os.flush(); // 임시메모리 해제
			
			/*
			 * # 데이터 전송
			 * 하드웨어 ==> 소프웨어
			 * 하드웨어 <== 소프웨어
			 * 1. 단위가 작으면 바로 전송
			 * 2. 단위가 많으면 넘길 수 있는 만큼 특정한 곳에 쌓아 두었다가 그것을 한꺼번에 전달 하는 것이 효율
			 * 		==> 버퍼메모리
			 * 3. 자원을 해제
			 * 		버퍼메모리 해제 : flush()
			 * 		일반 Stream은 해제 : close()
			 * */
			
			System.out.println();
			System.out.println("입력한 문자 : " + ((char)code));
			os.close(); // OutStream 객체 자원해제
			is.close(); // InputStream 객체 자원해제
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 입력으로 IO발생 컴파일 예외처리

	}

}
