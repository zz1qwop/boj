// 문제 링크 : https://www.acmicpc.net/problem/18310

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q18310 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int array[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		int m;
		if(n%2==0) {
			m = array[(n/2)-1];
		}else {
			m = array[n/2];
		}
		
		
		System.out.println(m);
		

	}

}

// 문제 해결
// 거리 순으로 집을 정렬. 중간값에 가까운 집에 안테나를 설치한다.

