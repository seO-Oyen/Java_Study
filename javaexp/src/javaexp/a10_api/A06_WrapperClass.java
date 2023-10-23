package javaexp.a10_api;

import java.util.ArrayList;

public class A06_WrapperClass {

	public static void main(String[] args) {
		/*
		 * # Wrapper 클래스
		 * 
		 * 1. 기본데이터 유형을 사용하다 보면 여러형태로 변환이 필요하거나 기능적으로 처리해야하는 경우가 많다.
		 * 		type이 기본 유형으로 되다보니 형변환이 일어나지 않으면 이러한 기능에 대한 한계가 발생한다.
		 * 2. 자바 api에서는 기본 데이터 유형과 연결되는 객체 유형을 만들어 필요에 따라 제공되는 메서드를 이용해서 
		 * 		여러가지 데이터 유형 변경, 치환 기능을 처리할 수 있게 하는 Wrapper 클래스를 지원한다.
		 * 3. 형태 (기본유형과 연결)
		 * 		byte => Byte
		 * 		char => Character
		 * 		..
		 * 		int => Integer
		 * 		..
		 * 		double => Double
		 * 		boolean => Boolean
		 * 
		 * # Auto Boxing / Auto UnBoxing
		 * 
		 * 1. 기본 데이터 유형을 보다 간편하게 객체형 또는 다시 객체를 기본 데이터 유형으로 변경하는 처리가 필요로 하는데
		 * 		이것을 Auto라고 붙여서 사용한다.
		 * 2. Auto Boxing
		 * 		Wrapper 클래스 = 기본 데이터;
		 * 		이렇게 기본데이터를 기능 메서드 사용 없이 바로 객체에 바로 할당하는 것을 AutoBoxing이라고 한다.
		 * 
		 * 
		 * Integer.paresInt("25")
		 * */
		
		int num01 = 25; // 기본 데이터 유형
		// 기본 데이터 유형을 Wrapper클래스(객체)로 만듦 => 객체로 만들면 여러가지 기능 메서드 활용가능
		Integer num01Ob = Integer.valueOf(num01);
		
		System.out.println(num01Ob.byteValue());
		System.out.println(num01Ob.hashCode());
		System.out.println(num01Ob.MAX_VALUE);
		// 기본 데이터유형에서 기능 메서드를 이용하기 위해 객체로 변환하는 것을 Boxing 이라고 한다.
		// 객체를 이용해서 여러가지 기능 처리를 하다가 최종적인 데이터를 다시 기본 유형에 할당하여 처리하는 것을 UnBoxing이라고 한다.
		int num02 = num01Ob.intValue();
		System.out.println("언박싱된 num02 : " + num02);
		
		
		// ex) 위 코드를 기반으로 char 유형과 double 유형의 데이터를 할당하고 Boxing과 UnBoxing처리를 해보세요.
		char char01 = 'a';
		Character char01Ob = Character.valueOf(char01);
		
		System.out.println(char01Ob.charValue());
		System.out.println(char01Ob.hashCode());
		System.out.println(char01Ob.MAX_VALUE);
		
		char char02 = char01Ob.charValue();
		System.out.println("언박싱 : " + char02);
		 
		double double01 = 12.7;
		Double double01Ob = Double.valueOf(double01);
		
		System.out.println(double01Ob.doubleValue());
		System.out.println(double01Ob.hashCode());
		System.out.println(double01Ob.MAX_VALUE);
		
		double double02 = double01Ob.doubleValue();
		System.out.println("언박싱 : " + double02);
		
		
		Integer intOb = 30;
		// 객체.compareTo(객체)로 두 값을 비교하여 적으면 -1 같으면 0, 많으면 1
		// 바로 AutoBoxing이 일어나서 처리가 가능하다.
		System.out.println(intOb.compareTo(40));
		System.out.println(intOb.compareTo(20));
		System.out.println(intOb.compareTo(30));
		
		Integer one = Integer.valueOf(30);
		Integer two  = Integer.valueOf(40);
		System.out.println("# 비교값 #");
		System.out.println(one.compareTo(two));
		System.out.println(one.compareTo(50));
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(30);
		numList.add(40);
		numList.add(50);
		
		// 구성요소는 Integer 객체
		Integer ob4 = numList.get(1);
		int num06 = ob4.intValue(); //Unboxing
		int num07 = ob4; // Auto Unboxing;
		
		// 구성요소에 Integer로 처리된 내용을 기본 데이터 유형으로 할당 autoUnBoxing처리
		// 변수 선언도 생략하고 바로 할당 auto boxing처리
		int num05 = numList.get(1);
		
		
	}

}
