// 문제 링크 : https://www.acmicpc.net/problem/1202

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1202 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		PriorityQueue<int[]> jewel = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}else {
					return o2[1]-o1[1];
				}
			}	
		});
		PriorityQueue<int[]> jewelQ = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o2[1]-o1[1];
				}else {
					return o1[0]-o2[0];
				}
			}	
		});

		int bag[] = new int[k];
		long result = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());

			int[] j = new int[2];
			j[0] = Integer.parseInt(st.nextToken());
			j[1] = Integer.parseInt(st.nextToken());
			jewelQ.add(j);
		}
		
		for(int i=0; i<k; i++) {
			bag[i] = Integer.parseInt(br.readLine());
		}
		

		// 가방 정렬. 작은 것부터
		Arrays.sort(bag);
		
		for(int i=0; i<k; i++) {
			for(int j=0; j<n; j++) {
				
			}
		}
		
		for(int i=0; i<k; i++) {
			for(int j=0; j<jewelQ.size(); j++) {
				if(bag[i]<jewelQ.peek()[0]) {
					break;
				}else {
					jewel.add(jewelQ.poll());
				}
			}
			
			if(!jewel.isEmpty()) {
				result += jewel.poll()[1];
			}
		}
		
		System.out.println(result);
		
	}

}

// 시간초과
// 해결 -> 현재 가방보다 작거나 같은 보석을 우선 순위 큐에 추가. 가장 앞의 것을 빼내기.
// 다음 가방으로 for문이 돌면, 작거나 같은 보석을 또 추가하는 방식.
// 원래 보석 목록도 무게의 오름차순으로 해둔다.