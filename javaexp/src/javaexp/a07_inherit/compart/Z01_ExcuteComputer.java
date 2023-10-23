package javaexp.a07_inherit.compart;

public class Z01_ExcuteComputer {

	public static void main(String[] args) {
		
		// 1단계 : 공통내용 처리
		// 2단계 : 재정의 내용 메서드 처리
		// 3단계 : 다형성 처리
		Part cpu = new Cpu();
		Part ram = new Ram();
		Part ssd = new Ssd();
		
		cpu.showInfo();
		cpu.showFunc();
		
		ram.showInfo();
		ram.showFunc();
		
		ssd.showInfo();
		ssd.showFunc();

	}

}
