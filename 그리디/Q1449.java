// 문제 링크 : https://www.acmicpc.net/problem/1449

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1449 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int pipe[]  = new int[1000];
		int result = 0;
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int hole[] = new int[n];
		for(int i=0; i<n; i++) {
			hole[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(hole);
		
		// pipe 초기화
		for(int i=0; i<1000; i++) {
			pipe[i] = 0;
		}
		
		// hole 막기
		for(int i=0; i<hole.length; i++) {
			if(pipe[hole[i]-1]==0) {
				result += 1;
			}else {
				continue;
			}
			for(int j=0; j<l; j++) {
				if((hole[i]-1+j)<1000) {
					pipe[hole[i]-1+j] = 1;
				}
			}
		}
		
		System.out.println(result);
		
	}

}

// 문제 해결
// 전체 파이프 배열을 준비해서 0으로 둔다. 테이프로 막으면 1로 업데이트.
// hole을 앞부분부터 방문. 0일시 테이프의 길이만큼 파이프 배열을 1로 업데이트. 1이면 다음 hole로 패스.
