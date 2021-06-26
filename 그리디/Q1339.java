// 문제 링크 : https://www.acmicpc.net/problem/1339

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1339 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String string[] = new String[n];
		long result = 0;
		
		
		for(int i=0; i<n; i++) {
			string[i] = br.readLine();
		}
		
		int[][] alphabet = new int[26][3]; // 0에는 합, 1에는 초기 인덱스
		
		for(int i=0; i<26; i++) {
			alphabet[i][0] = 0;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<string[i].length(); j++) { 
				int position = string[i].length() - j; // 자릿수
				char c = string[i].charAt(j);
				int alpha = (int)c - 65; // 아스키코드로. A는 65이므로 -65 해줘서 0부터 시작하게
				alphabet[alpha][0] += Math.pow(10, position-1);	
			}
		}
		
		// 합이 높은 순으로 정렬
		Arrays.sort(alphabet, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[0]-o1[0];
			}
		});
		
		
		// 값 계산
		int assignInt = 9;
		for(int i=0; i<10; i++) {
			result += alphabet[i][0] * assignInt;
			assignInt--;
		}
		
		System.out.println(result);
		
		
	}

}

// 오답
// 내 풀이는 완전히 틀려서 풀이 방법을 찾아보고 풀었다.
// 각 알파벳이 전체 합에서 얼마나 자리를 차지하는지 알아보기 위해 Math.pow(10, 자릿수-1)을 구했다.
// 그 합이 큰 순서대로 큰 숫자를 할당해줬다.
