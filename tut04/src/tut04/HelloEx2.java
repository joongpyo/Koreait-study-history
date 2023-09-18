/*
 작성일자 : 23. 09. 18 #
 내  용 : 메서드
 */
package tut04;

public class HelloEx2 {
// 접근제한자 타입(sysout x) 메소드명
    public String title(String company) {        //이것만으로 화면 출력x
    	return  company; 
    }	         
    
    
	public static void main(String[] args) {
		//부산 코리아아이티 아카데미
		//서울 코리아아이티 아카데미
		//광주 코리아아이티 아카데미
		HelloEx2 he = new HelloEx2(); //클래스안에 메소드를 가져오려면..
		System.out.println(he.title("부산 아카데미"));
		
		System.out.println(he.title("서울 코리아아카데미"));
		
		System.out.println(he.title("광주 Academy"));
	}

}
