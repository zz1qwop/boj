// 문제 링크 : https://www.acmicpc.net/problem/5545

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q5545 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 토핑 수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 도우 가격
		int b = Integer.parseInt(st.nextToken()); // 토핑 가격
		
		int c = Integer.parseInt(br.readLine()); // 도우 열량
		Integer array[] = new Integer[n]; // 토핑 열량
		
		int price = a;
		int cal = c;
		int result = cal/price; // 1원 당 열량
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			int newResult = (cal+array[i])/(price+b);
			if(newResult>=result) {
				result = newResult;
				price = price+b;
				cal = cal+array[i];
			}else {
				break;
			}
		}
		
		System.out.println(result);
		
		
	}

}

// 문제 해결
// 토핑을 열량이 높은 순서대로 정렬한다.
// 차례대로 탐색하며, 해당 토핑을 넣었을 때 1원 당 열량이 줄어든다면 넣지 않고 종료한다.
