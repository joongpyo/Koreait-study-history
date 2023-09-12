/*
 작성일자 : 23. 09. 12
 내  용 : 대입연산자 : 약식으로 연산자
 */
package tut01;

public class AssignEx2 {
	public static void main(String[] args) {
		//증감연산자
		//대입연산자를 줄여서(축약) 사용
		
		int num = 5;
		++num;
		System.out.println(num); //6
		System.out.println(++num); //7
		System.out.println(num++); //7
		System.out.println(num); //8

		//num = num + 1;
		num += 1;
		System.out.println(num); //9
		System.out.println(num += 1); //10
		System.out.println(num += 5); //15
		
		//num *= 10;
		System.out.println(num *= 10);
		
		//num /= 150;
		System.out.println(num /= 150);
		
		//0~9까지 더하는 반복문을 작성하시오.
		int sum = 0;
		//			0   ~   9
		for(int i = 0; i <= 9; ++i) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
