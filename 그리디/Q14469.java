// 문제 링크 : https://www.acmicpc.net/problem/14469

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q14469 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		int[][] array = new int[n][2];
		int result = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array, new Comparator<int[]>() {

			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			if(result<array[i][0])
				result = array[i][0];
			
			result += array[i][1];
		}
		
		System.out.println(result);
		
	}

}

// 문제 해결
// 빨리 오는 순서대로 정렬한다.
// 지금까지 걸린 시간은 result에 저장해둔다.
// result보다 온 시간이 늦으면 온 시간  + 걸리는 시간을 result에 저장.
// result보다 빨리 왔을 경우 result까지 기다렸다가 검사를 받아야 하므로 result + 걸리는 시간.
