package ch19;

import java.util.Arrays;
import java.util.List;

public class Filter1Ex {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("제니","보검","제니","제시","준호","보검");
//		distinct중복 제거
		names.stream().distinct().forEach(n->System.out.println(n));
		System.out.println("===========");
//		'제'로 시작하는 이름
		names.stream().filter(n->n.startsWith("제")).forEach(n->System.out.println(n));
		System.out.println("===========");
//		'제'로 시작하는 이름 distinct중복 제거
		names.stream().filter(n->n.startsWith("제")).distinct().forEach(n->System.out.println(n));
	}
}