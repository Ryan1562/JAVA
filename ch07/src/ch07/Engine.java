package ch07;
public class Engine {
	private int displacement;
	private String type;
	
	public Engine() {	}
	public Engine(int displacement, String type) {
		this.displacement = displacement; this.type = type;
	}
	
	public int getDisplacement() {	return displacement;	}
	public void setDisplacement(int displacement) {	this.displacement = displacement;	}
	public String getType() {		return type;	}
	public void setType(String type) {	this.type = type;	}
	
	void print() {
		System.out.println("=================");
		System.out.println("배기량 : " + displacement);
		System.out.println("엔진타입 : " + type);
	}	
}