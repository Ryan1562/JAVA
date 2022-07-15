package ch11;

import java.util.HashSet;
import java.util.Iterator;
public class Set2 {
	public static void main(String[] args) {
		HashSet<String> nations = new HashSet<>();
		nations.add("미국"); nations.add("중국"); nations.add("한국"); 
		nations.add("영국"); nations.add("종국"); nations.add("떡국"); 
		
		for(String nation:nations) {
			System.out.println(nation);
		}
		System.out.println("==================");
		Iterator<String> it = nations.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}