// 문제 링크 : https://www.acmicpc.net/problem/17224

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q17224 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int array[][] = new int[n][2];
		
		int result = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			
			if(array[i][1]<=l) { // 어려운 문제 풀 수 있으면 쉬운 문제는 0으로 둬서 정렬 먼저 되게.
				array[i][0] = 0;
			}
		}
		
		Arrays.sort(array, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}
			
		});
		
		for(int i=0; i<k; i++) {
			if(array[i][0]==0) {
				result += 140; // 어려운 문제
			}else if(array[i][0]<=l) {
				result += 100;
			}else if(array[i][0]>l) {
				break;
			}
		}
		
		System.out.println(result);
		
	}

}

// 문제 해결
// 쉬운 문제와 어려운 문제를 입력받을 때, 어려운 문제를 풀 수 있다면 쉬운 문제 자리에 0을 넣는다.
// 이후 배열을 쉬운 문제 내림차순 -> 어려운 문제 내림차순으로 정렬한다.
// 그러면 0을 넣은 요소들이 가장 먼저 온다.
// 배열을 앞에서부터 탐색한다. k개 만큼 풀 수 있으므로 k번 돈다.
// 쉬운 문제가 0이면 어려운 문제가 해결 가능한 경우이므로 140점을 넣는다.