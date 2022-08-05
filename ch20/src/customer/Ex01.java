package customer;
import java.util.Scanner;
public class Ex01 {
	private static CustomerServiceImpl cs = new CustomerServiceImpl();
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String command = "";
		while(true) {
			help();
			command = sc.nextLine();
			if (command.equals("6")) break;
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
	private static void help() {
		System.out.println();
		System.out.println("다음 명령어 중에서 선택하시오");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 목록");
		System.out.println("6. 종료");
		System.out.print("명령번호 : ");
	}
}