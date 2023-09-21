package tut07;

import java.time.LocalDate;

public class Article {
	//필드
	private int num;
	private String subject;
	private int visit = 1;
	private LocalDate register = LocalDate.now();
	
	//생성자
	public Article() {
	}

	
	//getter, setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getVisit() {
		return visit;
	}

	public void setVisit(int visit) {
		this.visit = visit;
	}

	public LocalDate getRegister() {
		return register;
	}


	
	
	@Override
	public String toString() {
		return "번호 : "+this.getNum()+", "
			  + "제목 : "+this.getSubject()+", "
			  + "조회수 : "+this.visit+", "
			  + "작성일 : "+this.getRegister()+"";
	} 


	
	
	
}
