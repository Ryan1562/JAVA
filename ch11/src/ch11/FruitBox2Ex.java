package ch11;
class FruitBox2<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

public class FruitBox2Ex {
	public static void main(String[] args) {
		FruitBox2<Orange> fb = new FruitBox2<>();
//		오렌지를 담고 꺼내서 당도 확인
		fb.store(new Orange(10)); 
		Orange og1 = (Orange)fb.pullOut();
		og1.showSugar();
		
//		사과를 담고 오레지로 생각해서 당도 확인 Generics사용했더니 오렌지가 아닌 것을 담으면 바로 에러
//		fb.store(new Apple(8));  // 개발할 때 에러를 미리 고칠 수 있다
//		담은 건 사과인데 오렌지로 형변환해서 생긴 에러
//		Orange og2 = (Orange)fb.pullOut(); 
//		og2.showSugar();
	}
}