// 문제 링크 : https://www.acmicpc.net/problem/2217

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q2217 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int k;
		try {
			k = Integer.parseInt(bf.readLine());
			
			Integer rope[] = new Integer[k];
			int result[] = new int[k];
			int temp, max=0;
			
			for(int i=0; i<k; i++) {
				rope[i] = Integer.parseInt(bf.readLine());
			}
			
			// 로프 정렬
			Arrays.sort(rope, Collections.reverseOrder());
			
			// 로프를 1, 2, ... k-1, k개를 사용했을 때 최대 중량
			for(int i=1; i<=k; i++) { // i는 로프의 개수
				result[i-1] = rope[i-1] * i;
				if(result[i-1]>max) max = result[i-1];
			}
			
			bf.close();
			System.out.println(max);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

// 문제 해결
// 로프 개수 k를 입력받는다. rope 배열에 각 로프가 버틸 수 있는 중량 입력.
// rope가 큰 순서대로 정렬한다.
// k개를 사용 시 최대 중량, k-1개 사용 시 최대 중량 ... 등을 구해 result 배열에 넣는다.
// 그 중 제일 큰 값을 출력.

// 처음 풀이는 시간 초과가 났는데 Scanner 대신 BufferedReader를 사용하고
// 버블 정렬 대신 Arrays.sort를 사용했더니 해결되었다.