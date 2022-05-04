package com.javaex.ex01;

// shift + ommand + o 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//*****Ex01 파일 속도 느림 개선 

public class Ex02 {

	public static void main(String[] args) throws IOException {

		// 빨대
		InputStream in = new FileInputStream("/Users/joyunju/javaStudy/file/img.jpg");
		// 내보내기
		OutputStream out = new FileOutputStream("/Users/joyunju/javaStudy/file/byteImg.jpg");
		
		byte[] buff = new byte[1024]; // 1024칸짜리 만듬

		System.out.println("복사시작");
		// run 재생시 복사된파일이 다시 0으로 되었다가 복사가 진행됨

		while (true) {
			int data = in.read(buff);    // read 되는 값이 buff에 담겨 빨라짐 
			// System.out.println(data);

			if (data == -1) { // -1 나오면 끝
				System.out.println("복사 끝 " + data);
				break;
			}

			// 내보내기
			out.write(buff);
		}

		out.close();
		in.close();
	}

}
