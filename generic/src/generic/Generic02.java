package generic;

//상품 : 타입, 값 
class Item<K, V> {
	private K k;
	private V v;
	
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
	
}

public class Generic02 {

	public static void main(String[] args) {
		//1. 문자열, 숫자
		Item<String, Integer> item1 = new Item<>();
		item1.setK("의류");
		item1.setV(100000);
		
		System.out.println(item1.getK() + "의 가격은 "+ item1.getV());
		
		Item<Integer, String> code = new Item<>();
		code.setK(404);
		code.setV("요청하신 주소를 찾을 수 없습니다.");
		
		System.out.println(code.getV() + "(Code : "+code.getK()+")");
		//2. 웹 -> 에러코드 - 500(서버), 400(프로그램)
		//404, 요청하신 주소를 찾을 수 없습니다.
		Item<Integer, String> item2 = new Item<>();
	}

}
