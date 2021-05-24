// ���� ��ũ : https://www.acmicpc.net/problem/2217

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q2217 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int k;
		try {
			k = Integer.parseInt(bf.readLine());
			
			Integer rope[] = new Integer[k];
			int result[] = new int[k];
			int temp, max=0;
			
			for(int i=0; i<k; i++) {
				rope[i] = Integer.parseInt(bf.readLine());
			}
			
			// ���� ����
			Arrays.sort(rope, Collections.reverseOrder());
			
			// ������ 1, 2, ... k-1, k���� ������� �� �ִ� �߷�
			for(int i=1; i<=k; i++) { // i�� ������ ����
				result[i-1] = rope[i-1] * i;
				if(result[i-1]>max) max = result[i-1];
			}
			
			bf.close();
			System.out.println(max);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

// ���� �ذ�
// ���� ���� k�� �Է¹޴´�. rope �迭�� �� ������ ��ƿ �� �ִ� �߷� �Է�.
// rope�� ū ������� �����Ѵ�.
// k���� ��� �� �ִ� �߷�, k-1�� ��� �� �ִ� �߷� ... ���� ���� result �迭�� �ִ´�.
// �� �� ���� ū ���� ���.

// ó�� Ǯ�̴� �ð� �ʰ��� ���µ� Scanner ��� BufferedReader�� ����ϰ�
// ���� ���� ��� Arrays.sort�� ����ߴ��� �ذ�Ǿ���.