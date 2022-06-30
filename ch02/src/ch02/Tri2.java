package ch02;
public class Tri2 {
	public static void main(String[] args) {
		int num = 250;   // (게시글 갯수) : 234, 250두가지  24, 25
	    int noPerPage = 10;  //(페이지당 글 수) : 10개
//	    자바에서는 정수 / 정수를 결과도 정수 : 연산의 결과는 같은 데이터형이거나 범위가 넓은 데이형으로 변경
	    int page = (num % noPerPage == 0)? num / noPerPage : num / noPerPage + 1;
	    System.out.printf("갯수가 %d인 경우에는 %d페이지 필요" , num, page);
	}
}