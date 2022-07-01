package ch04;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		System.out.println("처음 : "+Arrays.toString(score));
		int imsi = 0;
		for(int i = 0; i < score.length - 1;i++) {
			for(int j = 0; j < score.length - (i+1) ; j++) {  
				if (score[j] > score[j+1]) { 
					imsi = score[j];       
					score[j] = score[j+1];   
					score[j+1] = imsi;       
				}                         
			}
			System.out.println(i+"실행 후 : "+Arrays.toString(score));
		}
		for(int sc : score) { // 34 45 50 76 89 90 92 100
			System.out.print(sc+"\t");
		}
	}
}