package javaexp.a03_calculator;

public class A01_Start {

	public static void main(String[] args) {
		
		int num01 = 25;
		int num02 = 7;
		double num03 = 7.0;
		
		System.out.println(num01 + " + " + num02 + " = " +(num01 + num02));
		System.out.println(num01 + " - " + num02 + " = " +(num01 - num02));
		System.out.println(num01 + " * " + num02 + " = " +(num01 * num02));
		System.out.println(num01 + " / " + num02 + " = " +(num01 / num02));
		System.out.println(num01 + " / " + num03 + " = " +(num01 / num03));
		// % : 나머지 연산자로 나머지 값을 사용할 때, 쓰는데 
		//     프로그램에서 알고리즘에 많이 활용할 수 있다. 
		System.out.println(num01 + " % " + num02 + " = " +(num01 % num02));

	}

}
