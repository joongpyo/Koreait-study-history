/*
 작성일자 : 23. 09. 25. #
 내  용 : Map
 */
package mapEx;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class Board{
	 private int id;
	 private String subject;
	 private String writer;
	 private LocalDate regdate = LocalDate.now();
	
	 public Board() {
	}
	
	 
	public Board(int id, String subject, String writer) {
		this.id = id;
		this.subject = subject;
		this.writer = writer;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDate getRegdate() {
		return regdate;
	}
	 
	  
	 public void disp() {
		 System.out.println("번호 : "+id+", 제목 : "+subject+", 작성자 : "+writer+", 작성일 : "+regdate);
	 } 
	 
	 
 }
 
public class MapEx02 {

	public static void main(String[] args) {
		/*
	     p1 -> id, subject, writer, regdate
		 p2 -> id, subject, writer, regdate
		 p3 -> id, subject, writer, regdate
		*/
		
		Map<String, Board> map = new HashMap<>();
		map.put("p1", new Board(101, "홍찰찰의 게시판", "홍찰찰") );
		map.put("p2", new Board(102, "김찰홍의 게시판", "김찰홍") );
		map.put("p3", new Board(103, "이홍찰스의 게시판", "이홍찰스") );
		
		map.forEach((key,value)->{
			Board board= map.get(key);
//			board.disp();
		  //번호
			System.out.println(board.getId());
		});
	}

}
