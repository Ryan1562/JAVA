package ch11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
public class Map2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("딸기","달콤하다");
		map.put("수박","시원하다");
		map.put("키위", "시큼하다");
		Set<String> fruits = map.keySet();
		for(String fruit: fruits) {
			System.out.println(fruit+" : "+map.get(fruit));
		}
		System.out.println("==============");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String fruit = it.next();
			System.out.println(fruit+" : "+map.get(fruit));
		}
	}
}
