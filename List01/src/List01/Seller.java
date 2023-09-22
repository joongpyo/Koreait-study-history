package List01;

import java.util.ArrayList;
import java.util.List;

public class Seller {
	private int memberID;
	private String memberName;
	List<Item> list = null;
	
	
	public Seller(int memberID, String memberName) {
		this.memberID= memberID; //this. 이 페이지에 있는 memberID와 같다
		this.memberName= memberName;
		
		list = new ArrayList<Item>();
	}
	
	public void addItem(String itemName, int itemPrice, int itemStock ) {
		Item item = new Item(); //초기화
		
		item.setItemName(itemName);
		item.setItemPrice(itemPrice);
		item.setItemStock(itemStock);
		
		list.add(item);
	
	}
	
	public void showMemberInfo() {
		for(Item info : list) {
			System.out.println("판매자 아이디 : "+memberID+" | "
							+ "판매자 이름 : "+memberName+" | "
							+ "상품명 : "+info.getItemName()+" | "
							+ "상품가격 : "+info.getItemPrice()+" | "
							+ "상품재고 : "+info.getItemStock());
			
			System.out.println("--------------------------");
		}
		System.out.println(list.size()+ " 상품이 등록 되어 있습니다.");
	}
	
}
