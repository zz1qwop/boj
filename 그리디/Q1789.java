// ���� ��ũ : https://www.acmicpc.net/problem/1789

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

// ���� �ذ�
// ���� �ٸ� N���� �ڿ����� ��. ����ó�� S�� 200�̶�� �������� ��,
// 200���� 1���� ���� �ٸ� ������ ���� ���¸� �����ߴ�.
// 1�� �������� �����ؼ� ������ �ϳ��� �÷ȴ�.
// �������� ���� �޶�� �ϹǷ�, ������ �׷��� ������ i������ ���ƾ� �Ѵ�.
// ���� : ��Ÿ�� ���� (NumberFormat)�� �߻��ߴ�. S�� ������ S(1 �� S �� 4,294,967,295)�ε� int�� �޾Ƽ� �߻��� ��������.
// long Ÿ������ ��ġ�� �ذ�Ǿ���.
