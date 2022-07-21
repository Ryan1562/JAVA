package ch11;
class FruitBox {
	Object item;
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}

public class FruitBox1Ex {
	public static void main(String[] args) {
		FruitBox fb = new FruitBox();
//		오렌지를 담고 꺼내서 당도 확인
		fb.store(new Orange(10)); 
		Orange og1 = (Orange)fb.pullOut();
		og1.showSugar();
		
//		사과를 담고 오레지로 생각해서 당도 확인
		fb.store(new Apple(8));
//		담은 건 사과인데 오렌지로 형변환해서 생긴 에러
		Orange og2 = (Orange)fb.pullOut(); 
		og2.showSugar();
	}
}