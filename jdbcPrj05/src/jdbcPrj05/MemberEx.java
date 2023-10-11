/*
 작성일자 : 23. 10. 11. #
 내  용 : singleton , jdbc
 */
package jdbcPrj05;

import java.util.*;

public class MemberEx {

	public static void main(String[] args) throws Exception {
		MemberDao dao = new MemberDao();
		
		
		
		boolean run = false;
		while(!run) {
			int choice = dao.menu();
			
			switch(choice) {
			case 1:
				DBConnect.getInstance().getConnection();
				System.out.println();
				List<Member> list = dao.getMember();
				//if(list.size() == 0)
				if(list.isEmpty()) {
					System.out.println("가입된 회원이 없습니다.");
				}else {
					System.out.println("가입된 회원은 " + list.size()+"명입니다.");
					for(Member mem : list) {
						System.out.println(mem.toString());
					}
				}
				
				System.out.println("");
				break;
				
			case 2:
				int result = dao.setMember();
				
				if(result > 0 )
					System.out.println("회원가입이 완료되었습니다.");
				else
					System.out.println("회원가입이 되지 않았습니다. \n관리자에게 문의하세요.");
				break;
				
			case 3:
				dao.updateMember(0);
				break;
				
			case 4:
				dao.deleteMember(0);
				break;
				
			case 5:
				dao.searchMember(0);
				break;
				
			case 6:
				dao.disconnect();
				break;	
				
			}
		
		}
	
	
	
	}

}
