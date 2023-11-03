package javaexp.z01_homework;

public class A1026 {

	public static void main(String[] args) {
		
		// [1단계:개념] 1. form 하위에 input의 type에 속성에 따른 속성값을 특징에 따라 기술하세요.
		/*
		 * - text : 한줄 텍스트 입력 창
         * - password : 암호 입력을 위한 한줄 테스트 입력창
         * - button : 단순한 버튼
         * - submit : 웹 서버로 폼 데이터를 전송시키는 버튼
         * - image : 이미지 버튼
         * - checkbox : 다중으로 선택할 수 있는 선택 box
		 * - radio : 여러개중에 단일 선택할 수 있는 선택 box
		 * == 기타 고급 html 속성(html5 이후) ==
		 * - month|week|date|time|datatime-local 
		 * 		: 년/월/일/시간 등의 시간 정보 입력창
		 * - number|range : 스핀 버튼과 슬라이드바로 편리한 숫자 입력창
		 * - color : 색 입력을 쉽게하는 컬러 다이얼로그
		 * - email|url|tel|search : 이메일 url 전화번호 검색 키워드
		 * 		형식 검사 기능을 가진 텍스트 입력 창
		 * - file : 로컬 컴퓨터의 파일을 선택하는 폼 요소
		 * */
		
		/*
		 * [1단계:확인] 2. 아래와 같은 화면 구조의 내용을 등록 처리해보세요.
		 * 		학생명:[    ] 점수:[    ] [등록] ==> 클릭시 마다 하단에 numbering되면서 등록 처리.
		 * 		1  @@@   @@ 
		 * */
		/*학생명 : <input type="text" name="sName"><br>
		점수 : <input type="text" name="score"> <br>
		<input type="button" value="등록" id="sBtn">
		<p></p>
		
		<script>
		    var sName = document.querySelector("[name=sName]")
		    var score = document.querySelector("[name=score]")
		    var sBtn = document.querySelector("#sBtn")
		    var pOb = document.querySelector("p")
		
		    var cnt = 1
		    sBtn.onclick = function() {
		        pOb.innerHTML += cnt++ + "&emsp;" + sName.value + "&emsp;" + score.value + "<br>"
		    }
		</script>*/
		
		/*
		 * [1단계:확인] 3. 다음의 내용을 enter키를 통해서 입력 처리해보세요.(테이블처리 및 최하단에 누적 총액계산)
		 * 구매할 물건의 가격:[   ]
		 * 		구매한물건가격
		 * 		1000
		 * 		2000
		 * 		총액:@@@
		 * */
		
		// [1단계:개념] 4. disabled, readOnly 속성의 차이를 기본코드와 함께 설명하세요.
		/*
		 * disabled => 보이기만 하고 어떤 기능도 하지 않음
		 * readOnly => 쓰기만 안되고 다른 기능은 처리함
		 * */
		
		// [1단계:확인] 5. 물건명[  ], 가격[   ], 갯수[   ] [등록] 화면에서 등록 클릭시, 하단에 구매한 물건은 @@@, 총비용은 @@ 라고 출력되게 하세요
		
		// [1단계:확인] 6. 회원 가입시, 가입 정보가 id, pass 일 때, 이름, 포인트, 메일주소일 때, 
	    //	아이디, 패스워드, 이름, 메일주소는 반드시 입력해야 등록되게 할려면 javascript 코드를 기술하세요.
		
		// [1단계:개념] 7. 데이터베이스의 keyword 검색의 기본 형식을 예제를 통해서 기술하세요.
		/*
		 * WHERE 컬럼명 LIKE 조건
		 * 형식으로 검색한다.
		 * 
		 * SELECT *
		 * FROM emp
		 * WHERE ename LIKE '%A%';
		 * => 이름에 A가 들어가는 사람 조회
		 * */
		
		// [1단계:확인] 8. 사원정보를 정렬하여 출력하되 부서번호(deptno)를 1차(오름차순)로 급여(sal) 2차(내림차순)으로 부서번호, 급여, 사원명을 출력하세요.
		/*SELECT *
		FROM emp
		ORDER BY deptno, sal DESC;*/
		

	}

}
