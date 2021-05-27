// 문제 링크 : https://www.acmicpc.net/problem/13305

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13305 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		long km[] = new long[n-1];
		long money[] = new long[n];
		long result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n-1; i++) {
			km[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			money[i] = Integer.parseInt(st.nextToken());
		}
		
		// 최솟값 계산하기
		
		result += money[0] * km[0]; // 첫 번째 정류장에서는 무조건 기름을 넣어야 한다.
		
		int min = 0;
		for(int i=1; i<km.length; i++) {
			if(money[min]>money[i]) {
				min = i;
			}
			result += money[min] * km[i];
		}

		
		System.out.println(result);
		
		
	}

}

// 문제 해결
// 현재 있는 주유소보다 싼 가격의 주유소가 나올 때까지, 현재 주유소에서 기름을 다 충전하고 간다.

// 오답
// km[], money[], result를 int에서 long으로 고치니 해결되었다.
// int의 범위는 -2,147,483,648 ~ 2,147,483,647인데
// km[], money[]는 1이상 1,000,000,000 이하의 자연수를 입력받는다.
// result는 km와 money의 각 요소를 곱해서 더해주므로 int가 부족했던 것.
// 자료형을 좀 더 신경쓰기