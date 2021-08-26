// 문제 링크 : https://www.acmicpc.net/problem/14916

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14916 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int money = Integer.parseInt(br.readLine());
		int min = 50000;
		
		int five = money / 5;
		
		for(int i=five; i>=0; i--) {
			int money2 = money - (5*i); // 5원의 개수를 줄여나갈 것.
			if(money2 % 2 != 0) continue; // 못 거슬러 주는 경우
			
			int result = i + (money2/2);
			if(result<min) min = result;
		}
		
		if(min==50000) {
			System.out.println(-1);
		}else {
			System.out.println(min);

		}

	}

}

// 문제 해결
// 5원의 최대 개수부터 시작해서, 5원을 아예 안 주는 경우까지 모든 경우의 수를 구한다.
