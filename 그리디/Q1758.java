// 문제 링크 : https://www.acmicpc.net/problem/1758

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q1758 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer array[] = new Integer[n];
		long result = 0;

		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			if((array[i] - i)<0) break;
			result += array[i] - i;
		}
		
		System.out.println(result);

	}

}

// 팁을 많이 주는 사람부터 입장시킨다.
// 오답 : result를 long 자료형으로 바꾸었더니 해결되었다.
