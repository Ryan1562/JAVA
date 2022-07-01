package ch04;
import java.util.Arrays;
public class SelectSort {
	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		System.out.println("처음 : "+Arrays.toString(score));
		int imsi = 0;
		for(int i = 0; i < score.length;i++) {
			for(int j = i+1; j < score.length; j++) {  
				if (score[i] > score[j]) { 
					imsi = score[i];       
					score[i] = score[j];   
					score[j] = imsi;       
				}                         
			}
			System.out.println(i+"실행 후 : "+Arrays.toString(score));
		}
		for(int sc : score) { // 34 45 50 76 89 90 92 100
			System.out.print(sc+"\t");
		}
	}
}