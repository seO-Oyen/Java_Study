-- 1109
/*
 * 확인할 사원번호[####] [검색] : 사원번호를 입력
 * 해당 사원번호 해당하는 이름 @@@ 입니다. : 사원명 출력
 * ==> DB서버에 접속 ==> 그 결과를 받아 ==> java객체로 ==> 화면에 출력
 * 
 * sql 연습
 * => Java 객체/변수로 (기능메서드)만드는 방법
 * 		출력할 내용을 메서드 리턴유형과 리턴값으로 선언
 * 
 * 리턴유형 메서드명(입력값) {
 * 		return 실제 리턴값
 * }
 * 
 * String getEname(int empno) {
 * 		
 * */

SELECT * FROM emp;

/*
 * ex) 
 * 확인할 사원명 : [] [급여검색]
 * 해당 사원의 급여는 @@@입니다 
 * ==> sql 만들고, 기능메서드 선언
 * */

SELECT ename, sal
FROM emp
WHERE ename = 'SMITH';

/*
 * ex)
 * 사원번호 : [	] [직책검색]
 * 해당 사원의 직책은 @@@ 입니다.
 * 입력 :
 * 출력 : 
 * 1. sql 작성
 * SELECT job
 * FROM emp
 * WHERE empno = 7369;
 * 
 * 2. 기능메서드 작성
 * String getJobByEmpno(int empno) {
 * 	Scanner scan = new Scanner(System.in);
 * 	String job;
 * 	String sql = "SELECT job\r\n"
 *				+ "FROM emp\r\n"
 *				+ "WHERE empno = " + empno;
 *
 * return job
 * */
SELECT job
FROM emp
WHERE empno = 7369;

/*
 * 부서번호 [] [해당하는 사원명 검색]
 * 사원명
 * @@@
 * @@@
 * @@@
 * 
 * List<String> getEnamesByDeptno(int deptno) {
 * 	List<String> enames = new ArrayList<String>();
 * 	String sql = "SELECT ename
 * 					FROM emp
 * 					WHERE deptno = " + deptno;
 * 	return enames;
 * */
SELECT ename
FROM emp
WHERE deptno = 10;

/*
 * List<Integer> getEmpnoListByJob(String job) {
 * 	List<Integer> empnoList = new ArrayList<Integer>();
 * 	String sql = "SELECT empno
 * 					FROM emp
 * 					WHERE job = '" + job + "'";
 * */
SELECT empno
FROM emp
WHERE job = 'CLERK';

/*
 * 사원명 : [	] [사원정보 확인
 * 사원번호 직책 급여 부서번호
 * @@		@@	  @@	@@
 * 
 * class EmpInfo {
 * 	private int empno;
 * 	private String job;
 * 	private double sal;
 * 	private int deptno;
 * 	//생성자
 * 	// getter, setter
 * }
 * EmpInfo getEmpInfo(String ename) {
 * 	EmpInfo empInfo = new EmpInfo();
 * 	String sql = "SELECT empno, job, sal, deptno
 * 					FROM emp
 * 					WHERE ename = '" + ename + "'";
 * 	return empInfo;
 * }
 * */
SELECT empno, job, sal, deptno
FROM emp
WHERE ename = 'SMITH';

/*
 * # 입력값이 다수(2개이상), 리턴할값도 (다중행 다중열)
 * List<클래스> : 다중행/다중열
 * 
 * public LIst<Emp> getEmpList(double min, double max) {
 * 	List<Emp> empList = new ArrayList<Emp>();
 * 	String sql ="
 * 		SELECT *
 * 		FROM emp
 * 		WHERE sal BETWEEN " + min + " AND " + max;
 * 	";
 * 
 * 	return empList;
 * }
 * */


/*
 * 부서번호 : [		]
 * 직책 : [		] [사원정보]
 * List<Emp> getEmpByDeptnoAndJob(int deptno, String job) {
 * 
 * }
 * */
SELECT *
FROM emp
WHERE deptno = 10 AND job = 'CLERK';

/*
 * 날짜별 예약
 * 
 * 1. 테이블 생성
 * create table reservation (
 * 		rno number,
 * 		resdate date,
 * 		startloc varchar2(50),
 * 		endloc varchar2(50),
 * 		starttime number(2, 0),
 * 		endtime number(2, 0)
 * );
 * 
 * 2. 데이터 입력
 * CREATE SEQUENCE res_seq; -- 자동 numbering하는 객체
 * 
 * 3. 조회 sql 작성
 * SELECT *
 * FROM RESERVATION
 * WHERE to_char(resdate, 'YYYY-MM-DD') = '2023-11-14';
 * 
 * 4. VO 객체 작성
 * class Reservation {
 * 		private int rno;
 * 		private Date resdate;
 * 		private String startloc;
 * 		private String endloc;
 * 		private int starttime;
 *		private int endtime;
 * }
 * 
 * 5. 기능 메서드 선언
 * public List<Reservation> getResListByDate(String date) {
 * 		List<Reservation> rlist = new List<Reservation>();
 * 		String sql = "SELECT *\r\n"
				+ "FROM RESERVATION\r\n"
				+ "WHERE to_char(resdate, 'YYYY-MM-DD') = '" + date + "'";
		
		return rlist;
	}
 * 6. 예약처리 입력 sql 작성
 * INSERT INTO reservation VALUES(res_seq.nextval,
	to_date('2023-11-18', 'YYYY-MM-DD'),
	'서울', '대구', 11, 14);
	7. 기능 메서드 선언
	
 * */

create table reservation (
	rno number,
	resdate date,
	startloc varchar2(50),
	endloc varchar2(50),
	starttime number(2, 0),
	endtime number(2, 0)
);

SELECT * FROM reservation;
CREATE SEQUENCE res_seq;
INSERT INTO reservation VALUES(res_seq.nextval,
	to_date('2023-11-13', 'YYYY-MM-DD'),
	'서울', '대구', 9, 12);
INSERT INTO reservation VALUES(res_seq.nextval,
	to_date('2023-11-12', 'YYYY-MM-DD'),
	'서울', '대구', 10, 13);
INSERT INTO reservation VALUES(res_seq.nextval,
	to_date('2023-11-18', 'YYYY-MM-DD'),
	'서울', '대구', 11, 14);
	
SELECT *
FROM RESERVATION
WHERE to_char(resdate, 'YYYY-MM-DD') = '2023-11-14';


/*
	출발역 : [	] 도착역 : [	] [검색]
	리스트내용
	[열차번호] [열차 종류] [출발역] [도착역] [좌석정보] [가격] [소요시간]
	
	1. 테이블 생성
 * */

-- 1. 테이블 생성
CREATE TABLE trainschedule (
	tno char(10),
	ttype varchar2(50),
	departstation varchar2(50),
	arrivalstation varchar2(50),
	seatinfo varchar2(20),
	price number,
	duration number(3, 1)
);
/*
	private String tno;
	private String ttype;
	private String departstation;
	private String arrivalstation;
	private String seatinfo;
	private int price;
	private double duration;
	public List<Traninschedule> getList(String dpart, String arri) {
		List<Train
*/

INSERT INTO trainschedule VALUES('KR10000002', '새마을', '서울',
	'부산', 'A05', 50000, 4.0);
	
SELECT * FROM TRAINSCHEDULE
WHERE departstation = '서울'
	AND arrivalstation = '부산';