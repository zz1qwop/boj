// 문제 링크 : https://www.acmicpc.net/problem/1783

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1783 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int result = 0;
		
		if(n==1 || m==1) {
			result = 1;
		}else if(n==2) {
			if(m>7) m=7;
			result = ((m-1)/2)+1;
		}else if(m<=4) {
			result = m;
		}else if(m<=6){
			result = 4;
		}else {
			result = (m-6) + 4;
		}

		System.out.println(result);

	}

}

// 문제 해결
// 단순하게 나올 수 있는 케이스별로 나누어서 풀었다.
// n이 2보다 크고 m이 6보다 클 때는 같은 방법으로 해결 가능하길래 그 이하의 경우를 세세하게 나누었다.