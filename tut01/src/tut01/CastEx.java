/*
 작성일자 : 23. 09. 12
 내  용 : 형변환
 */
package tut01;

public class CastEx {
	public static void main(String[] args) {
		//묵시적 형변환 = 업 캐스팅(자동형변환) : 작은 => 큰
		int i = 100;
		float f = i;
		System.out.println(f);
		
		//명시적 형변환 = 다운 캐스팅(강제형변환) : 큰 => 작
		float f2 = 1.23F;
		int num = (int)f2;
		System.out.println(num);
		
		System.out.println("-------------------");
		
		//double d1 = 1.23;
		//double d2 = 3.45;
		//System.out.println(d1/d2);
		
		int cnt = 3;
		int sum = 100;
		
		double avg = 0.0;
		
		avg = (double)sum / cnt; //많이 쓰임  
		System.out.println(avg);
		
	}

}
