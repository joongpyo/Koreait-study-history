package exception;

public class Exception02 {

	public static void main(String[] args) {

	}

	void thread1() throws InterruptedException{
		//1초 뒤에 멈추세요.
		Thread.sleep(1000);
	}
	
	void thread2() {
		try {
			Thread.sleep(1000);
			System.out.println("쓰레드 성공~~~~~~~~~!!!!!!!!!!!!!!!!"); 
		
		} catch (InterruptedException ie) {
			ie.printStackTrace();
			ie.getMessage();
		}
		finally {
			System.out.println("Thread를 종료합니다.");
		}
	
	
	
	
	}
	
}
