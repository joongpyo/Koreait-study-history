package exception;

class UseridCheckException extends Exception { 

	public UseridCheckException() {
	} // 매개변수 사용 시 빈 값 생성자가 있어야 오류x

	public UseridCheckException(String message) {
		super(message);
	}

}

class UseridCheck extends UseridCheckException {

	// 메인에서 아이디를 전달 받아서 체크
	void useridCheck(String uid) throws UseridCheckException {
		if (uid.isEmpty()) {
			throw new UseridCheckException("아이디를 입력하세요");

		} else if (uid.length() < 8) {
			throw new UseridCheckException("아이디 길이가 짧습니다.\n8자리 이상, 12자리 이하로 입력하세요.");

		} else if (uid.length() > 12) {
			throw new UseridCheckException("아이디 길이가 깁니다.\n8자리 이상, 12자리 이하로 입력하세요.");

		} else {
			System.out.println(uid + "는 사용 가능한 아이디입니다.");
		}
	}

}

//우리가 만들어 놓은 Exception을 체크하는 별도의 클래스로 동작을 만듦

public class UseridCheckEx {

	public static void main(String[] args) throws UseridCheckException {
		// 아이디 체크
		// 1. 빈 값 체크 : 아이디를 입력하세요
		// 2. 길이 짧은 : 아이디가 너무 짧습니다. 8자리 이상 ~ 12자리 이하
		// 3. 길이 긺 : 아이디가 너무 깁니다. 8자리 이상 ~ 12자리 이하
		// 4. 정상적 : 사용 가능한 아이디 입니다.

		UseridCheck uc = new UseridCheck();
		uc.useridCheck("123456789");

	}

}
