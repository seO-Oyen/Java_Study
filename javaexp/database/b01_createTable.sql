/*
# 테이블 만들기
1. 테이블에서 사용되는 데이터 유형
2. 테이블에서 각 컬럼마다 선언되는 제약조건
	1) 데이터의 무결성을 위해서 만들어진다.
		ex) 주민번호가 동일하다면 어떤현상이 일어날까?
3. 테이블에서 관계만들기
	1) 쇼핑몰
		회원정보, 물건정보


*/

CREATE TABLE person(
	NO NUMBER,
	name varchar2(50),
	age number(3),
	loc varchar2(100)
);

INSERT INTO person values(1, '홍길동', 25, '서울');
INSERT INTO person values(2, '김길동', 22, '부산');
INSERT INTO person values(3, '신길동', 23, '대전');
INSERT INTO person values(4, '오영자', 27, '제주');
COMMIT;
SELECT * FROM person;