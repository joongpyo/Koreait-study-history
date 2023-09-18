/*
 작성일자 : 23. 09. 18 #
 내  용 : 메서드
 */
package tut04;

public class HelloEx {

	//매개변수는 있을 수도 있고 없을 수도 
	//public(아무나)	private(나만 : 캡슐화)
	//sysout(리턴타입-> void), sysout x (타입)
	
   //접근제한자 리턴타입 메소드명
	public void title(String str) {
		//부산 koreaIt Academy
		//서울 koreaIt Academy
		//광주 koreaIt Academy
		System.out.println(str + "koreaIt Academy");
	}
	
	public void info(String tel, String addr) {
		System.out.println("전화번호 : "+ tel);
		System.out.println("주소 : "+ addr);
	}
	
	public static void main(String[] args) {
		//코리아아이티 아카데미 : sysout
		//전화번호, 주소
		//코리아아이티 아카데미 : sysout
		
		HelloEx busan = new HelloEx();
		busan.title("부산");
		busan.info("010 - 3 -2345","부산광역시 서면한전 정류장");
		busan.title("부산");
		
		System.out.println("------------------------");
		
		HelloEx gwanju = new HelloEx();
		gwanju.title("광주");
		gwanju.info("010 - 2 -2345","광주광역시 광주역 세븐일레븐");
		gwanju.title("광주");

		System.out.println("------------------------");
		
		HelloEx seoul = new HelloEx();
		seoul.title("서울");
		seoul.info("전화번호 : 1 - 1234 -2345","주소 : 서울특별시 서울역 1번출구");
		seoul.title("서울");
		
		
		
	}
	
}
