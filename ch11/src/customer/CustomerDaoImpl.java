package customer;
import java.util.Collection;
// 전달받은 명령을 실행해서 Customer데이터를 Map(DB)체 저장하고 수정, 삭제, 조회 // DAO Data Access Object
import java.util.HashMap;
import java.util.Map;
public class CustomerDaoImpl {
//	DB에 저장하면 영구적이지만 map에 저장하면 프로그램을 종료하면 메모리에서 데이터 정리된다
	private Map<String, Customer> map = new HashMap<>(); // key id, value 고객정보
	public Customer select(String id) {
		return map.get(id);  // map에서 데이터 한건 읽기 map.get(key) 결과는 고객 정보
	}
	public int insert(Customer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}
	public int update(Customer customer) {
		map.replace(customer.getId(), customer);
		return 1;
	}
	public Collection<Customer> list() {
		return map.values();
	}
	public int delete(String id) {
		map.remove(id);
		return 1;
	}
}