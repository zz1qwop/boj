// 문제 링크 : https://www.acmicpc.net/problem/11508

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q11508 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer array[] = new Integer[n];
		int result = 0;
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int i=0; i<n; i+=3) {
			if(i+2<n) {
				result += array[i];
				result += array[i+1];
			}else if(i+1==n) {
				result += array[i];
			}else if(i+2==n) {
				result += array[i];
				result += array[i+1];
			}
		}
		
		System.out.println(result);

	}

}

// 문제 해결
// 비싼 물건을 할인 받을 수록 총 합계가 적으므로 물건을 내림차순으로 정렬한다. 
// 내림차순 배열에서 물건을 세 개씩 묶어 생각한다.