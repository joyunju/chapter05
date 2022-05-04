// InputStreamReader와 OutputStreamWriter
// : 바이트기반스트림을 문자기반스트림처럼 쓸 수 있게 해준다.
// : 인코딩(encoding)을 변환하여 입출력할 수 있게 해준다.

package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		// InputStream -> InputStreamReader -> BufferedReader

		InputStream in = new FileInputStream("/Users/joyunju/javaStudy/file/MS949.txt");
		// 보조 (중간 리더기)
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		// ***중요!! (in, "번역할 언어명") // 문자열 인코딩 종류 : UTF-8 / MS949 / EUC-KR 등 ...
		//
		BufferedReader br = new BufferedReader(isr);

		//
		OutputStream out = new FileOutputStream("/Users/joyunju/javaStudy/file/MS949-copy.txt");
		// 파일명 FileInputStream과 다르게 써야 해서 MS949-copy.txt
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;
			}
			System.out.println(str);
			bw.write(str);
			bw.newLine(); // 줄바꿈
		}

		bw.close();
		br.close();
	}

}
