// 문제 링크 : https://www.acmicpc.net/problem/11000

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q11000 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		int[][] classList = new int[n][2];
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=0; i<n; i++) {
			int array[] = new int[2];
			st = new StringTokenizer(br.readLine());
			array[0] = Integer.parseInt(st.nextToken());
			array[1] = Integer.parseInt(st.nextToken());
			
			classList[i] = array;
		}
		
		Arrays.sort(classList, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1];
				}else {
					return o1[0]-o2[0];
				}
			}
			
		});
		
		queue.add(classList[0][1]);
		for(int i=1; i<n; i++) {
			if(queue.peek() <= classList[i][0]) {
				queue.poll();
				queue.add(classList[i][1]);
			}else {
				queue.add(classList[i][1]);
			}
		}
		
		System.out.println(queue.size());


	}

}

// 계속 시간초과가 났는데 생각보다 간단하게 풀 수 있는 문제였다. 직접 해결하지 못해 아쉬움.
