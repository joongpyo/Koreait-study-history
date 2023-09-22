/*
 작성일자 : 23. 09. 22 #
 내  용 : List -> 상품등록
 */

import java.util.ArrayList;
import java.util.List;


class Item {
	private Long itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	
	public Item(Long itemNum, String itemName, int itemPrice, int itemStock) {
		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	
	public void itemDisp() {
		System.out.println(""
							+ "상품번호: "+itemNum+", "
							+ "상품명: "+itemName+", "
							+ "상품가격: "+itemPrice+", "
							+ "상품재고: "+ itemStock);
	}
	
}


class ItemDao {
	public List<Item> getItems() {
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(1000100L,"노트북",2000000,10) );  // == arr[i] = new Item();
		aList.add(new Item(1000100L,"노트북",2000000,10));  // == arr[i] = new Item();
		aList.add(new Item(1000100L,"노트북",2000000,10)  );  // == arr[i] = new Item();
		
		return aList;
	}
}

	
public class ListEx03 {

//접근제한자 : public > protected > default > private
	

	public static void main(String[] args) {
		//객체(Item) : 상품번호, 상품명, 가격, 재고
		
		ItemDao dao = new ItemDao();
		List<Item> list = dao.getItems();
		
		System.out.println("--------for2 상품출력 ---------");
		for(Item item : list ){
			item.itemDisp();
		}
		
	}

}
