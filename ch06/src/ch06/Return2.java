package ch06;
class A4 {
	void cal(int x, int y) {		
		if (y == 0) {
			System.out.println("메서드 종료");
			return; // 아래 문장은 실행하지마 (이 메서드가 끝났음)
		} 
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d - %d = %d\n",x,y,x-y);
		System.out.printf("%d * %d = %d\n",x,y,x*y);
		System.out.printf("%d / %d = %d\n",x,y,x/y);
	}
}
public class Return2 {
	public static void main(String[] args) {
		A4 paper = new A4();
		for(int i = 0; i < 10; i++) {
			int x = (int)(Math.random()*10);
			int y = (int)(Math.random()*10);
			paper.cal(x, y);
		}
	}
}
