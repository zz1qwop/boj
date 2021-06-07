// 문제 링크 : https://www.acmicpc.net/problem/13904

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q13904 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] array = new int[n][2];
		StringTokenizer st = null;
		int max = 0; // 최대 마감일 저장
		int result = 0;
		int check[] = new int[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			if(max<array[i][0]) {
				max = array[i][0];
			}
			check[i] = 0; // 해당 과제가 선택되었는지 체크할 배열
		}
		
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o2[0] - o1[0];
				}else {
					return o2[1] - o1[1];
				}
			}
		});
		
		for(int i=max; max>0; max--) {
			for(int j=0; j<n; j++) {
				if(array[j][0]>=max && check[j]==0) {
					result += array[j][1];
					check[j] = 1;
					break;
				}
			}
		}
		System.out.println(result);	
	}
}

// 문제 해결
// 과제의 최대 마감일을 생각한다.
// 최대 마감일에 할 수 있는, 점수가 가장 높은 과제를 선택한다.
// 최대 마감일-1일에 할 수 있는, 점수가 가장 높은 과제를 선택하며 내려온다.
