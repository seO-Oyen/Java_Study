package javaexp.a12_stream;

import java.io.File;

public class A05_DirectoryMake {

	public static void main(String[] args) {
		/*
		 * # 디렉토리도 파일 객체에 의해 생성된다
		 * - mkdir()라는 메서드로 디렉토리 생성
		 * */
		
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\";
		
		File path01 = new File(path + "a03_exp");
		
		path01.mkdir();
		
		String path1 = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a01_exp\\";
		
		for (int i = 1; i <= 10; i++) {
			File path02 = new File(path1 + "a01_dir" + i);
			path02.mkdir();
		}

	}

}
