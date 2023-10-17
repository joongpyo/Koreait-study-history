package lamda;
/*
Hello
world
Hello World
*/
//인터페이스 : 두 개의 문자열 매개변수
interface ConcatStr {
	void makeConcat(String s1, String s2);
}

//구현(클래스 - 생성자 가능)한 후에 : 두 개의 문자열을 연결(+) - 강제 오버라이딩
class ConcatStrImpl implements ConcatStr {
	
	@Override
	public void makeConcat(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

	
}




public class LamdaEx06 {

	public static void main(String[] args) {
		//실행 코드
		ConcatStrImpl csi = new ConcatStrImpl(); 
		csi.makeConcat("코리아아이티", "아카데미");
		
		System.out.println("---------------");
		
		ConcatStr cs = (str1, str2) -> {
			System.out.println(str1 + " " + str2);
		};
		cs.makeConcat("Hello", "World");
	}

}
