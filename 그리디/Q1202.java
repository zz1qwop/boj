// ���� ��ũ : https://www.acmicpc.net/problem/1202

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1202 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		PriorityQueue<int[]> jewel = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}else {
					return o2[1]-o1[1];
				}
			}	
		});
		PriorityQueue<int[]> jewelQ = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o2[1]-o1[1];
				}else {
					return o1[0]-o2[0];
				}
			}	
		});

		int bag[] = new int[k];
		long result = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());

			int[] j = new int[2];
			j[0] = Integer.parseInt(st.nextToken());
			j[1] = Integer.parseInt(st.nextToken());
			jewelQ.add(j);
		}
		
		for(int i=0; i<k; i++) {
			bag[i] = Integer.parseInt(br.readLine());
		}
		

		// ���� ����. ���� �ͺ���
		Arrays.sort(bag);
		
		for(int i=0; i<k; i++) {
			for(int j=0; j<n; j++) {
				
			}
		}
		
		for(int i=0; i<k; i++) {
			for(int j=0; j<jewelQ.size(); j++) {
				if(bag[i]<jewelQ.peek()[0]) {
					break;
				}else {
					jewel.add(jewelQ.poll());
				}
			}
			
			if(!jewel.isEmpty()) {
				result += jewel.poll()[1];
			}
		}
		
		System.out.println(result);
		
	}

}

// �ð��ʰ�
// �ذ� -> ���� ���溸�� �۰ų� ���� ������ �켱 ���� ť�� �߰�. ���� ���� ���� ������.
// ���� �������� for���� ����, �۰ų� ���� ������ �� �߰��ϴ� ���.
// ���� ���� ��ϵ� ������ ������������ �صд�.