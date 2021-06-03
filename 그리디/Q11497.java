// ���� ��ũ : https://www.acmicpc.net/problem/11497

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11497 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int array[] = new int[t];
		int[][] tree = new int[t][]; // ���� �迭
		StringTokenizer st = null;
		int result[] = new int[t]; // ���� �迭
		
		for(int i=0; i<t; i++) {
			array[i] = Integer.parseInt(br.readLine());
			tree[i] = new int[array[i]];
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<array[i]; j++) {
				tree[i][j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(tree[i]);
			result[i] = calculateLevel(tree[i]);
		}
		
		
		for(int i=0; i<t; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int calculateLevel(int array[]) {
		int len = array.length;
		int newArray[] = new int[len];
		int max = 0;
		
		int a=0, b=len-1;
		for(int i=0; i<len; i++) {
			if(i%2==0) {
				newArray[a] = array[i];
				a += 1;
			}else {
				newArray[b] = array[i];
				b -= 1;
			}
		}
		
		max = Math.abs(newArray[0]-newArray[len-1]);
		for(int i=0; i<len-1; i++) {
			if(Math.abs(newArray[i]-newArray[i+1])>max) {
				max = Math.abs(newArray[i]-newArray[i+1]);
			}
		}
		
		return max;
	}

}

// ���� �ذ�
// 1. �볪���� ������������ �����ߴ�.
// 2. 1�� �볪���� �迭�� �� ��, 2�� �볪���� �迭�� �� ��, 3���� ��, 4���� ��...
//    ���ο� ������ �볪���� ����.
// 3. ���ο� �迭���� ���� ���� ���Ѵ�.
