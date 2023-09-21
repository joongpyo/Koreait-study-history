package tut07.dao;

public class ScoresDao {

	public void nullCheck() {
		int[] scores = null;
		
		if(scores == null) {
			System.out.println(">>>>> 1. 학생 수 메뉴에서 학생 수를 먼저 등록해 주세요.");
			System.out.println("");
			return;
		}
	}
	
}
