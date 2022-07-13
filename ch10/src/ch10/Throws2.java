package ch10;

import java.io.IOException;

public class Throws2 {
	public static void main(String[] args)  {
		System.out.println("한자리 정수를 입력하세요");
		try {
			int num = System.in.read() - '0';
			System.out.println("입력한 숫자는 "+num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
