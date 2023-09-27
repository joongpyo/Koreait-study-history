/*
 작성일자 : 23. 09. 27 
 내  용 : override
 */
package inher01Ex;

public class CellEx {

	public static void main(String[] args) {
		AndroidCell ad = new AndroidCell();
		ad.turnOn();
		ad.turnOff();
		
		System.out.println("--------------------");
		
		AppleCell ap = new AppleCell();
		ap.turnOn();
		ap.turnOff();
	}

}
