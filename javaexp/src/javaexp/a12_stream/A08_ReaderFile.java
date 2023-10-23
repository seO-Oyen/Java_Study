package javaexp.a12_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A08_ReaderFile {

	public static void main(String[] args) {

		/*
		 * # 파일의 내용을 가져오는 Reader 객체
		 * 
		 * 1. 상속관계
		 * 		InputStream > Reader > FileReader
		 * 2. 내용
		 * 		특정한 경로의 있는 파일에 문자열을 읽어와서 화면에 출력하거나
		 * 		변수에 할당하여 원하는 데이터를 사용할 때 활용되는 객체이다
		 * 3. 주요 기능 메서드 내용
		 * 		1) 생성자 : new FileReader(경로/파일명);
		 * 		2) 기능 메서드
		 * 			- read() : 글자 한자씩 code값을 int로 가지고 온다
		 * 				char타입 캐스팅시 문자로 변환
		 * 				공백이나 줄 바꿈들도 포함해서 가져온다
		 * 		3) code 값이 -1 일때 더이상 문자가 없을 때이다
		 * 		4) close() 자원해제
		 * */
		
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a05_fileread\\";
		String fname = "a01_poem.txt";
		
		try {
			FileReader fin = new FileReader(path + fname);
			StringBuffer sbf = new StringBuffer();
			
			while(true) {
				int code = fin.read();
				if (code == -1) { // 데이터 값이 더 없을때
					break;
				}
				// 파일에 있는 내용을 화면에 출력
				System.out.print((char)code);
			}
			fin.close();
			System.out.println("\n#파일 읽기 종료 #");
			System.out.println(sbf);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
