package ch07;
public class Car {
	private Engine eg;   // 클래스 안에 클래스 있음 : 포함관계 has-a 관계
	private String color;
	Car(){}
	Car(Engine eg, String color) {
		this.eg = eg;  this.color = color;
	}
	public Engine getEg() {	return eg;	}
	public void setEg(Engine eg) {	this.eg = eg;	}
	public String getColor() {		return color;	}
	public void setColor(String color) {	this.color = color;	}
	
	void print() {
		eg.print();
		System.out.println("색깔 : " + color);
	}
}