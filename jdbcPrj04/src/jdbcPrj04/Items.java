
package jdbcPrj04;

public class Items {
	private int itemId;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String itemDate;
	
	
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		
//		if(itemPrice < 0) {		//예외처리
//			this.itemPrice = 0;
//		}
		
		this.itemPrice = itemPrice;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	public String getItemDate() {
		return itemDate;
	}
	public void setItemDate(String itemDate) {
		this.itemDate = itemDate;
	}
	
	
	@Override
	public String toString() {
		return "상품번호: " + itemId + " | 상품이름: " + itemName + ", 상품가격: " + itemPrice + ", 상품재고: "
				+ itemStock + ", 상품등록일 : " + itemDate;
		
	}
	
	
	
	
	
}
