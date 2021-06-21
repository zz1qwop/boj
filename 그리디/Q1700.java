// ���� ��ũ : https://www.acmicpc.net/problem/1700

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1700 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = 0;
		
		LinkedList<Integer> multi = new LinkedList<Integer>();
		
		LinkedList<Integer> array = new LinkedList<Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<k; i++) {
			array.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0; i<k; i++) {
			if(multi.contains(array.get(0))) {
				array.poll();
				continue;
			}
			
			if(multi.size()<n) {
				multi.add(array.poll());
				continue;
			}
			
			int lastIndex = 0;
			int multiIndex = 0;
			for(int j=0; j<n; j++) {
				int index = array.indexOf(multi.get(j));
				if(index==-1) {
					multiIndex = j;
					break;
				}
				if(lastIndex<=index) {
					lastIndex = index;
					multiIndex = j;
				}
			}
			
			multi.remove(multiIndex);
			multi.add(multiIndex, array.poll());
			result += 1;
			
		}
		
		System.out.println(result);

	}

}

// ���� �ذ�
// �����ǰ �迭 : ����ؾ� �Ǵ� �����ǰ���� ����. ��� �� �ش� ��� ����.
// ��Ƽ�� �迭 : �����ִ� �����ǰ�� ��ȣ�� ����Ǿ��ִ�.
// 1. �ش� �����ǰ�� ��Ƽ�ǿ� ���� �ִ��� Ȯ���Ѵ�. ��Ƽ�� �迭�� ���� �� continue
// 2. ��Ƽ�� ������ ���� ������ ��Ƽ�� �迭�� �ش� �����ǰ ��ȣ�� �����ϰ�, �����ǰ ��Ҵ� �����Ѵ�.
// 3. �����ǰ�� ��Ƽ�ǿ� ���� ���� �ʰ� ��Ƽ���� �� �� ���� ��
// 3-1. ��Ƽ�ǿ� ���� �ִ� �����ǰ���� �����ǰ �迭�� �� ��°�� �ε����� ������ �ִ��� �����Ѵ�.
// 3-2. ������ ����� �����ǰ �迭�� �ش� ��Ұ� �������� �ʰų�, ���� �ε����� ū (�ʰ� �����) �����ǰ�� ����.
