/*
 작성일자 : 23. 09. 12.
 내  용 : length(), charAt, replaceAll, substring 활용
 */
package tut01;

public class StringEx2 {
	public static void main(String[] args) {
		//       length()
		//이메일 형식이 맞는지 체크하는charAt("찾을값의 인덱스번호")
		String email = "mail@mail.com";
		System.out.println(email.length()); //length() - 개수 샘
		
		System.out.println("----------");
		
		
		//       charAt - 글자 추출
		//. => ~안에
		//System.out.println(email.charAt(11));
		if(email.charAt(4) == '@') { //4가 @인 이유는 인덱스번호는 0부터 시작
			System.out.println("사용하셔도 되는 이메일 주소입니다.");
		}else {
			System.out.println("사용할 수 없는 이메일 주소입니다.\n다시 입력해주세요.");
		}
		 System.out.println("============");
		 
		 //replaceAll - 바꾸기
		 String str = ("Korea it academy");
		 System.out.println(str.length());
		 
		 System.out.println(str.replaceAll("it", "IT"));
		 
		 System.out.println("------------");
		 
		 
		 //         substring : 추출 (보통 남자, 여자 구분할때  사용)
		 //주민번호를 이용해서 1이면 남자, 2이면 여자로 화면에 표시하시오.
		 String jumin = "990123-1234567";
		 
		 //변수명.substring(시작인덱스, 찾을값의 인덱스 +1)
		 //System.out.println(jumin.length());
		 //System.out.println(jumin.substring(7)); //substring 컨트롤 스페이스 맨위
		 
		// System.out.println(jumin.substring(7, 8));
		int gender = Integer.parseInt(jumin.substring(7, 8 ));
			System.out.println(jumin.substring(7, 8));
		 
		if(gender % 2 ==0) {
			 System.out.println("Female");
		 }
		 else {
			 System.out.println("Male");
		 	}
		 }
		 
	}


