// ���� ��ũ : https://www.acmicpc.net/problem/14469

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q14469 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		int[][] array = new int[n][2];
		int result = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array, new Comparator<int[]>() {

			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			if(result<array[i][0])
				result = array[i][0];
			
			result += array[i][1];
		}
		
		System.out.println(result);
		
	}

}

// ���� �ذ�
// ���� ���� ������� �����Ѵ�.
// ���ݱ��� �ɸ� �ð��� result�� �����صд�.
// result���� �� �ð��� ������ �� �ð�  + �ɸ��� �ð��� result�� ����.
// result���� ���� ���� ��� result���� ��ٷȴٰ� �˻縦 �޾ƾ� �ϹǷ� result + �ɸ��� �ð�.
