// 문제 링크 : https://www.acmicpc.net/problem/1461

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1461 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int max = 0;
		int result = 0;
		
		int array[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(Math.abs(array[i]) > max) max = Math.abs(array[i]);
		}
		
		Arrays.sort(array);
		
		// 음수일 때
		for(int i=0; i<n; i = i+m) {
			if(array[i]>0) break;
			
			if(Math.abs(array[i])==max) {
				result += Math.abs(array[i]);
			}else {
				result += Math.abs(array[i]) * 2;
			}
		}
		
		// 양수일 때
		for(int i=n-1; i>=0; i = i-m) {
			if(array[i]<0) break;
			
			if(Math.abs(array[i])==max) {
				result += Math.abs(array[i]);
			}else {
				result += Math.abs(array[i]) * 2;
			}
		}
		
		System.out.println(result);

	}

}

// 문제 해결
// 책들의 좌표를 정렬한다. 제일 먼 위치에 있는 책은 마지막에 가지러 가므로 가는 거리만 더한다.
// m개씩 묶어 생각한다.
// 음수 좌표로 가는 경우와 양수 좌표로 가는 경우를 나누어서 생각했다.