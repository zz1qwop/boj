// ���� ��ũ : https://www.acmicpc.net/problem/17224

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q17224 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int array[][] = new int[n][2];
		
		int result = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			
			if(array[i][1]<=l) { // ����� ���� Ǯ �� ������ ���� ������ 0���� �ּ� ���� ���� �ǰ�.
				array[i][0] = 0;
			}
		}
		
		Arrays.sort(array, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}
			
		});
		
		for(int i=0; i<k; i++) {
			if(array[i][0]==0) {
				result += 140; // ����� ����
			}else if(array[i][0]<=l) {
				result += 100;
			}else if(array[i][0]>l) {
				break;
			}
		}
		
		System.out.println(result);
		
	}

}

// ���� �ذ�
// ���� ������ ����� ������ �Է¹��� ��, ����� ������ Ǯ �� �ִٸ� ���� ���� �ڸ��� 0�� �ִ´�.
// ���� �迭�� ���� ���� �������� -> ����� ���� ������������ �����Ѵ�.
// �׷��� 0�� ���� ��ҵ��� ���� ���� �´�.
// �迭�� �տ������� Ž���Ѵ�. k�� ��ŭ Ǯ �� �����Ƿ� k�� ����.
// ���� ������ 0�̸� ����� ������ �ذ� ������ ����̹Ƿ� 140���� �ִ´�.