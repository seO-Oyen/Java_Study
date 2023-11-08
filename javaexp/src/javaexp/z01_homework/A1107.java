package javaexp.z01_homework;

public class A1107 { 
	// 1. css와 jquery 선택자의 차이점을 기술하세요.
	/*
	 * # css 선택자
	 * - 주로 스타일링을 위해 사용
	 * - 선언적 언어
	 * - 정적처리
	 * 
	 * # jquery 선택자
	 * - DOM조작 이벤트 핸들링, 애니메이션 등의 기능을 구현할 때 사용
	 * - 자바스크립트 기반
	 * - 동적처리
	 * */
	
	// 2. $("[속성]")의 여러가지 형식을 기술하세요.
	/*
	 * $("#아이디명")
	 * $(".클래스명")
	 * $("요소명")
	 * $("a>b") / $(a).childeren("b") => 자식선택자
	 * */

	// 3. [전공자 or 경험자] 찾는 글자[  ] [포함여부확인] [내용 textarea에 java개념 출력처리]
    // 		위에서 글자내용을 입력하고, 포함여부확인 버튼을 클릭시, 해당 내용을 찾으면 textarea 배경색상이 노랑색으로 바뀌게 하세요
	
	// 4. addClass(), toggleClass(), toggleSlide()의 기능을 각각 예제를 통해서 기술하세요.
	/*
	 * addClass() : 선택한 요소에 클래스 값을 추가할 수 있다. 
	 * toggleClass() : 선택한 요소에 클래스 값을 넣었다 뺏다 할 수 있다.
	 * slideToggle() : 보이지 않는 요소는 아래쪽으로 서서히 나타나게 하고, 보이는 요소는 위쪽으로 서서히 사라지게 한다.
	 * */
	
	// 5. 4X4테이블을 만들어서, 상단에 [미니롯또]라는 버튼을 클릭시, 1~16 cell중에 당첨 레이블이 출력되게 하세요.
	
	// 6. group 함수의 종류, select 구문의 기본형식과 의미를 기술하세요.
	/*
	 * count : 행의 개수를 반환
	 * sum : 총 합계
	 * avg : 컬럼들의 평균 
	 * max : 최대값
	 * min : 최소값
	 * */
	
	//7. employees의 job_id별 최고급여를 구하되 8000이상인 경우만 출력되게 sql 구문작성하세요.
	/*
	 * SELECT job_id, max(salary)
	 * FROM employees
	 * GROUP BY job_id
	 * HAVING max(salary) >= 8000;
	 * */
	
	// 8. EMPLOYEES의 salary와 commission_pct를 이용해서 급여와 보너스 합산을 구할 때, nvl2를 이용해서 처리해보세요.
	/*
	 * SELECT employee_id, salary, commission_pct, 
	 * 		nvl2(commission_pct, (salary * commission_pct) + salary, salary) 합산
	 * FROM EMPLOYEES;
	 * */
	
	// 9. EMP에서 입사분기별 평균급여를 출력하세요
	/*
	 * SELECT to_char(hiredate, 'Q')||'분기' 입사분기, floor(avg(sal))
	 * FROM emp
	 * GROUP BY to_char(hiredate, 'Q')
	 * ORDER BY 입사분기;
	 * */
}
