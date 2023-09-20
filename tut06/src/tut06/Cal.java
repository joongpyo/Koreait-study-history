package tut06; 

public class Cal { //계산 관련 클래스
		//합계 메소드 : 동작   //파라미터
		public int sum(int[] scores) {
			//누적하는 전역변수
			int sum = 0;   //public int sum(){}안에서만 쓸 수 있는 변수
			for(int i = 0; i < scores.length; ++i) {
				sum += scores[i];
			}
			return sum;
		}
		//평균 메소드 : 동작
		public double avg(int[] scores) {
			int sum = 0;   //public int sum(){}안에서만 쓸 수 있는 변수
			for(int i = 0; i < scores.length; ++i) {
				sum += scores[i];
			}
			
			return (double)sum/ scores.length;
		}
}
