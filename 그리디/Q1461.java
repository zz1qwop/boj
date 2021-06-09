// ���� ��ũ : https://www.acmicpc.net/problem/1461

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1461 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int max = 0;
		int result = 0;
		
		int array[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(Math.abs(array[i]) > max) max = Math.abs(array[i]);
		}
		
		Arrays.sort(array);
		
		// ������ ��
		for(int i=0; i<n; i = i+m) {
			if(array[i]>0) break;
			
			if(Math.abs(array[i])==max) {
				result += Math.abs(array[i]);
			}else {
				result += Math.abs(array[i]) * 2;
			}
		}
		
		// ����� ��
		for(int i=n-1; i>=0; i = i-m) {
			if(array[i]<0) break;
			
			if(Math.abs(array[i])==max) {
				result += Math.abs(array[i]);
			}else {
				result += Math.abs(array[i]) * 2;
			}
		}
		
		System.out.println(result);

	}

}

// ���� �ذ�
// å���� ��ǥ�� �����Ѵ�. ���� �� ��ġ�� �ִ� å�� �������� ������ ���Ƿ� ���� �Ÿ��� ���Ѵ�.
// m���� ���� �����Ѵ�.
// ���� ��ǥ�� ���� ���� ��� ��ǥ�� ���� ��츦 ����� �����ߴ�.