// 문제 링크 : https://www.acmicpc.net/problem/10162

import java.util.Scanner;

public class Q10162 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = 0, b = 0, c = 0, t;
		t = scanner.nextInt();
		
		if(t%10 != 0) {
			System.out.println(-1);
			System.exit(0);
		}
		
		a = t / 300;
		t = t % 300;
		b = t / 60;
		t = t % 60;
		c = t / 10;
		
		System.out.println(a+" "+b+" "+c);
		
		
	}

}
