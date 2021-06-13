// 문제 링크 : https://www.acmicpc.net/problem/15903

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q15903 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long a, b;
		long result = 0;
		
		PriorityQueue<Long> queue = new PriorityQueue<Long>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			queue.add(Long.parseLong(st.nextToken()));
		}

		for(int i=0; i<m; i++) {
			a = queue.poll();
			b = queue.poll();
			
			queue.add(a+b);
			queue.add(a+b);
		}
		
		for(long element : queue) {
			result += element;
		}
		
		System.out.println(result);
		
	}

}

// 문제 해결
// 제일 작은 수 두 개를 뽑아서 더한다. -> 반복
// 오답 : 큐와 result를 int로 만들었더니 계속 실패했다. long으로 바꿔주었다.
