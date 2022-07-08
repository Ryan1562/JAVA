package ch07;
public class Score1Ex {
	public static void main(String[] args) {
		String subject = "매출현황";
		String[] title = {"제품명","1월","2월","3월","4월","5월","합계","평균"};
		int len = 64;
		String[] name = {"냉장고","테레비","청소기","에어콘"};
		int[][] amt = {{250, 170, 300, 780, 670},{170, 120, 150, 220,340},{450, 230, 400, 250,350},
				{340,450,778,555,666}};
		Score1 sc = new Score1(subject, name, title, amt, len);
		sc.print();
//		String subject = "성적표";
//		String[] name = {"BTS","아이유", "유재석","블랙핑크", "이준호"};
//		String[] title = {"이름","국어","영어","수학","과학","총점","평균"};
//		int[][] score = {{90,83,72,77},{76,86,93,55},{90,78,92,99},{82,98,79,88}, {88,77,99,92}};
//		int len = 54;
//		Score1 sc = new Score1(subject, name, title, score, len);
//		sc.print();
	}
}
