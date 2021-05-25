// 문제 링크 : https://www.acmicpc.net/problem/2839

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		int temp;
		
		temp = n / 5; // 5kg 최대 개수
		while(true) {
			if(temp == 0) break;
			if((n - (temp*5)) % 3 == 0) break;
			temp--;
		}
		
		result += temp;
		n -= temp*5;
		
		if(temp==0 && n%3!=0) {
			System.out.println(-1);
			System.exit(0);
		}
		
		result += n / 3;
		System.out.println(result);
	}

}

// 문제 해결
// N에서 5kg 짜리를 꺼낸 후 3kg 짜리를 꺼내야 한다.
// 5kg 짜리를 꺼내고 남은 수는 3의 배수여야 한다.
// 5kg 0개를 꺼내게 되었을 때, 3의 배수가 아니면 -1 출력.
