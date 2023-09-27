package inher01Ex;

public class Android extends Phone{
	String company;
	
	public Android() {}
	
	public Android(String internet){}
	
	public Android(String model, String color, String company) {
		super(model, color);
		this.company = company;
	}

	void disp() {
		System.out.println("회사명 : "+company+", 모델: "+model+", 색상: "+color);
	}



}


