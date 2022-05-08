// 3step : 데이터 추가
// ㄴ Person p = new Person("완두콩", "010-1111-1111", "02-111-111");
// add() 추가 
// 전체를 다 다시 쓴다 (name+""+hp.....)-> 파일을 만든다

package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {

		List<Person> personList = new ArrayList<Person>();

		// PhoneDB_원본.txt 읽어오기 - > 읽기용 스트림
		Reader fr = new FileReader("/Users/joyunju/javaStudy/file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		// text파일을 1줄씩 읽어서 리스트에 추가하기
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
		// System.out.println(personList.toString());
		// System.out.println("====================");

		/////////////////
		// 추가할 데이터 생성

		// 정보(객체)추가 생성
		Person people = new Person("완두콩", "010-1111-1111", "02-111-111");

		// 리스트에 추가
		personList.add(people);

		// 향상된 반복문 사용해서 출력하기
		for (Person p : personList) {
			System.out.println("이름 : " + p.getName());
			System.out.println("핸드폰 : " + p.getHp());
			System.out.println("회사 : " + p.getCompany());
			System.out.println("");
		}

		// 저장되어서 이제 필요한 것 이제 꺼내서 사용 가능
		System.out.println(personList.get(0).getName());

		//////////////////
		// 파일에 저장
		// 쓰기용 스트림 --> PhoneDB_원본.txt 새로 만들기
		Writer fw = new FileWriter("/Users/joyunju/javaStudy/file/PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		for (Person p : personList) {
			// 저장할문자열 변수 설정
			String saveStr = p.getName() + "," + p.getHp() + "," + p.getCompany();
			System.out.println(saveStr);

			bw.write(saveStr);
			bw.newLine(); // 줄바꿈
		}

		// 실행할 때마다 정보 추가된 값이 계속 추가됨
		bw.close();
		br.close();
		// fr.close();

	}

}
