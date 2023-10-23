package javaexp.a12_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A07_WriteFileExp {
	
	public static void main(String[] args) {
		
		
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a04_filewrite\\";
		String fname = "a02_memberList.txt";
		
		try {
			FileWriter fout = new FileWriter(path + fname);
			fout.write("test1\t홍길동");
			/*Scanner scan = new Scanner(System.in);
			System.out.print("파일에 입력할 내용 : ");
			String addStr = scan.nextLine();
			fout.append(addStr);*/
			fout.flush();
			fout.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
