package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {

		// PhoneDB_원본.txt 읽어오기
		Reader fr = new FileReader("/Users/joyunju/javaStudy/file/PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {

			// 읽어서 null이 아니면 sysout 출력 , null 이면 break ;
			String str = br.readLine(); // 한 줄 읽어오기 --> 끊어져 있지 않음

			if (str == null) {
				break;
			}

			// split(",")을 사용해서 ,를 기준으로 짜르기
			// PersonInfo에서 받은 정보를 짜를 예정
			String[] personInfo = str.split(",");

			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];

			// 출력 확인
//			System.out.println(name);
//			System.out.println(hp);
//			System.out.println(company);

			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");

		}

		br.close();
		// fr.close();

	}

}
