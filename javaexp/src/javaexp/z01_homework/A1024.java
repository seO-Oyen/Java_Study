package javaexp.z01_homework;

public class A1024 {

	public static void main(String[] args) {
		
		// [1단계:개념] 1. js에서 DOM의 이벤트 구성요소를 기술하고, 기본예제를 통해서 구성요소의 역할을 설명하세요.
		/*
		 * 1. 이벤트가 일어날 대상 DOM 객체
		 * 2. 이벤트 내용
		 * 3. 이벤트 핸들러 함수
		 * <태그 on이벤트명="이벤트핸들러함수">
		 * 		function 이벤트핸들러함수() {
		 * 		이벤트 핸들러 함수를 통해서 처리할 내용
		 * }
		 * */
		
		// [1단계:개념] 2. DOM이 한개인 경우, 여러 개인 경우에 click이벤트 처리 방법의 차이점을 예제를 통해 설명하세요 
		/*
		 * // 한개인 경우
		 * <태그 onclick="함수명"></태그>
		 * 
		 * 함수명() {
		 * 		처리
		 * }
		 * 
		 * // 여러개인 경우
		 * <태그></태그>
		 * <태그></태그>
		 * <태그></태그>
		 * 
		 * var 태그Arr = querySelectorAll("태그")
		 * 
		 * for(var i = 0; i < 태그.length; i++) {
		 * 		태그Arr[i].onclick = function() {
		 * 			익명함수 처리
		 * 		}
		 * }
		 * */
		
		// [1단계:확인] 3. h2로 구성된 5개의 도서명리스트 하고, 클릭시 마다, 아래의 p태그에 해당 도서를 담는 처리를 하세요. 
		/*<h2>자바의 정석</h2>
		<h2>혼자 공부하는 자바</h2>
		<h2>혼자 공부하는 파이썬</h2>
		<h2>혼자 공부하는 SQL</h2>
		<h2>혼자 공부하는 C</h2>
		<p>도서 담기</p>
		
		<script>
		    var h2Ob = document.querySelectorAll("h2")
		    var pOb = document.querySelector("p")
		
		    for (var i = 0; i < h2Ob.length; i++) {
		        h2Ob[i].onclick = function() {
		            pOb.innerText += "\n" +this.innerText
		        }
		    }
		</script>*/
		
		// [1단계:확인] 4. key이벤트 중에 바로 this를 사용하는 경우의 의미와 왼쪽화살표를 클릭시, 카운트를 감소하고, 
		// 		오른쪽 화살표 클릭시 카운트를 증가하는 처리를 하세요.
		
		// [1단계:개념] 5. 테이블의 구성요소를 기술하세요
		/*
		 * table : 표 전체를 담는 컨테이너 
		 * caption : 표 제목
		 * thead : 해당 셀 그룹
		 * tbody : 데이터 셀 그룹
		 * tfoot : 바닥 셀 그룹
		 * tr : 행 단위 데이터를 포함하는 그룹
		 * th : 열 제목 셀
		 * td : 열 데이터 셀
		 * 기본 구조
		 * table
		 * 		thead
		 *			tr
		 *				td
		 *				td
		 *		tbody
		 *			tr
		 *				td
		 * */
		
		// [1단계:확인] 6. 3행3열/4행3열 테이블 만들어 보고, 학생테이블(학생번호, 학생명, 국어, 영어, 수학)를 타이틀과 데이터가 들어간 
		// 		행태로 테이블을 구성하고 출력하세요
		/*
			<table border> 
				<tr><th>1행 1열</th><th>1행 2열</th><th>1행 3열</th></tr>
				<tr><th>2행 1열</th><th>2행 2열</th><th>2행 3열</th></tr>
				<tr><th>3행 1열</th><th>3행 2열</th><th>3행 3열</th></tr>
			</table> 
			<table border> 
				<tr><th>1행 1열</th><th>1행 2열</th><th>1행 3열</th></tr>
				<tr><th>2행 1열</th><th>2행 2열</th><th>2행 3열</th></tr>
				<tr><th>3행 1열</th><th>3행 2열</th><th>3행 3열</th></tr>
				<tr><th>4행 1열</th><th>4행 2열</th><th>4행 3열</th></tr>
			</table>
		*/

		// [1단계:개념] 7. 테이블의 병합의 기준과 처리방법을 기본 예제를 통해서 설명하세요 
		/*
		 * 세로 행 병합 : rowspan
		 * 가로 열 병합 : colspan
		 * 
		 * <td rowspan="2">
		 * <td colspan="2">
		 * */

	}

}
