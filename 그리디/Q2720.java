// 문제 링크 : https://www.acmicpc.net/problem/2720

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int testCase[] = new int[n];
		int result[][] = new int[n][4];
		
		for(int i=0; i<n; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<n; i++) {
			result[i][0] = testCase[i] / 25;
			testCase[i] = testCase[i] % 25;
			result[i][1] = testCase[i] / 10;
			testCase[i] = testCase[i] % 10;
			result[i][2] = testCase[i] / 5;
			testCase[i] = testCase[i] % 5;
			result[i][3] = testCase[i] / 1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
