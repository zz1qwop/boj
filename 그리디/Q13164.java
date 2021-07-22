// 문제 링크 : https://www.acmicpc.net/problem/13164

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q13164 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int tshirt[] = new int[n];
		int tshirtSub[] = new int[n-1];
		int result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			tshirt[i] = Integer.parseInt(st.nextToken());
			
			if(i==0) {
				continue;
			}
			
			tshirtSub[i-1] = tshirt[i] - tshirt[i-1];
		}
		
		Arrays.sort(tshirtSub);
		
		for(int i=0; i<tshirtSub.length-(k-1); i++) {
			result += tshirtSub[i];
		}
		
		System.out.println(result);

	}

}

// 문제 해결
// i번째와 i+1번째 원생의 키를 비교하여 키 차이 배열에 저장한다.
// 키 차이 배열을 오름차순으로 정리한다. 마지막 k-1개 요소를 제외하고 더하면 정답이 나온다.
