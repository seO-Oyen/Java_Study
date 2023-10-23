package javaexp.a12_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A02_InputStream_OutputStream {

	public static void main(String[] args) {
		
		System.out.print("정답을 입력하세요 : ");
		InputStream is = System.in;
		
		try {
			int code = is.read();
			
			OutputStream os = System.out;
			System.out.print("입력한 내용 : ");
			os.write(code);
			
			System.out.println();
			System.out.println("입력한 정답(코드값) : " + (code));
			System.out.println("입력한 정답 : " + ((char)code));

			os.flush(); // 임시메모리 해제
			os.close(); // OutStream 객체 자원해제
			is.close(); // InputStream 객체 자원해제
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
