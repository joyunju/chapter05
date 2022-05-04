package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("/Users/joyunju/javaStudy/file/img.jpg");

		BufferedInputStream bin = new BufferedInputStream(in);
		// BufferedInputStream 변수명 = new BufferedInputStream(주스트림 변수명);

		// 주스트림
		OutputStream out = new FileOutputStream("/Users/joyunju/javaStudy/file/bufferedImg.jpg");
		// 보조스트림 달기
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("복사 시작");
		
		while(true) {
			int data = bin.read();  // 읽고 
			if(data == -1) {
				System.out.println("복사 끝 " + data);
				break;
			}
			bout.write(data);    //쓰고
		}

		bin.close();
		// in.close(); // 꽂아서 사용하기 때문에 이거 사용 안해도 됨

	}

}
