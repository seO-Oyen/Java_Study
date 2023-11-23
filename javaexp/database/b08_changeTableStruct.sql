/*
# 테이블의 구조 변경
1. 테이블을 사용하다보면 여러가지 상황에 따라 테이블의 구조를 변경하는 경우가
	발생한다. 테이블의 구조를 변경하는데 필요한 명령어를 파악하고,
	테이블 구조의 변경시 발생하는 데이터 처리에 대한 내용을 파악해보자
2. 테이블 구조의 변경 유형
	1) 컬럼의 추가, 컬럼의 삭제, 컬럼의 속성변경, 제약조건의 추가/삭제/변경 등
	
# 컬럼의 추가
1. 테이블에 컬럼을 추가하기 위해서는 아래의 기본구문으로 처리
2. 기본 형식
	alter table 테이블명
	add 컬럼명 데이터유형[default 디폴트 데이터, 제약조건..]
*/

DROP TABLE emp02; -- 테이블 삭제

CREATE TABLE emp02
AS SELECT empno, ename, job, sal FROM emp;
SELECT * FROM emp02;
ALTER TABLE emp02
ADD address varchar2(20) DEFAULT '주소입력없음';

CREATE TABLE emp08
AS SELECT * FROM emp;
SELECT * FROM emp08;

/*
# 테이블 컬럼 변경
1. 테이블의 컬럼의 타입, 크기, 기본값은 변경이 가능한다.
2. 기본 형식
	alter table 테이블명 
	modify 컬럼명 변경할 타입/크기/기본값;
3. 변경시 주의사항
	1) 해당 컬럼에 데이터가 없는 경우
		컬럼의 타입이나 크기 변경이 자유롭다
	2) 기존 데이터가 
*/

ALTER TABLE emp08
RENAME COLUMN ename TO name;

SELECT * FROM emp08;