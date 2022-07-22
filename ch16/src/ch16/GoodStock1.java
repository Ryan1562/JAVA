package ch16;
import java.io.Serializable;
public class GoodStock1 implements Serializable {
//	String code;
	transient String code;
//	전달할 때 기밀이어서 전달하지 않을 데이터 transient
//	문자는 null, 숫자는 0으로 저장
//	transient int num;
	int num;
	public GoodStock1(String code, 	int num) {
		this.code = code; this.num = num;
	}
	public String toString() {
		return "주식[코드:"+code+", 수량:"+num+"]";
	}
}