package javaexp.a06_objectreview;

import javaexp.a06_objectreview.vo.Car;
import javaexp.a06_objectreview.vo.CarOwner;

public class A04_ObjVsObj {

	public static void main(String[] args) {
		
		Car car = new Car("현대", "그랜저", 0);
		CarOwner owner = new CarOwner("홍길동");
		
		owner.showMyCarInfo();
		owner.setCar(car);
		owner.showMyCarInfo();
		owner.buyCar(new Car("기아", "k7", 0));
		owner.showMyCarInfo();

	}

}
