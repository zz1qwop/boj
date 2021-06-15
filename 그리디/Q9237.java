// 문제 링크 : https://www.acmicpc.net/problem/9237

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q9237 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer array[] = new Integer[n];
		int endDay[] = new int[n];
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			endDay[i] = (i+1) + array[i];
			if(max<endDay[i]) max = endDay[i];
		}
		
		System.out.println(max+1); // 다 자란 날의 다음 날에 초대하므로

	}

}

// 문제 해결
// 오래 걸리는 묘목 부터 심는다.
// 몇 번째 날인지 + 자라는 지 얼마나 걸리는지 구해 새로운 배열에 저장한다.
// 제일 큰 값의 다음 날에 초대하면 된다.