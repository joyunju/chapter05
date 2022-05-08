// 1step : split(",")을 사용해서 짜르기 

package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		Reader in = new FileReader("/Users/joyunju/javaStudy/file/PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(in);

		while (true) {
			
			String str = br.readLine(); // readLine() : 한줄씩 읽어오기.

			if (str == null) {
				break;
			}
			String[] pArray = str.split(",");
			System.out.println(pArray[0]);
			System.out.println(pArray[1]);
			System.out.println(pArray[2]);
			//System.out.println(str);
			//System.out.println(p.toString());
			
		}

		br.close();
		in.close();

	}

}
