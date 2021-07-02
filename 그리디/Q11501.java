// ���� ��ũ : https://www.acmicpc.net/problem/11501

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11501 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int t = Integer.parseInt(br.readLine());
		int[][] testCase = new int[t][];
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			testCase[i] = new int[n];
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<n; j++) {
				testCase[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<t; i++) {
			int max = 0;
			long result = 0;
			
			for(int j=testCase[i].length-1; j>=0; j--) {
				if(max < testCase[i][j]) {
					max = testCase[i][j];
				}else if(testCase[i][j] < max) {
					result += (max-testCase[i][j]);
				}
			}
			
			System.out.println(result);
		}

	}

}

// ���� �ذ�
// �ڿ������� Ž���Ѵ�. max�� �ΰ� max���� ���� ��쿡 max-���� ���� ��� ���� �����Ѵ�.
