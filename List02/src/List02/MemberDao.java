package List02;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	//생성자를 통해서 List생성, 저장 메소드, 삭제 메소드, 출력 메소드
	
	List<Member> list = null;
	
	 public MemberDao() {
		 list = new ArrayList<Member>();
	 }
	
	
	public void addMember(Member mem) {
		list.add(mem); //List 값 채워넣는 것
	}
	
	public void deleteMember(String id){
		for(int i = 0 ; i < list.size(); ++i) {
			
			String tmp = list.get(i).getUserid();
			
			if(id.equals(tmp)) {
				list.remove(i);
				System.out.println("선택하신 회원을 삭제하였습니다.");
			}
			
		}
	}
	
	public void ShowInfo() {
//         for(Member m : list) {											
//        	 m.disp();
//        	 System.out.println("--------------------------");
//         }			
		for(int i = 0; i <list.size(); ++i) {
			// 배열명.get(i).disp();
			list.get(i).disp();
			System.out.println("--------------------------- ");
		}
         
         
	}
}
;