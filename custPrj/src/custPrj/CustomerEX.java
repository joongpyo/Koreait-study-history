/*
 작성일자 : 23. 10. 10. #
 내  용 : DB
 */
package custPrj;

import java.util.*;

public class CustomerEX {

	public static void main(String[] args) throws Exception {
		CustomerDao dao = new CustomerDao();
//		dao.setCustomer();
		
		List<Customer> list = dao.getCustomers();
		
		if(list.isEmpty()) { //값이 null인 경우
			System.out.println("등록된 고객이 없습니다.");
		}
		else {
			for(Customer c : list) {
				System.out.println(c.toString());
			}
			
		}
		
		
	}

}
