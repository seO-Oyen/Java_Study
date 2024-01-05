/*
# 계층적 질의문
1. 데이터베이스를 처리하면서 여러가지 업무 처리에 따라 테이블을 구성할 수 있는데
	간혹 계층적으로 하나의 테이블 안에서 처리가 필요한 경우가 있다.
	즉 self join으로 키를 조인하는 경우를 말한다.
2. 게시물의 답글을 계층적으로 달아야하는 경우 직급에 있어서 상위 관리자와 하위 관리자를
	구분하여 처리하는 경우, 메뉴 항목에 있어서 상위메뉴와 하위메뉴를 구분하여
	계층적으로 처리해야하는 경우를 말한다.
3. 이 때 여러 테이블에 걸쳐 계층적으로 처리하는 경우도 있지만 하나의 테이블에
	상/하위 관계로 self join 으로 컬럼 구성을 하고 데이터를 처리할 수 있다
4. 이 self join 을 하면 보다 작은 메모리로 계층적으로 연관관계를 설정하기에 효율적으로
	저장할 수 있다
5. 오라클에서는 이라는 계층적 데이터 구조를 위해 계층적 질의문을 지원하고 있다.
6. 계층적 질의문을 위한 테이블 구조
	1) 계층적 질의문을 처리하기 위해서는 테이블의 특정 컬럼에 대한 다른 컬럼과의
		관계가 계층 구조로 되어 있어야한다.
	2) emp 테이블의 empno와 mgr은 계층적 연결관계로 되어있다.
	3) 사원정보 empno 고유 사원번호와 다른 사원 정보가 처리되는데
		mgr이라고 하는 사원번호의 형식과 같은 관리자 번호를 저장할 수 있다.
	4) mgr(관리자 번호)는 데이터를 다른 row에 empno로 저장된 데이터가 있는 것이 있다.
	level : 계층 레벨을 가져온다
	최상위 조건 : 계층 구조가 시작하는 조건을 말한다. 테이블의 여러계층 중에
		최상위 시작을 할 때 조건을 처리하여야 한다.
	상위/하위 계층 연결 조건 : 계층 구조에서 상위와 하위를 연결하는 컬럼을 말한다.
		emp의 경우 empno = mgr이 이 조건에 해당.


*/

SELECT LEVEL, empno, ename, job, mgr
FROM emp
START WITH empno = 7839
CONNECT BY PRIOR empno = mgr;

-- 답변형 게시판
CREATE TABLE board(
	NO NUMBER PRIMARY KEY, -- 글번호
	refno NUMBER, -- 답글번호
	title varchar2(50), -- 제목
	content varchar2(1000), -- 내용
	writer varchar2(50), -- 작성자
	regdte DATE, -- 등록일
	readcnt NUMBER -- 조회수
);
CREATE SEQUENCE board_seq;
INSERT INTO board values(board_seq.nextval, 0, '게시물1', 
	NULL, '홍길동', sysdate, 0);
INSERT INTO board values(board_seq.nextval, 0, '게시물2', 
	NULL, '김길동', sysdate, 0);
INSERT INTO board values(board_seq.nextval, 0, '게시물3', 
	NULL, '신길동', sysdate, 0);
INSERT INTO board values(board_seq.nextval, 0, '게시물4', 
	NULL, '마길동', sysdate, 0);

-- 댓글
INSERT INTO board values(board_seq.nextval, 1, 'RE:게시물1', 
	NULL, '홍길동', sysdate, 0);
INSERT INTO board values(board_seq.nextval, 2, 'RE:게시물2', 
	NULL, '김길동', sysdate, 0);

SELECT * FROM board;

SELECT LEVEL, NO, refno, title
FROM board
START WITH refno = 0
CONNECT BY PRIOR NO 