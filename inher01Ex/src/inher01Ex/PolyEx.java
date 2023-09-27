/*
 작성일자 : 23. 09. 27 
 내  용 : 다형성 
 */
package inher01Ex;

class OSystem {
	void run() { // 운영체제 실행 메소드
		System.out.println("운영체제를 시작합니다.");
	}
}

class LinuxEx extends OSystem {

	@Override
	void run() {
		System.out.println("Linux 운영체제를 시작합니다.");
	}

}

class AppleEx extends OSystem {

	@Override
	void run() {
		System.out.println("Apple 운영체제를 시작합니다.");
	}

}

class Microsoft extends OSystem {

	@Override
	void run() {
		System.out.println("Microsoft 운영체제를 시작합니다.");
	}

}

class OsStart {
	// 부모(os)는 자식(linux, apple, ms)를 다 포함(담을)수 있다.
	void start(OSystem os) {
		os.run();
	}
}

public class PolyEx {

	public static void main(String[] args) {
		LinuxEx linux = new LinuxEx();
		linux.run();
		System.out.println("-----------------------------");

		AppleEx apple = new AppleEx();
		apple.run();
		System.out.println("-----------------------------");

		Microsoft micro = new Microsoft();
		micro.run();

		System.out.println("-----------------------------");

		OsStart boot = new OsStart();

		boot.start(new LinuxEx());

		boot.start(new AppleEx());

		boot.start(new Microsoft());

	}

}
