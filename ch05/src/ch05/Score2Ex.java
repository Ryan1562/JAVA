package ch05;
class Score2 {
	String name;      	int[] score; 	String[] title;
	void title() {
		System.out.print("이름\t");
		for(int i =0; i < title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println("총점\t평균");
		System.out.println("======================================");
	}
	void print() {
		int sum = 0;
		System.out.print(name+"\t");
		for(int i =0; i < score.length;i++) {
			System.out.print(score[i]+"\t");
			sum += score[i];
		}
		System.out.printf("%d\t%.2f\n",sum,(double)sum/score.length);
	}
}
public class Score2Ex {
	public static void main(String[] args) {
		Score2 st1 = new Score2(); Score2 st2 = new Score2(); Score2 st3 = new Score2();
		st1.name = "아이유"; st1.score = new int[] {90, 80,70}; 
		st1.title = new String[] {"국어","영어","수학"};
		st2.name = "BTS"; st2.score = new int[] { 88, 77, 92};
		st3.name = "로제"; st3.score = new int[] { 92, 97, 77};
		st1.title();
		st1.print(); st2.print(); st3.print();
	}
}







