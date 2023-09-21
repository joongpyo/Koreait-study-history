/*
 작성일자 : 23. 09. 20 #
 내  용 : 
 */
package emp;

import java.util.Scanner;

import emp.service.EmployeeSrv;

public class EmployeesEX {

	public static void main(String[] args) {
		EmployeeSrv srv = new EmployeeSrv(); //생성자 //다른 패키지여서 import
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			srv.menu();

			System.out.println("");
			System.out.print("메뉴 선택 > ");
			int choice = sc.nextInt();
			System.out.println("");
			
			switch(choice) {
			case 1 :
				srv.empCreate();
				break;
				
			case 2 :
				srv.empAdd();
				break;
				
			case 3 :
				srv.empList();
				break;
				
			case 4 :
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				System.out.println("");
				break;
				
			default : 
				System.out.println("잘못 입력하셨습니다. 메인 메뉴로 돌아갑니다.");
				System.out.println("");
				break;
			
			}
		}
		
	}

}
