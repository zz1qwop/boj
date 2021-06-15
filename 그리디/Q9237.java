// ���� ��ũ : https://www.acmicpc.net/problem/9237

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q9237 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer array[] = new Integer[n];
		int endDay[] = new int[n];
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			endDay[i] = (i+1) + array[i];
			if(max<endDay[i]) max = endDay[i];
		}
		
		System.out.println(max+1); // �� �ڶ� ���� ���� ���� �ʴ��ϹǷ�

	}

}

// ���� �ذ�
// ���� �ɸ��� ���� ���� �ɴ´�.
// �� ��° ������ + �ڶ�� �� �󸶳� �ɸ����� ���� ���ο� �迭�� �����Ѵ�.
// ���� ū ���� ���� ���� �ʴ��ϸ� �ȴ�.