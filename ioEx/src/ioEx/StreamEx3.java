/*
 작성일자 : 23. 09. 26 #
 내  용 : 입출력  
 */
package ioEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEx3 {

	public static void main(String[] args) throws IOException {
		//k o r e a i t		 -1 return : 자료 없으면
		String filename = "C:\\temp\\koreait.txt";
		InputStream is = new FileInputStream(filename); //파일 내용 읽어올 준비
		
		//is.read(); 1byte(실제 처리 4byte)
//		boolean run = true;
		/*
		
		
		
		while(run) {
			int result = is.read(); //글자를 byte로 읽어오지만 정수로 처리
			
			if(result == -1)  //더 이상 출력할 글자가 없으면 -1 return
				break;
			
			System.out.print((char)result);
			System.out.println("남은 byte(s)는 "+ is.available()+"byte(s)입니다");
		}
		*/
		
		
		int result = 0;
		while( ( result = is.read() ) != -1 ) {
//			System.out.print(result + " > ");
			System.out.print ((char)result);
		}
		is.close();
		
		
		
		
		
		
	}

}
