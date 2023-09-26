package inherEx00;

public class AutoEx {

	public static void main(String[] args) {
		HyundaiEx h = new HyundaiEx();
		
		h.start();
		h.model = "아반떼";
		h.color = "chrome";
		System.out.println(h.model+", "+ h.color);
		h.stop();
		
		System.out.println("-----------------");
		
		KiaEx k = new KiaEx();

		k.start();
		k.model = "k5";
		k.color = "white";
		System.out.println(k.model+", "+ k.color);
		k.stop();
	
	
	
	}

}
