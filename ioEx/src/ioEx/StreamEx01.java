/*
 작성일자 : 23. 09. 26 #
 내  용 : 입출력  
 */
package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx01 {

	public static void main(String[] args) throws IOException {
		/*
		 입출력
		 1. byte : 텍스트, 파일, 이미지
		 	(1) OutputStream/InputStream
		 			쓰기			읽기
		 2. char : 텍스트 전용
		 
		 버퍼 => 속도 향상
		 
		 
		 자료
		 버퍼 비움(flush)
		 close
		 */
		
		//파일 생성
		String filename = "koreait.txt";
		
		File f = new File("C:\\temp\\"+ filename); //준비
		
		//파일+글쓰기 : OutputStream = FileOutputStream
		
		OutputStream os = new FileOutputStream(f);
		
		os.write('k');
		os.write('o');
		os.write('r');
		os.write('e');
		os.write('a');
		os.write('i');
		os.write('t');
		
		os.flush();
		os.close();
		
		
		
		
		
		
		
	}

}
