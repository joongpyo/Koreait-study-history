/*
 작성일자 : 23. 09. 22 #
 내  용 : List -> 쇼핑몰
 */

package List01;

public class ShopEx {

	public static void main(String[] args) {
		//판매자로 회원가입 - 판매자로 승인 -> 상품 등록(여러 개 = List)
		//홍길동만 쓸 수 있는 List 배열 공간을 만듦
		Seller seller = new Seller(10001, " 홍길동"); //회원가입
		
		seller.addItem("삼성 노트북", 1000000, 10);
		seller.addItem("무선 마우스", 50000, 50);
		
		seller.showMemberInfo();
	}

}
