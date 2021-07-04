// 문제 링크 : https://www.acmicpc.net/problem/1946

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1946 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[][][] array = new int[t][][];
		
		StringTokenizer st = null;
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			array[i] = new int[n][2];
			
			for(int j=0; j<n; j++) {
				st = new StringTokenizer(br.readLine());
				array[i][j][0] = Integer.parseInt(st.nextToken());
				array[i][j][1] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<t; i++) {
			Arrays.sort(array[i], new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0];
				}
				
			});
		}
		

		for(int i=0; i<t; i++) {
			int min = array[i][0][1];
			int result = 1;
			
			for(int j=1; j<array[i].length; j++) {
				if(array[i][j][1]<min) {
					min =  array[i][j][1];
					result += 1;
				}
			}
			
			System.out.println(result);
			
		}

	}

}

// 문제 해결
// 점수 순이 아니라 등수 순이다! <- 이걸 못 보고 헤맸음
// A의 등수를 오름차순으로 정렬. A의 1등은 무조건 합격할테니, A 1등의 B 등수보다 높은 사람들이 합격.
// A 등수 순으로 B 등수를 검사. B 등수는 물론 A 1등보다 높아야 되지만, 동시에 이전 사람(A 등수 높은 사람)의 B 등수보다 높아야 함.
