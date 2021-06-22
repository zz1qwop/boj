// ���� ��ũ : https://www.acmicpc.net/problem/2828

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2828 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int j = Integer.parseInt(br.readLine());
		int array[] = new int[j];
		
		int mIndex[] = {1, m};
		int result = 0;
		
		for(int i=0; i<j; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<j; i++) {
			if(array[i]>=mIndex[0] && array[i]<=mIndex[1]) {
				continue;
			}
			
			if(array[i]<mIndex[0]) {
				int x = mIndex[0]-array[i];
				result += x;
				mIndex[0] -= x;
				mIndex[1] -= x;
			}else if(array[i]>mIndex[1]) {
				int x = array[i] - mIndex[1];
				result += x;
				mIndex[0] += x;
				mIndex[1] += x;
			}
		}
		
		System.out.println(result);
	}

}

// ���� �ذ�
// �ٱ����� ���� ���ʰ� ������ ��ġ�� �迭�� �����صд�.
// �������� ����� �ٱ����� ��ǥ�� ���ϴ��� Ȯ���Ѵ�.
// ������ �ʴ´ٸ� ���ʺ��� ������ �����ʺ��� ū�� Ȯ���Ͽ� ��ǥ ���̸�ŭ �ٱ��ϸ� �̵��Ѵ�.
// �ٱ��� ��ǥ�� �����ϰ� ��ǥ ���̸�ŭ result�� �����ش�.