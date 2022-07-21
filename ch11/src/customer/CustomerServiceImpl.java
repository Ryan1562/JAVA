package customer;

import java.util.Collection;

// 실행클래스로 부터 전달 받은 명령을 분석해서 처리할 내용을 Dao에게 시키고 그 결과를 실해크래스 전달
public class CustomerServiceImpl {
	private static CustomerDaoImpl cd = new CustomerDaoImpl();
	public int insert(Customer customer) {
		int result = 0; // 0은 실패, 1은 성공
//		map에 같은 데이터가 있는지 확인하고 없으면 입력, 있으면 '이미 있는 데이터 입니다'메세지 출력
//		customer Ex01에서 넘어온 고객정보, customer2는 DAO를 통하여 map에서 읽어온 데이터
		Customer customer2 = cd.select(customer.getId());
		if (customer2==null)  result = cd.insert(customer); // id에 해당하는 고객이 없음
		else System.out.println("이미 있는 데이터 입니다");
		return result;
	}
	public Customer select(String id) { // 결과는 id에 해당하는 Customer 객체
		return cd.select(id);
	}
	public int update(Customer customer) {
		int result = 0; 
		Customer customer2 = cd.select(customer.getId());
		if (customer2 == null) System.out.println("없는 데이터를 우찌 고치니");
		else result = cd.update(customer);
		return result;
	}
	public Collection<Customer> list() {
		return cd.list(); 
	}
	public int delete(String id) {
		int result = 0; 
		Customer customer2 = cd.select(id);
		if (customer2 == null) System.out.println("없는 데이터를 우찌 삭제하니");
		else result = cd.delete(id);
		return result;
	}
}