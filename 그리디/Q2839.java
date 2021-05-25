// ���� ��ũ : https://www.acmicpc.net/problem/2839

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		int temp;
		
		temp = n / 5; // 5kg �ִ� ����
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

// ���� �ذ�
// N���� 5kg ¥���� ���� �� 3kg ¥���� ������ �Ѵ�.
// 5kg ¥���� ������ ���� ���� 3�� ������� �Ѵ�.
// 5kg 0���� ������ �Ǿ��� ��, 3�� ����� �ƴϸ� -1 ���.
