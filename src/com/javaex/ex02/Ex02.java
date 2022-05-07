// Reader - (문자 스트림:Character Stream)

package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		// 주스트림
		Reader fr = new FileReader("/Users/joyunju/javaStudy/file/song.txt");
		// 보조스트림
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine();  // readLine() : 한줄씩 읽어온다. 줄바꿈 기호는 제외
			
			//null은 String 변수가 아무것도 가리 키지 않음을 의미
			if (str == null) {
				break;
			}
			System.out.println(str);  // println 때문에 Console 결과값 줄바꿈 나옴 
			//System.out.print(str);
		}

		br.close();
		// fr.close();

	}

}
