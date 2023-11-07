package javaexp.z01_homework;

public class A1106 {

	public static void main(String[] args) {
		
		// 1. jquery 초기 설정 방식을 선언하세요
		// <script type="text/javascript" src="jquery-3.1.1.js"></script>
		
		// 2. jquery==>javascript, javascript==>jquery변환형식을 기술하세요.
		/*
		 * // jquery => javascript
		 * var 변수명 = $(태그명/클래스명/아이디명)
		 * 
		 * // javascript => jquery
		 * var 변수명 = document.querySelector()
		 * $(변수명).처리
		 * */
		
		// 3. jquery에서 h2 3개를 인사말로 선언하고, 동일한 태그(h2)의 
		//	jquery를 이용해서 모두 글자색상 적용과 이중에서 2번째 태그에 내용 
		//	변경처리를 하세요
		/*
		 * // script
		 * $("h2").css("color", "blue")
         * $("h2").eq(1).text("방가염")
         * 
         * // body
         * <h2>안녕하세요</h2>
         * <h2>반갑습니다</h2>
		 * */
		
		// 4. jquery의 기본 출력 속성과 css, attribute 속성를 예제로 설명하고 만드세요.
		/*
		 * .css()
		 * .attr()
		 * */
		
		// 5. 선택자로 $("선택자1 선택자2")와 $("선택자1>선택자")의 차이점을 
		//	예제로 기술하세요.
		/*
		 * $("선택자1 선택자2") : 하위
		 * $("선택자1>선택자") : 부모-자식 관계
		 * */
		
		// 6. table의 3X3테이블을 만들고, 클래스를 선언하여 jquery로
        //	.cls01>.cls02가 2행3열로 배경색상을 빨강색으로 처리되게 하고, 
		//	.cls03.cls04로 1행2열의 글자색상이 노랑색으로 처리되게 하세요

	}

}
