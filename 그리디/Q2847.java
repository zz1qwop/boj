// 문제 링크 : https://www.acmicpc.net/problem/2847

import java.util.Scanner;

public class Q2847 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int level[] = new int[n];
		int result = 0;
		
		for(int i=0; i<n; i++) {
			level[i] = scanner.nextInt();
		}
		
		for(int i=n-2; i>=0; i--) {
			if(level[i]>=level[i+1]) {
				int sub = level[i]-level[i+1];
				result = result + sub + 1;
				level[i] -= (sub+1);
			}
		}
		
		System.out.println(result);
	}
}
