/*
 작성일자 : 23. 09. 26 #
 내  용 : 입출력 - 날짜  
 */
package ioEx;

import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		
		//currentMill
		//월(MM) - 분(mm)
		System.out.println(new SimpleDateFormat("yyyy.MM.dd \nhh:mm:ss")
				.format(System.currentTimeMillis()));
		
		System.out.println(System.currentTimeMillis());
		
		//substring(".")
//		원본 : koreat.txt
//		사본 :System.currentTimeMillis().txt
//		용량저장 : 1~10M
//		저장위치
		
		
		
	}

}

