/*
# view란?
1. 하나 이상의 기본 테이블이나 다른 뷰를 이용하여 생성되는 가상 테이블을 말한다.
2. 장점
	1) 테이블을 보호하기 위하여 활용된다. (보안적인 필요성)
		- 지정된 권한이 있는 사람만이 전체 테이블의 컬럼을 확인하고 활용할 수 있고,
		그 외 사람은 뷰를 통해서 허용된 컬럼만을 조회할 수 있게 한다.
	2) 사용자 편의성을 지원한다.
		- query의 결과를 뷰로 만들었기 때문에 다른 테이블과 조인하거나
		group 함수 등을 통해서 출력한 query를 view라는 가상 테이블로 간단하게
		sql 조회할 수 있다.
		- 복잡한 sql을 하나의 가상테이블로 간단하게 만들어 사용 가능하다.
3. 뷰의 종류
	1) 단순 뷰 : 하나의 기본 테이블에 의해 정의된 뷰
	2) 복합 뷰 : 두개 이상의 기본 테이블로 구성한 뷰
		여러 테이블의 조인관계를 통해 결과를 처리하는 뷰
4. 뷰의 한계
	1) 제한적 사용 : 무결성 제약조건, 표현식, GROUP BY 유무에 따라 dml 명령 등은
		제한적으로 사용된다.
	2) 수행 불가능 : DISTINCT, 그룹함수, GROUP BY, START WITH,
		CONNECT BY, ROWNUM은 포함할 수 없다.
5. 뷰 생성 기본
	1) create[or replace 0]


*/

/*
# 인라인 뷰 (inline view)
1. FROM절에 참조하는 테이블의 크기가 클 경우, 또는 특정 목적에 의해서
	필요한 행과 컬럼 만으로 구성된 집합 테이블을 재정의하여 질의문을 효율적으로
	구성하는 것을 말한다.
	


*/