// 문제 링크 : https://www.acmicpc.net/problem/2437

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2437 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		Integer kg[] = new Integer[n];
		long result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			kg[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(kg);
		
		for(int i=0; i<kg.length; i++) {
			if(kg[0]!=1) break;
			
			result += kg[i];
			
			if(i+1==kg.length) break;
			
			if(result+1 < kg[i+1]) break;
		}
		
		System.out.println(result+1);

	}

}

// 문제 해결
// 현재 누적값 + 1 < array[i+1] 이면 현재 누적값 +1이 답이다.
// 아직 완벽하게 이해가 가지 않았음.
