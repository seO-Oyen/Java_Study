package javaexp.z01_homework;

import java.io.FileWriter;
import java.io.IOException;

public class A1019 {

	public static void main(String[] args) {

		
//		[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
		
//		[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
		/*
		 * createNewFile() 메소드를 이용한다.
		 * File file = new File(경로);
		 * file.createNewFile(); // try-catch문 활용
		 * */
//		[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
		/*
		 * 파일 객체 : File
		 * 쓰는 객체 : FileWrite
		 * 
		 * FileWriter fileWriter = new FileWriter(경로 + 파일명);
		 * fileWriter.writer(파일에 입력할 내용);
		 * fileWriter.append(파일에 추가할 내용);
		 * */
//		[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
		/*String[] students = {"홍길동,80", "김길동,70", "최길동,60"};
		String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\z01_homework\\vo1019\\";
		String fileName = "1학년1반.txt";
		
		try {
			FileWriter file = new FileWriter(path + fileName);
			for (String student : students) {
				String[] arr = student.split(",");
				System.out.println("이름 : " + arr[0] + ", 점수 : " + arr[1]);
				file.write("이름 : " + arr[0] + ", 점수 : " + arr[1] + "\n");
			}
			file.flush();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
//		[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
//		[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
		/*
		 * FileWriter : 쓰기 => 파일에 내용을 추가할 수 있다.
		 * - write("문자열") : 파일에 쓸 내용
		 * - append("문자열") : 기존 파일 내용에서 추가할 내용
		 * - flush() : buffer 메모리 해제
		 * - close() : FileWriter 객체 메모리 해제
		 * FileReader : 읽기 => 기존에 있는 파일의 내용을 불러와 읽는다.
		 * 1) 생성자 : new FileReader(경로/파일명);
		 * 		2) 기능 메서드
		 * 			- read() : 글자 한자씩 code값을 int로 가지고 온다
		 * 				char타입 캐스팅시 문자로 변환
		 * 				공백이나 줄 바꿈들도 포함해서 가져온다
		 * 		3) code 값이 -1 일때 더이상 문자가 없을 때이다
		 * 		4) close() 자원해제
		 * */
//		[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.
		

	}

}
