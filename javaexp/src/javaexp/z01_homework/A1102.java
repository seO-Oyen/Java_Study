package javaexp.z01_homework;

public class A1102 {

	public static void main(String[] args) {
		// [1단계:개념] 1. iframe의 주요속성을 기본 예제를 통해서 기술하세요.
		/*
		 * name : iframe의 이름을 나타냄
		 * <iframe name="test"> <== target="test"
		 * src : iframe에 보일 문서의 url
		 * <iframe src="ex02-1.html"> <== ex02-1.html의 내용이 표시됨
		 * width, height : iframe의 크기를 조정
		 * */
		
		/*
		 * [1단계:확인] 2. z01_top.html(최상위), z02_left.html(왼쪽메뉴), 
		 * 		z03_main.html(오른쪽메인메뉴) 파일을 만들고,
		 * 		z01_top.html에 계층형 프레임구조를 만들어, 왼쪽메뉴 리스트를 클릭시, 
		 * 		오른쪽 메인메뉴들이 출력되게 하세요
		 * */
		
		/*<body>
			<iframe src="z02_left.html"></iframe>
			<iframe src="z03_main.html" name="mainFrame"></iframe>
		</body>
		*/
		// left.html
		/*<ul>
		    <li><a href="ex2-01.html" target="mainFrame">페이지1</a></li>
		    <li><a href="ex2-02.html" target="mainFrame">페이지2</a></li>
		    <li><a href="ex2-03.html" target="mainFrame">페이지3</a></li>
		    <li><a href="ex2-04.html" target="mainFrame">페이지4</a></li>
		    <li><a href="ex2-05.html" target="mainFrame">페이지5</a></li>
		</ul>*/
		
		// [1단계:확인] 3. a href의 target의 의미를 예제를 통하여 기술하세요.
		/*
		 * target은 문서를 클릭했을 때 문서가 열릴 위치를 명시
		 * _blank : 링크된 문서를 새로운 윈도우나 탭(tab)에서 오픈함.
		 * _self(default) : 링크된 문서를 링크가 위치한 현재 프레임에서 오픈함.
		 * _parent : 링크된 문서를 현재 프레임의 부모 프레임에서 오픈함.
		 * _top : 링크된 문서를 현재 윈도우 전체에서 오픈함.
		 * 프레임 이름 : 링크된 문서를 명시된 프레임에서 오픈함.
		 * */
		/* [1단계:개념] 4. 요청값전달방식(2단계)의 페이지?key=val의 의미를 기술하고, 
				이것을 처리하는 패턴 3가지를 기술하세요.*/
		
		
		/* [1단계:확인] 5. 물건명:[   ], 가격:[   ], 갯수:[   ] [구매] 
		 * 		폼 페이지(z04_buyForm.html) 만들어, 구매를 클릭시,
         * 		z05_buyProductInfo.jsp에서 입력한 구매 정보가 출력되게 하세요.*/
	}

}
