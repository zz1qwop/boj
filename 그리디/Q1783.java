// ���� ��ũ : https://www.acmicpc.net/problem/1783

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1783 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int result = 0;
		
		if(n==1 || m==1) {
			result = 1;
		}else if(n==2) {
			if(m>7) m=7;
			result = ((m-1)/2)+1;
		}else if(m<=4) {
			result = m;
		}else if(m<=6){
			result = 4;
		}else {
			result = (m-6) + 4;
		}

		System.out.println(result);

	}

}

// ���� �ذ�
// �ܼ��ϰ� ���� �� �ִ� ���̽����� ����� Ǯ����.
// n�� 2���� ũ�� m�� 6���� Ŭ ���� ���� ������� �ذ� �����ϱ淡 �� ������ ��츦 �����ϰ� ��������.