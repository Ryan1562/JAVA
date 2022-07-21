package ch11;
class GeneT<T> {  // <>속에 T, V, K, E중에 사용
	T[] t;
	public void set(T[] t) {	this.t = t;	}
	public void print() {
		for(T s:t) {	System.out.println(s);	}
	}
}

public class GeneEx1 {
	public static void main(String[] args) {
		GeneT<String> gt = new GeneT<>(); // T를 String으로 정의
		String[] ss = {"대박", "사건", "뭥미"};
		gt.set(ss);
		gt.print();
		Integer[] ii = {12, 67, 77, 88, 99};
		GeneT<Integer> gt2 = new GeneT<>();
		gt2.set(ii);
		gt2.print();
	}
}