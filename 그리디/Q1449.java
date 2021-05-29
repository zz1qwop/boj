// ���� ��ũ : https://www.acmicpc.net/problem/1449

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1449 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int pipe[]  = new int[1000];
		int result = 0;
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int hole[] = new int[n];
		for(int i=0; i<n; i++) {
			hole[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(hole);
		
		// pipe �ʱ�ȭ
		for(int i=0; i<1000; i++) {
			pipe[i] = 0;
		}
		
		// hole ����
		for(int i=0; i<hole.length; i++) {
			if(pipe[hole[i]-1]==0) {
				result += 1;
			}else {
				continue;
			}
			for(int j=0; j<l; j++) {
				if((hole[i]-1+j)<1000) {
					pipe[hole[i]-1+j] = 1;
				}
			}
		}
		
		System.out.println(result);
		
	}

}

// ���� �ذ�
// ��ü ������ �迭�� �غ��ؼ� 0���� �д�. �������� ������ 1�� ������Ʈ.
// hole�� �պκк��� �湮. 0�Ͻ� �������� ���̸�ŭ ������ �迭�� 1�� ������Ʈ. 1�̸� ���� hole�� �н�.
