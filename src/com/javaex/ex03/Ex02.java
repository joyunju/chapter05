// 2step : person class를 만들어서 리스트 관리 -> 출력 하기
// ㄴ List<Person> pList ArrayList<Person>(); / 필드 : String name / hp / company

package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) throws IOException {

		List<PhoneDb> pList = new ArrayList<PhoneDb>();

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
			// phoneInfo에서 받은 정보를 짜를 예정
			String[] phoneInfo = str.split(",");

			String name = phoneInfo[0];
			String hp = phoneInfo[1];
			String company = phoneInfo[2];

			// 출력 확인
//			System.out.println(name);
//			System.out.println(hp);
//			System.out.println(company);

			PhoneDb p = new PhoneDb(name, hp, company);
			// 출력 확인
			// System.out.println(p.toString());

			// pList 배열에 집어넣어서 안사라지게 만들기
			pList.add(p);
			

		}

		// pList 담긴 것 확인
		System.out.println(pList.toString());
		System.out.println("====================");

		// 향상된 반복문 사용해서 출력
		for (PhoneDb p : pList) {
//			System.out.println("이름 : " + p.getName());
			p.showInfo();
		}

		br.close();
		//fr.close();

	}

}
