package ch07;
public class Car2 {
	private String kind;
	private int cnt;
	
	public String getKind() {	return kind;	}
	public void setKind(String kind) {	this.kind = kind;	}
	public int getCnt() {		return cnt;	}
	public void setCnt(int cnt) {	this.cnt = cnt;	}
	
	public void print() {
		System.out.println("=================");
		System.out.println("차 종류 : " + kind);
		System.out.println("승차인원 : " + cnt);
	}
}