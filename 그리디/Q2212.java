// 문제 링크 : https://www.acmicpc.net/problem/2212

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2212 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int array[] = new int[n];
		Integer len[] = new Integer[n-1];
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
	
		for(int i=0; i<n; i++) {
			if(i==n-1) break;
			len[i] = array[i+1] - array[i];
		}
		
		Arrays.sort(len, Collections.reverseOrder());
		
		for(int i=k-1; i<n-1; i++) {
			result += len[i];
		}
		
		System.out.println(result);
	}

}

// 문제 해결
// 각 센서 사이의 거리 차를 구한다. 거리 차를 내림차순으로 정렬한다.
// 집중국이 k개면, n-1개의 거리 차 중에 k-1개의 거리 차가 빠지게 된다. (결과적으로 k개로 나누어짐.)
// 수신 가능 영역 거리 합의 최솟값을 구하므로 큰 거리 차부터 제외시킨다.
