package ch04;

public class Arr2 {
	public static void main(String[] args) {
		// 정수 배열 5개를 생성
		// 1 ~ 10사이의 정수를 random하게 생성해서 대입
		// 일반 for문과 확장 for을 사용하여 각각 출력 
		int[] i1 = new int[5]; // 5개 0 ~ 4
		for(int i = 0; i < i1.length; i++) {  // 데이터 저장
//			              0.00000 ~ 9.9999999 + 1 => 0 ~ 9 + 1 => 1 ~ 10
			i1[i] = (int)(Math.random() * 10) + 1;
		}
		// 일반 for
		for (int i =0; i < i1.length; i++) { // 저장된 데이터를 인덱스 순서에 맞게 읽기
			System.out.printf("i1[%d] = %d\n", i, i1[i]);
		}
		System.out.println("================");
		// 확장 for
		for(int i : i1) { // 배열 데이터 앞에서 부터 1개씩 가져와서 i에서 넣어서 처리, 데이터가 끝날때 까지
			System.out.println(i);
		}
	}
}
