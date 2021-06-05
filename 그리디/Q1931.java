// 문제 링크 : https://www.acmicpc.net/problem/1931

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] time = new int[n][2];
		int result = 0;
		int current = 0;
		StringTokenizer st = null;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0] - o2[0];
				}else {
					return o1[1] - o2[1];
				}
			}
		});
		
		current = time[0][1];
		result += 1;
		for(int i=1; i<n; i++) {
			if(time[i][0]>=current) {
				result += 1;
				current = time[i][1];
			}
		}
		
		System.out.println(result);
	}

}

// 오답
// 끝나는 시간을 기준으로 정렬하여 회의를 선택하면 되는 간단한 방법이었다.
// 전혀 다른 방법으로 접근해서 for문을 계속 돌다 보니 시간 초과가 났다.
