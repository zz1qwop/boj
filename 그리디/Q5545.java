// ���� ��ũ : https://www.acmicpc.net/problem/5545

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q5545 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // ���� ��
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // ���� ����
		int b = Integer.parseInt(st.nextToken()); // ���� ����
		
		int c = Integer.parseInt(br.readLine()); // ���� ����
		Integer array[] = new Integer[n]; // ���� ����
		
		int price = a;
		int cal = c;
		int result = cal/price; // 1�� �� ����
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			int newResult = (cal+array[i])/(price+b);
			if(newResult>=result) {
				result = newResult;
				price = price+b;
				cal = cal+array[i];
			}else {
				break;
			}
		}
		
		System.out.println(result);
		
		
	}

}

// ���� �ذ�
// ������ ������ ���� ������� �����Ѵ�.
// ���ʴ�� Ž���ϸ�, �ش� ������ �־��� �� 1�� �� ������ �پ��ٸ� ���� �ʰ� �����Ѵ�.
