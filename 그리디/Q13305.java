// ���� ��ũ : https://www.acmicpc.net/problem/13305

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13305 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		long km[] = new long[n-1];
		long money[] = new long[n];
		long result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n-1; i++) {
			km[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			money[i] = Integer.parseInt(st.nextToken());
		}
		
		// �ּڰ� ����ϱ�
		
		result += money[0] * km[0]; // ù ��° �����忡���� ������ �⸧�� �־�� �Ѵ�.
		
		int min = 0;
		for(int i=1; i<km.length; i++) {
			if(money[min]>money[i]) {
				min = i;
			}
			result += money[min] * km[i];
		}

		
		System.out.println(result);
		
		
	}

}

// ���� �ذ�
// ���� �ִ� �����Һ��� �� ������ �����Ұ� ���� ������, ���� �����ҿ��� �⸧�� �� �����ϰ� ����.

// ����
// km[], money[], result�� int���� long���� ��ġ�� �ذ�Ǿ���.
// int�� ������ -2,147,483,648 ~ 2,147,483,647�ε�
// km[], money[]�� 1�̻� 1,000,000,000 ������ �ڿ����� �Է¹޴´�.
// result�� km�� money�� �� ��Ҹ� ���ؼ� �����ֹǷ� int�� �����ߴ� ��.
// �ڷ����� �� �� �Ű澲��