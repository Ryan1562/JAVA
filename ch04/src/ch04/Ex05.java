package ch04;

public class Ex05 {
	int[][] score = { { 67, 78, 98 }, { 78, 98, 65 }, { 78, 56, 90 } };
	int tot = 0, max = 0, min = 100, tmax = 0, tmin = 100;
	float avg;
	
		for (int[] f : score) {
			for (int s : f) {
				tot += s;
				if (max < s)
					max = s;
				if (min > s)
					min = s;
				if (tmax < s)
					tmax = s;
				if (tmin > s)
					tmin = s;
			}
			avg = tot / 3.0f;
			System.out.println("총점 : " + tot + ", 평균 : " + avg);
			System.out.println("최고 : " + max + ", 최소 : " + min);
			tot = 0;
			max = 0;
			min = 100;
		}
		System.out.println("전체최고 : " + tmax + ", 전체최소 : " + tmin);
	
}