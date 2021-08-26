// ���� ��ũ : https://www.acmicpc.net/problem/14916

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
			int money2 = money - (5*i); // 5���� ������ �ٿ����� ��.
			if(money2 % 2 != 0) continue; // �� �Ž��� �ִ� ���
			
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

// ���� �ذ�
// 5���� �ִ� �������� �����ؼ�, 5���� �ƿ� �� �ִ� ������ ��� ����� ���� ���Ѵ�.
