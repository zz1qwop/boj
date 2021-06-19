// 문제 링크 : https://www.acmicpc.net/problem/16435

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q16435 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		int array[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		for(int i=0; i<n; i++) {
			if(array[i]<=l) {
				l += 1;
			}else {
				break;
			}
		}
		
		System.out.println(l);
	}

}

// 문제 해결
// 과일을 오름차순으로 정렬하여 앞부분부터 탐색한다.
// 길이보다 작거나 같으면 길이를 +1하고, 길이보다 크면 먹을 수 없으므로 종료한다.