/*
 작성일자 : 23. 09. 26 #
 내  용 : 입출력  
 */
package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx02 {

	public static void main(String[] args) throws IOException {
		String filename = "C:\\temp\\koreait.txt";
		File f = new File(filename); //준비
		
		//FileOutputStream : 기본 false(덮어쓰기), true(이어적기)
		OutputStream os = new FileOutputStream(f);
		//byte(1), char(1)
		String str = "koreait";
		//byte[] -> 배열명.getBytes();
		//개행 
		
//		k o r e a i t => -1
		byte[] b = str.getBytes();
		os.write(b);
		os.write('\n');
		os.flush();
		os.close();
		
		
		
	}

}
