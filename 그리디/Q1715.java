// ���� ��ũ : https://www.acmicpc.net/problem/1715

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q1715 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long result = 0;
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=0; i<n; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		
		
		while(!queue.isEmpty()) {
			int a=0, b=0;
			if(queue.size()==1) {
				break;
			}else {
				a = queue.poll();
				b = queue.poll();
				
				if(!queue.isEmpty()) {
					queue.add(a+b);
				}
				
				result += a+b;
			}	
		}
		
		System.out.println(result);

	}

}

// ���� : ������ �� ���� ���� �񱳰� �ʿ� ���µ�, �� ���� ���� ���ع��ȴ�.
// �켱���� ť�� ������ �� �� ���� ���� �����ϵ��� �����ߴ�.