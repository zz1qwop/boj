// 문제 링크 : https://www.acmicpc.net/problem/2109

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q2109 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		Integer[][] array = new Integer[n][2];
		int check[] = new int[n];
		int maxDay = 0;
		int result= 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			if(maxDay<array[i][1]) maxDay = array[i][1];
			check[i] = 0;
		}
		
		Arrays.sort(array, (o1, o2)->{
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			}else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		for(int i=maxDay; i>=1; i--) {
			for(int j=n-1; j>=0; j--) {
				if(array[j][1]>=i && check[j]==0) {
					check[j]=1;
					result += array[j][0];
					break;
				}
			}
		}
		
		System.out.println(result);

	}

}

// 메모 : 알고리즘 분류에 우선순위 큐라고 되어 있었는데 계속 오류가 나서 이차원 배열로 풀었다.