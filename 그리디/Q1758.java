// ���� ��ũ : https://www.acmicpc.net/problem/1758

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q1758 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer array[] = new Integer[n];
		long result = 0;

		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			if((array[i] - i)<0) break;
			result += array[i] - i;
		}
		
		System.out.println(result);

	}

}

// ���� ���� �ִ� ������� �����Ų��.
// ���� : result�� long �ڷ������� �ٲپ����� �ذ�Ǿ���.
