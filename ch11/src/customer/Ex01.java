package customer;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;
// 콘솔창(웹)으로 부터 명령어를 전달받아서 Service를 통하여 실행하고 그 결과를 콘솔창(웹화면)에 알려준다
public class Ex01 {
	private static CustomerServiceImpl cs = new CustomerServiceImpl();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("명령어를 입력하세요");
			String command = sc.nextLine();
			if (command.equals("exit")) break;
			else if(command.startsWith("insert")) // 명령어가 insert로 시작했으면
//				컴마(,)를 기준으로 데이터 나누어서 배열로 만들어서 insert하는 메서드의 매개변수로 사용
				insert(command.split(","));
			else if (command.startsWith("select")) select(command.split(","));
			else if (command.startsWith("update")) update(command.split(","));
			else if (command.startsWith("delete")) delete(command.split(","));
			else if (command.equals("list")) list();
			else help();
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
	private static void delete(String[] str) {
		if (str.length != 2) {
			help();
			return;  // 현재 메서드를 종료
		} 
		int result = cs.delete(str[1]);
		if (result > 0) System.out.println("삭제 성공 ㅋㅋ");
	}
	private static void list() {
		Collection<Customer> list = cs.list();
//		null list객체가 없다   list객체는 있는데 데이터가 없다
		if (list == null || list.size() ==0) System.out.println("데이터가 없습니다");
		else for(Customer customer : list) {
			System.out.println(customer);
		}
	}
	private static void update(String[] str) {
		if (str.length != 6) {
			help();
			return;  // 현재 메서드를 종료
		}
		Customer customer = new Customer(str[1],str[2], str[4], str[5], new Date());
		if (!str[2].equals(str[3])) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
//		CustomerServiceImpl을 통해서 데이터를 입력시키고 그 결과를 정수로 받아온다
		int result = cs.update(customer);
		if (result > 0) System.out.println("수정 성공 ! 대박 대굴박");
	}
	private static void select(String[] str) {
		if (str.length != 2) {
			help();
			return;  // 현재 메서드를 종료
		}                   //  0     1 id = key
//		split(select,id) => {select, id}
		Customer customer = cs.select(str[1]);
		if (customer == null) System.out.println("없는 데이터 입니다");
		else System.out.println(customer);
	}
	private static void insert(String[] str) {
		if (str.length != 6) {
			help();
			return;  // 현재 메서드를 종료
		}
		// 입력한 데이터를 가지고 고객 생성
		Customer customer = new Customer(str[1],str[2], str[4], str[5], new Date());
		if (!str[2].equals(str[3])) {
			System.out.println("암호와 암호확인이 다릅니다");
			return;
		}
//		CustomerServiceImpl을 통해서 데이터를 입력시키고 그 결과를 정수로 받아온다
		int result = cs.insert(customer);
		if (result > 0) System.out.println("입력 성공 ! 대박 대굴박");
	}
	private static void help() {
		System.out.println("\n잘못된 명령어입니다");
		System.out.println("다음 명령어 중에서 선택하세요");
		System.out.println("insert,id,암호,암호확인,이메일,이름"); // 입력
		System.out.println("update,id,암호,암호확인,이메일,이름"); // 수정
		System.out.println("delete,id"); // 삭제
		System.out.println("select,id"); // 조회
		System.out.println("list");      // 목록
		System.out.println("exit");      // 프로그램 종료
	}
}