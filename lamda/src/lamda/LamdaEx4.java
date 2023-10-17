package lamda;

interface Cals2{
	int add(int a, int b);
}

public class LamdaEx4 {

	public static void main(String[] args) {
		//10, 20의 합을 구하는 람다식
		Cals2 c2 = (x, y) -> {
			int sum = x + y;
			return sum;
		};
		
		System.out.println(c2.add(10, 20));
		
		
		
	}

}
