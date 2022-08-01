package ch19;
public class Student3 {
//	9장 참조 enum은 데이터 타입을 만들 때 사용
	public enum Gender {MALE, FEMALE}
	public enum City {Seoul, Pusan}
	
	private String name;
	private int score;
	private Gender gender;
	private City city;
	
	public Student3(String name, int score, Gender gender) {
		this.name=name; this.gender=gender; this.score=score;
	}
	public Student3(String name, int score, Gender gender, City city) {
		this.name=name; this.gender=gender; this.score=score; this.city=city;
	}
	
	public String getName() {	return name;	}
	public int getScore() {		return score;	}
	public Gender getGender() {	return gender;	}
	public City getCity() {		return city;	}	
}