package ch18;
interface MyFun3 {
	int method(int x, int y);
}
public class LamdaRetun1Ex {
	public static void main(String[] args) {
		MyFun3 mf;
		mf = (x, y)-> {
			int result = x + y; // 반환형 int
			return result;      // return뒤에 있는 result의 결과값의 데이터형이 int
		};
		System.out.println("결과 : "+mf.method(12, 5));
		mf = (x,y)-> { return x+y; };
		System.out.println("결과 : "+mf.method(10,3));
		mf = (x,y)->  x+y; 
		System.out.println("결과 : "+mf.method(21,13));
	}
}