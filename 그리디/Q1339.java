// ���� ��ũ : https://www.acmicpc.net/problem/1339

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1339 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String string[] = new String[n];
		long result = 0;
		
		
		for(int i=0; i<n; i++) {
			string[i] = br.readLine();
		}
		
		int[][] alphabet = new int[26][3]; // 0���� ��, 1���� �ʱ� �ε���
		
		for(int i=0; i<26; i++) {
			alphabet[i][0] = 0;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<string[i].length(); j++) { 
				int position = string[i].length() - j; // �ڸ���
				char c = string[i].charAt(j);
				int alpha = (int)c - 65; // �ƽ�Ű�ڵ��. A�� 65�̹Ƿ� -65 ���༭ 0���� �����ϰ�
				alphabet[alpha][0] += Math.pow(10, position-1);	
			}
		}
		
		// ���� ���� ������ ����
		Arrays.sort(alphabet, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[0]-o1[0];
			}
		});
		
		
		// �� ���
		int assignInt = 9;
		for(int i=0; i<10; i++) {
			result += alphabet[i][0] * assignInt;
			assignInt--;
		}
		
		System.out.println(result);
		
		
	}

}

// ����
// �� Ǯ�̴� ������ Ʋ���� Ǯ�� ����� ã�ƺ��� Ǯ����.
// �� ���ĺ��� ��ü �տ��� �󸶳� �ڸ��� �����ϴ��� �˾ƺ��� ���� Math.pow(10, �ڸ���-1)�� ���ߴ�.
// �� ���� ū ������� ū ���ڸ� �Ҵ������.
