package javaexp.a06_object;

import javaexp.a06_object.vo.Computer;
import javaexp.a06_object.vo.Cpu;

// 0922 # 객체 vs 객체 관계
public class A10_ObjVsObj {

	public static void main(String[] args) {
		
		// 포함될 pu 객체 생성
		// 일반 메모리에 돌아다니는 Cpu 객체
		Cpu cpu = new Cpu("intel", "3.2 i7 quard core");
		// 포함할 객체에 할당
		Computer computer = new Computer("조립컴퓨터");
		computer.show();
		computer.setCpu(cpu);
		computer.show();

	}

}
