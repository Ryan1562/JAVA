package ch02;

public class Ex01 {
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 갯수
		int sizeOfBucket = 10;   // 조건
//		  numberOfBucket =(대입)  (3 == 0) ? 123/10 : 123/10 + 1
//		                                   12      12+1=> 13
		int numberOfBucket = (numOfApples % sizeOfBucket == 0)?
				numOfApples/sizeOfBucket : numOfApples/sizeOfBucket + 1;
		System.out.println("바구니 갯수 : "+numberOfBucket);
	}
}