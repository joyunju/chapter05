// 1step : split(",")을 사용해서 짜르기 

// 2step : person class를 만들어서 리스트 관리 -> 출력 하기
// ㄴ List<Person> pList ArrayList<Person>(); / 필드 : String name / hp / company
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

public class PersonListApp {

	public static void main(String[] args) throws IOException {

		List<PhoneDb> pList = new ArrayList<PhoneDb>();
		// PhoneDB_원본.txt 이란 이름의 데이터값 불러오기
		Reader fr = new FileReader("/Users/joyunju/javaStudy/file/PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);

		// PhoneDB_복사본.txt 란 이름의 메모장 경로에 추가
		Writer fw = new FileWriter("/Users/joyunju/javaStudy/file/PhoneDB_복사본.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		while (true) {
			String str = br.readLine(); // readLine() : 한줄씩 읽어온다. 줄바꿈 기호는 제외

			if (str == null) {
				break;
			}
			bw.write(str);
			bw.newLine();

			// split(",")을 사용해서 짜르기
			String[] pArray = str.split(",");
			// info[0] = 이름, info[1] = 휴대폰번호, info[2] = 회사번호
			PhoneDb p = new PhoneDb(pArray[0], pArray[1], pArray[2]);

			// 어레이리스트에 입력받은 값만큼 추가
			pList.add(p);
		}

		// 어레이리스트의 정보 Person에서 불러와서 출력하기
		for (PhoneDb i : pList) {
			i.showInfo();
		}

		bw.close();
		br.close();
	}

}
