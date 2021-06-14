// 문제 링크 : https://www.acmicpc.net/problem/1789

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1789 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());
		
		long sample = s;
		int i = 1; 
		int result = 0;
		
		while(true) {
			sample = sample - i;
			if(sample<=i) {
				break;
			}
			i++;
		}
		
		System.out.println(i);

	}

}

// 문제 해결
// 서로 다른 N개의 자연수의 합. 예제처럼 S가 200이라고 생각했을 때,
// 200개의 1들을 서로 다른 개수로 묶는 형태를 생각했다.
// 1개 묶음부터 시작해서 개수를 하나씩 늘렸다.
// 개수들은 서로 달라야 하므로, 나머지 그룹의 개수는 i개보다 많아야 한다.
// 오답 : 런타임 에러 (NumberFormat)가 발생했다. S의 범위가 S(1 ≤ S ≤ 4,294,967,295)인데 int로 받아서 발생한 오류였다.
// long 타입으로 고치니 해결되었다.
