package javaexp.z01_homework;

public class A1121 {
	/*
	1. 아래의 테이블을 생성하고, 데이터를 입력하세요
		1) 학생 정보를 저장하는 테이블을 생성하십시오. 학생 번호, 이름, 성별, 생년월일, 전화번호를 저장해야 합니다.
		2) 주문 정보를 저장하는 테이블을 생성하십시오. 주문 번호, 고객 번호, 주문 날짜, 제품 번호, 수량, 주문 금액을 저장해야 합니다.
		3) 도서 정보를 저장하는 테이블을 생성하십시오. 도서 번호, 제목, 저자, 출판사, 출판 년도, 재고량을 저장해야 합니다.
		4) 직원 정보를 저장하는 테이블을 생성하십시오. 직원 번호, 이름, 부서, 입사일, 급여를 저장해야 합니다.
		5) 고객 정보를 저장하는 테이블을 생성하십시오. 고객 번호, 이름, 주소, 이메일 주소, 가입일을 저장해야 합니다.
	2. 제약조건 5가지의 각각의 기본 예제를 만들고, 해당 제약조건의 의미를 기술하세요. 
	3. 제약조건 테이블 생성 연습
		1)고객 테이블은 고객번호, 고객 이름, 나이, 등급, 직업, 적립금 속성으로 구성되고, 고객번호 속성이 기본키다. 
			고객이름과 등급 속성은 값을 반드시 입력해야 하고, 적립금 속성은 값을 입력하지 않으면 0이 기본으로 되도록 생성하라.
		2)제품 테이블은 제품번호, 제품명, 재고량, 단가, 제조업체 속성으로 구성되고, 제품번호 속성이 기본키다. 
			제품번호는 10자리 숫자여야 하고, 제품명은 100자 이내여야 한다. 재고량은 0 이상이어야 하고, 단가는 0 이상 1000 이하여야 한다. 
			제조업체는 "삼성전자", "LG전자", "애플" 중 하나여야 한다.
		3)거래 테이블은 거래번호, 거래일자, 거래금액, 거래처, 거래품목 속성으로 구성되고, 거래번호 속성이 기본키다. 
			거래일자는 오늘 날짜보다 이전이어야 한다. 거래금액은 10000원 이상이어야 한다. 거래처는 "회사", "개인" 중 하나여야 한다. 
			거래품목은 "컴퓨터", "노트북", "모니터" 중 하나여야 한다
	
	*/
	
	// 1-1) 학생 정보를 저장하는 테이블을 생성하십시오. 학생 번호, 이름, 성별, 생년월일, 전화번호를 저장해야 합니다.
	/*CREATE TABLE student02(
			num number(5) NOT NULL,
			name varchar2(20),
			gender varchar2(10),
			birthday DATE,
			phone varchar2(15)
	);
	SELECT * FROM student02;
	INSERT INTO student02
		values(1, '홍길동', 'M', to_date('2000-10-10', 'yyyy-mm-dd'), '010-1234-5678');
	INSERT INTO student02
		values(2, '김길순', 'W', to_date('1998-05-24', 'yyyy-mm-dd'), '010-4321-8765');*/
	
	// 1-2) 주문 정보를 저장하는 테이블을 생성하십시오. 주문 번호, 고객 번호, 주문 날짜, 제품 번호, 수량, 주문 금액을 저장해야 합니다.
	/*CREATE TABLE order_info(
		ordernum varchar2(20),
		usernum number,
		orderday DATE,
		productnum number,
		cnt number,
		price number
	);
	SELECT * FROM order_info;
	INSERT INTO order_info
		values('A123', 1, sysdate, 1, 3, 2000);
	INSERT INTO order_info
		values('A124', 1, sysdate, 2, 1, 5000);
	INSERT INTO order_info
		values('A125', 2, sysdate, 5, 7, 1000);*/
	
	// 도서 정보를 저장하는 테이블을 생성하십시오. 도서 번호, 제목, 저자, 출판사, 출판 년도, 재고량을 저장해야 합니다.
	/*CREATE TABLE book_info(
		booknum number,
		booktitle varchar(50),
		writer varchar(50),
		publisher varchar(50),
		bookyear NUMBER(4),
		bookcnt number
	);
	SELECT * FROM book_info;
	INSERT INTO book_info
		values(1, '자바의 정석', '남궁성', '한빛', 2023, 4);*/

}
