// 문제 링크 : https://www.acmicpc.net/problem/19941

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q19941 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		String table = br.readLine();
		int tableArray[] = new int[n];
		int result = 0;
		
		for(int i=0; i<n; i++) {
			tableArray[i] = 0; // 햄버거를 먹었는지 체크할 배열
		}
		
		for(int i=0; i<table.length(); i++) {
			if(table.charAt(i)=='H') {
				continue;
			}
			for(int j=i-k; j<=i+k; j++) {
				if(j<0 || j==i || j>=n) {
					continue;
				}
				if(table.charAt(j)=='H' && tableArray[j]==0) {
					tableArray[j] = 1;
					result += 1;
					break;
				}
			}
		}
		
		System.out.println(result);

	}

}

// 문제 해결
// 문자열을 탐색하며 P에 접근한다. P의 인덱스를 i라고 하면, 
// i-k부터 i+k까지 순차적으로 아무도 먹지 않은 햄버거가 있는 곳을 탐색한다.
// 햄버거를 누가 먹었는지는 다른 배열을 만들어 관리한다.