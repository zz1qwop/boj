// 문제 링크 : https://www.acmicpc.net/problem/10775

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10775 {

	public static int gate[] = new int[100001];

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int gateN = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		int g[] = new int[p];
		int result = 0;
		
		gate[0] = 0;
		for(int i=1; i<=gateN; i++){
			gate[i] = i;
		}
		
		for(int i=0; i<p; i++) {
			g[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<p; i++) {
			int x = find(g[i]);
			if(x!=0) {
				result += 1;
				union(x-1, x);
			}else {
				break;
			}
		}
		
		System.out.println(result);
		
	}

	static int find(int x) {
		if(x == gate[x])
			return x;
		else
			return gate[x] = find(gate[x]);
	}
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if(x!=y) {
			gate[y] = x;
		}
	}
}

// 오답
// 순차적으로 gate[]를 탐색하는 방법으로 풀었더니 시간초과가 발생했다.
// 검색해보니 유니온파인드 방식으로 풀어야 한대서, 코드를 새로 작성했다.