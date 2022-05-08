// 2step : person class를 만들어서 리스트 관리 -> 출력 하기
// ㄴ List<Person> pList ArrayList<Person>(); / 필드 : String name / hp / company

package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {

		List<Person> personList = new ArrayList<Person>();

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

			Person p = new Person(name, hp, company);
			// 출력 확인
			// System.out.println(p.toString());

			// personList 배열에 집어넣어서 안사라지게 만들기
			personList.add(p);

		}

		// personList 담긴 것 확인
		System.out.println(personList.toString());
		System.out.println("====================");

		// 향상된 반복문 사용
		for (Person p : personList) {
			System.out.println("이름 : " + p.getName());
			System.out.println("핸드폰 : " + p.getHp());
			System.out.println("회사 : " + p.getCompany());
			System.out.println("");
		}

		// 저장되어서 이제 필요한 것 이제 꺼내서 사용 가능
		System.out.println(personList.get(0).getName());

		br.close();
		// fr.close();

	}

}
