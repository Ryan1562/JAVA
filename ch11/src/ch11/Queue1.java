package ch11;
import java.util.LinkedList;
public class Queue1 {
	public static void main(String[] args) {
		String[] fruits = {"산딸기", "판딸기","죽은딸기","알카리딸기"};
		LinkedList<String> que = new LinkedList<>();
		for(String fruit:fruits) {
			que.offer(fruit);
		}
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}