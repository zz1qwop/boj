// 문제 링크 : https://www.acmicpc.net/problem/1781

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1781 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o2[1] - o1[1];
				}else {
					return o2[0] - o1[0];
				}
			}
			
		});
		PriorityQueue<int[]> possible = new PriorityQueue<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o2[0] - o1[0];
				}else {
					return o2[1] - o1[1];
				}
			}
			
		});
		
		long result = 0;
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int array[] = new int[2];
			array[0] = Integer.parseInt(st.nextToken());
			array[1] = Integer.parseInt(st.nextToken());
			
			queue.add(array);
		}

		for(int i=n; i>=1; i--) {
			
			for(int j=0; j<queue.size(); j++) {
				int array[] = queue.peek();
				if(array[0]>=i) {
					possible.add(queue.poll());
				}else {
					break;
				}
			}
			
			if(possible.size()==0) {
				continue;
			}else {
				int array[] = possible.poll();
				result += array[1];
			}
			
		}
		
		System.out.println(result);
	}

}

// 문제 풀이
// 입력 받은 문제는 데드 라인이 큰 순서대로 PriorityQueue에 넣는다.
// 현재 풀 수 있는 문제는 보상이 큰 순서대로 PriorityQueue에 넣는다.
// 현재 풀 수 있는 문제 : 현재 날짜보다 데드 라인이 큰 문제. 현재 날짜와 비교해서 첫 번째 P.Q에서 요소를 꺼내 두 번째 P.Q에 넣는다.
// 두 번째 P.Q가 비어있지 않다면 풀 수 있는 문제가 있다는 소리이므로, 첫 번째 요소를 꺼내 결과값에 더한다.