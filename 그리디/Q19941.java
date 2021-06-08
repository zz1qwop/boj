// ���� ��ũ : https://www.acmicpc.net/problem/19941

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q19941 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		String table = br.readLine();
		int tableArray[] = new int[n];
		int result = 0;
		
		for(int i=0; i<n; i++) {
			tableArray[i] = 0; // �ܹ��Ÿ� �Ծ����� üũ�� �迭
		}
		
		for(int i=0; i<table.length(); i++) {
			if(table.charAt(i)=='H') {
				continue;
			}
			for(int j=i-k; j<=i+k; j++) {
				if(j<0 || j==i || j>=n) {
					continue;
				}
				if(table.charAt(j)=='H' && tableArray[j]==0) {
					tableArray[j] = 1;
					result += 1;
					break;
				}
			}
		}
		
		System.out.println(result);

	}

}

// ���� �ذ�
// ���ڿ��� Ž���ϸ� P�� �����Ѵ�. P�� �ε����� i��� �ϸ�, 
// i-k���� i+k���� ���������� �ƹ��� ���� ���� �ܹ��Ű� �ִ� ���� Ž���Ѵ�.
// �ܹ��Ÿ� ���� �Ծ������� �ٸ� �迭�� ����� �����Ѵ�.