package thread;

class NumCount2 implements Runnable {

	@Override
	public void run() {
		int[] intArr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < intArr.length; ++i) {
			System.out.println(intArr[i]);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}

}

class HanCount2 implements Runnable {

	@Override
	public void run() {
		String[] strArr = { "하나", "둘", "셋", "넷", "다섯" };

		try {
			Thread.sleep(10);
		} catch (InterruptedException ie) {
		}

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

public class ThreadEx03 {

	public static void main(String[] args) {
		NumCount2 nc2 = new NumCount2();
		// Thread 객체에 주입해서 사용
		Thread t1 = new Thread(nc2);
		t1.start();

		HanCount2 hc2 = new HanCount2();
		// Thread 객체에 주입해서 사용
		Thread t2 = new Thread(hc2);
		t2.start();
	}

}
