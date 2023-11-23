/*
# check 제약조건
1. 특정한 컬럼을 조건이나 범위를 지정해서 해당 범위에 데이터만
	입력되도록 처리하는 것을 말한다. 
2. 형식
	컬럼 데이터유형 constraint 제약명 check (조건문-where문에 들어가는 sql문장)
	컬럼 데이터유형 check (조건문-where문에 들어가는 sql문장)


*/

CREATE TABLE student05(
	name varchar2(50),
	gender varchar2(1) check(gender IN('F', 'M'))
);
