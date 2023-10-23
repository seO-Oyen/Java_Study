package javaexp.a12_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A08_ReaderFileExp {
	
	public static void main(String[] args) {
		
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a05_fileread\\";
		String fname = "a02_memList.txt";
		
		try {
			FileReader fin = new FileReader(path + fname);
			StringBuffer sbf = new StringBuffer();
			sbf.append((char)fin.read());
			
			while(true) {
				int data = fin.read();
				if(data == -1) {
					break;
				}
				sbf.append((char)data);
				
				//System.out.print((char)code);
			}
			fin.close();
			System.out.println("현제 데이터 : " + sbf);
			
			/*String[] arr = sbf.toString().split(",");
			System.out.println("이름 : " + arr[0]);
			System.out.println("국어 : " + arr[1]);
			System.out.println("영어 : " + arr[2]);
			System.out.println("수학 : " + arr[3]);*/
			System.out.println();
			String[] arr = sbf.toString().split("\n");
			for (String str : arr) {
				String[] arr2 = str.split(",");
				System.out.println("이름 : " + arr2[0]);
				System.out.println("국어 : " + arr2[1]);
				System.out.println("영어 : " + arr2[2]);
				System.out.println("수학 : " + arr2[3]);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
