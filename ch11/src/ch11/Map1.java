package ch11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Map1 {
	public static void main(String[] args) {
		HashMap<String, String> hm1 = new HashMap<>();
//		        key       value
		hm1.put("BTS", "010-1234-1111");
		hm1.put("블랙핑크","010-1111-2222");
		hm1.put("아이유","010-2222-3333");
//		get(key) => 값
		System.out.println(hm1.get("블랙핑크"));
		Set<String> keys = hm1.keySet(); // HashMap에서 key만 읽어서 set에 담아라
		for(String key: keys) {
			System.out.println(key+" : " +hm1.get(key));
		}
		System.out.println("==================");
		Iterator<String> it = hm1.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : " +hm1.get(key));
		}
	}
}