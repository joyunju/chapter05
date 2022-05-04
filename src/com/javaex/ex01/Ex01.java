package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		// 빨대
		InputStream in = new FileInputStream("/Users/joyunju/javaStudy/file/img.jpg");
		// 내보내기
		FileOutputStream out = new FileOutputStream("/Users/joyunju/javaStudy/file/byteImg.jpg");

		System.out.println("복사시작");
		// run 재생시 복사된파일이 다시 0으로 되었다가 복사가 진행됨

		while (true) {
			int data = in.read();
			// System.out.println(data);

			if (data == -1) { // -1 나오면 끝
				System.out.println("복사 끝 " + data);
				break;
			}

			// 내보내기
			out.write(data);
		}

		out.close();
		in.close();

	}
}
