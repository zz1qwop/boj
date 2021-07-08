// ���� ��ũ : https://www.acmicpc.net/problem/2212

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2212 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int array[] = new int[n];
		Integer len[] = new Integer[n-1];
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
	
		for(int i=0; i<n; i++) {
			if(i==n-1) break;
			len[i] = array[i+1] - array[i];
		}
		
		Arrays.sort(len, Collections.reverseOrder());
		
		for(int i=k-1; i<n-1; i++) {
			result += len[i];
		}
		
		System.out.println(result);
	}

}

// ���� �ذ�
// �� ���� ������ �Ÿ� ���� ���Ѵ�. �Ÿ� ���� ������������ �����Ѵ�.
// ���߱��� k����, n-1���� �Ÿ� �� �߿� k-1���� �Ÿ� ���� ������ �ȴ�. (��������� k���� ��������.)
// ���� ���� ���� �Ÿ� ���� �ּڰ��� ���ϹǷ� ū �Ÿ� ������ ���ܽ�Ų��.
