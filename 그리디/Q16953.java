// ���� ��ũ : https://www.acmicpc.net/problem/16953

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q16953 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int a, b;
		int result = 0;
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer[]> list = new LinkedList<Integer[]>();
		list.add(new Integer[]{1,a*2,1}); // �� ���� ù��° node�� 1
		list.add(new Integer[]{1,a*10+1,0}); // �ƴϸ� 0
		
		Integer[] x;
		while(true) {
			x = list.remove(0);
			if(x[2]==0 && x[1]>b) {
				continue; // ���� ���� ��带 �߰��� �ʿ䰡 ����.
			}else if(x[1]>b){
				System.out.println(-1);
				break;
			}else if(x[1]==b) {
				System.out.println(x[0]+1);
				break;
			}else {
				if(x[2]==1) {
					list.add(new Integer[]{x[0]+1, x[1]*2, 1});
				}else {
					list.add(new Integer[]{x[0]+1, x[1]*2, 0});
				}
				list.add(new Integer[]{x[0]+1, x[1]*10+1, 0});
			}
			
			if(list.isEmpty()) {
				System.out.println(-1);
				break;
			}
		}
		

	}

}

// ���� �ذ�
// �ʺ� �켱 Ž�� ���. ���� ��忡�� x2 ��, ������ ��忡�� x10 +1�� �߰�.
// ���� �ش� ��尡 B���� ũ�ٸ� �ڽ� ��带 �߰����� �ʴ´�.
// �� ���� ù ��° ��尡 B���� ũ�ٸ� ����, ���� �����Ƿ� -1 ���.
// �� ���� [�� ��° ������, ��, �� ���� ù ��° ��� ����] �� ������ �ִ�.

// ����
// �ð� �ʰ��� �߻��Ͽ� ArrayList�� LinkedList�� �ٲپ����� �ذ�Ǿ���.
// �ش� ��Ȳ������ �������� �߰��� ������ ����ϹǷ�
// �ε����� �������� �ʴ� LinkedList�� ����Ͽ���.