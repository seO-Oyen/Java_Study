package javaexp.z01_homework.vo0921;

/*1. **도서 클래스**
- 필드: 제목, 저자, 가격, 출판년도
- 생성자: 모든 필드 초기화
- 메서드: 도서 정보 출력, 가격 변경*/
public class Book {
	private String title;
	private String writer;
	private int price;
	private String year;
	
	public Book(String title, String writer, int price, String year) {
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.year = year;
	}
	
	// 가격 변경
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 도서정보 출력
	public void bookInfo() {
		System.out.println("# 도서 정보 #");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("출판년도 : " + year);
	}

}