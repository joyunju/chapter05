// 3step : 데이터 추가
// ㄴ Person p = new Person("완두콩", "010-1111-1111", "02-111-111");
// add() 추가 
// 전체를 다 다시 쓴다 (name+""+hp.....)-> 파일을 만든다

package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.javaex.ex05.Person;

public class Ex03 {
	public static void main(String[] args) throws IOException {

		List<PhoneDb> pList = new ArrayList<PhoneDb>();
		// PhoneDB_원본.txt 읽기
		Reader fr = new FileReader("/Users/joyunju/javaStudy/file/PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);

		// PhoneDB_복사본.txt 새로 쓰기
		Writer fw = new FileWriter("/Users/joyunju/javaStudy/file/PhoneDB_정보추가.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		while (true) {
			String str = br.readLine(); // readLine() : 한줄씩 읽어온다. 줄바꿈 기호는 제외

			if (str == null) {
				break;
			}

			// split(",")을 사용해서 짜르기
			String[] pArray = str.split(",");
			// 배열추가
			String name = pArray[0];
			String hp = pArray[1];
			String company = pArray[2];

			PhoneDb p = new PhoneDb(name, hp, company);

			// pArray 배열에 p 정보 저장
			pList.add(p);
		}

		// 정보(객체)추가 생성
		PhoneDb people = new PhoneDb("완두콩", "010-1111-1111", "02-111-111");

		// 리스트에 추가
		pList.add(people);

		// PhoneDb 클래스에서 불러와서 출력하기
		for (PhoneDb i : pList) {
			// 저장할문자열 변수 설정
			String strWriter = i.getName() + "," + i.getHp() + "," + i.getCompany();

			bw.write(strWriter);
			bw.newLine();

			i.showInfo();
		}

		bw.close();
		br.close();
	}
}
