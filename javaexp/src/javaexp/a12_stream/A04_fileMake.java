package javaexp.a12_stream;

import java.io.File;
import java.io.IOException;

public class A04_fileMake {

	public static void main(String[] args) {
		
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a02_exp\\";
		String file01Name = path + "a01_file.txt";
		
		File file01 = new File(file01Name);
		System.out.println("해당 파일이 있는지 여부 : " + file01.exists());
		
		if (!file01.exists()) {
			try {
				file01.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("파일 생성");
		}

	}

}
