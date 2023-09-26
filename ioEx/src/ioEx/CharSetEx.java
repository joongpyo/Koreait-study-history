/*
 작성일자 : 23. 09. 26 #
 내  용 : char  
 */
package ioEx;

import java.io.UnsupportedEncodingException;

public class CharSetEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//한글 CharSet : EUC-KR - > 949 -> UTF-8(3byte)
		//한글 전송 -> byte[] -> loop		
		
		//문자열.getBytes(문자셋);
		String str = "코리아아이티";
		byte[] b1 = str.getBytes("EUC-KR");
		//System.out.println(b1.length);
		
		
		for(int i = 0; i <b1.length  ; ++i) {
			System.out.print(b1[i]+" ");
		}
		
		System.out.println("");
		System.out.println(new String(b1, "UTF-8"));
		System.out.println(new String(b1, "ms949"));
		System.out.println(new String(b1, "EUC-KR"));
	
		System.out.println("---------------------");
		
		String str2 = "봵"; //CharSet ??
		
		byte[] b2 = str2.getBytes("EUC-KR"); 
		System.out.println(new String(b2, "EUC-KR"));
		
		byte[] b3 = str2.getBytes("UTF-8"); 
		System.out.println(new String(b3, "UTF-8"));
		
//		ASCII - 1byte(8bit) -> 2 * 8 = 256
				//a - 75, A - 97
		
		/*Unicode(3byte) -> 2 * 24 -> 한자, 한글, 일본 ........
		/u02f20 - 선비사
		*/
		
		
	}

}
