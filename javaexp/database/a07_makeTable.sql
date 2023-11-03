/*
 * # 테이블 생성
 * 
 * 1. 데이터 베이스에서 핵심 객체인 테이블을 생성하여 데이터를
 * 		저장, 수정, 삭제, 조회를 할수 있게 해보자
 * 2. 테이블 생성 단계별 학습
 * 		1) 테이블의 구성요소 확인
 * 			컬럼 : 테이블은 컬럼이라는 구성요소로 되어있다. 데이터 유형과 이름,
 * 				제약조건을 설정 할 수 있다.
 * 		2) 데이터 유형
 * 			number : 숫자형 유형 
 *				number : 정수와 실수가 모두 입력되는 기본 유형의 숫자형 타입
 *				number(전체자리수, 소수점이하 자리수)
 *			varchar2(byte) : 가변형 문자열
 *				최대크기를 설정하여, 그 이하의 데이터를 입력할 수 있다.
 *			char(byte) : 고정형 문자열
 *				설정한 데이터 크기로만 메모리를 할당하는 데이터 유형이다.
 *			date : 날짜형 유형
 *				1/1000 초부터 초분시 일월년도 등과 같이 날짜 관련 데이터를 저장
 *
 *			ps) 오라클 clob, file 타입을 통해서 binary로 파일을 stream 형식으로 전달해서
 *				담을 수는 없지만, 실무적으로 너무 낭비인 경우가 많다.
 *				일반적으로 파일서버를 따로 만들고, 해당 실제 파일을 해당 파일
 *				서버에 담고 파일 경로만 oracle 의 varchar2로 저장한다.
 *		3) 테이블 선언과 활용
 *			create table 테이블명(
 *				컬럼 데이터유형 [제약조건],
 *				컬럼 데이터유형,
 *			);
 *			-- 기존에 테이블 기반으로 테이블 생성 (구조 + 데이터(모두복사))
 *			create table 테이블명
 *			as select * from 테이블;
 *			-- 구조 (데이터 이외에 컬럼 구조 복사)
 *			create table 테이블명
 *			as select * from 테이블 where 1=0;
 *			-- 컬럼 이름을 변경하거나 구조의 일부 선택적으로 복사
 *			create table 테이블명
 *			as select empno no, job,
 *				to_char(sal) salStr
 *			from emp;
 *		4) 데이터 등록
 *			-- 전체컬럼
 *			insert 테이블명 values(데이터1, 데이터2 ...)
 *			-- 특정컬럼
 *			insert 테이블명(컬럼1, 컬럼2)
 *				values(데이터1, 데이터2)
 *		5) 데이터 수정
 *			update 테이블명
 *				set 컬럼명 = 수정할데이터,
 *					컬럼명 = 수정할 데이터
 *				..
 *				wehre 비교/논리 연산자 조건
 *		6) 데이테 삭제
 *			delete
 *			from 테이블명
 *			where 비교/논리연산자
 * */

-- 번호 이름 국어 영어 수학 student 테이블 생성
CREATE TABLE student(
	NO number(3, 0),
	name varchar2(50),
	kor number(3, 0),
	eng number(3, 0),
	math number(3, 0)
);

SELECT * FROM STUDENT;
INSERT INTO student VALUES(1, '홍길동', 70, 80, 90);

-- ex) 물건정보를 넣는 테이블
--		물건번호 (정수 5자리), 물건명, 가격
CREATE TABLE product(
	NO number(5, 0),
	name varchar2(50),
	price number(9, 0)
);

INSERT INTO product VALUES(1, '사과', 3000);

-- 사원정보 복사테이블
CREATE TABLE emp01
AS SELECT * FROM emp;
SELECT * FROM emp01;

-- 복사테이블은 제약조건을 복사하지 않는다
-- 사원정보의 구조만 복사하는 테이블
CREATE TABLE emp02
AS SELECT * FROM emp WHERE 1=0;
SELECT * FROM emp02;

SELECT * FROM dept;
-- ex) dept01(전체복사), dept02(구조만)
CREATE TABLE dept01
AS SELECT * FROM dept;
SELECT * FROM dept01;

CREATE TABLE dept02
AS SELECT * FROM dept WHERE 1=0;
SELECT * FROM dept02;

-- 사원정보중에 급여가 2000 ~ 4000 사이고, 사원번호 사원명 급여로된 테이블 생성
SELECT * FROM emp;

CREATE TABLE emp03
AS SELECT empno NO, ename name, sal
FROM emp
WHERE sal BETWEEN 2000 AND 4000;
SELECT * FROM emp03;