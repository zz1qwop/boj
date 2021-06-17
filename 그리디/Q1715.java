// 문제 링크 : https://www.acmicpc.net/problem/1715

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q1715 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long result = 0;
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=0; i<n; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		
		
		while(!queue.isEmpty()) {
			int a=0, b=0;
			if(queue.size()==1) {
				break;
			}else {
				a = queue.poll();
				b = queue.poll();
				
				if(!queue.isEmpty()) {
					queue.add(a+b);
				}
				
				result += a+b;
			}	
		}
		
		System.out.println(result);

	}

}

// 오답 : 묶음이 한 개일 때는 비교가 필요 없는데, 이 때도 수를 더해버렸다.
// 우선순위 큐에 묶음이 한 개 있을 때는 종료하도록 변경했다.