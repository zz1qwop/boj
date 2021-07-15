// ���� ��ũ : https://www.acmicpc.net/problem/13417

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q13417 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine());
		char[][] array = new char[t][];
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			array[i] = new char[n];
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<n; j++) {
				array[i][j] = (st.nextToken()).charAt(0);
			}
		}
		
		for(int i=0; i<t; i++) {
			LinkedList<Character> string = new LinkedList<Character>();
			string.add(array[i][0]);
			
			for(int j=1; j<array[i].length; j++) {
				int a = (int)(string.get(0));
				int b = (int)(array[i][j]);
				if(a>=b) {
					string.add(0, array[i][j]);
				}else {
					string.add(array[i][j]);
				}
			}
			
			String result = "";
			for(int j=0; j<string.size(); j++) {
				result = result + string.get(j);
			}
			System.out.println(result);
		}

	}

}

// ���� �ذ�
// ������ �ƽ�Ű �ڵ带 ���Ͽ� ���� ������ �����.
// ���� ù��° ������ �ƽ�Ű �ڵ�� ���� ������ ������ �ƽ�Ű �ڵ带 ���Ѵ�.
// ù��° ������ �ƽ�Ű �ڵ尡 ũ�ų� ���� ���, ���� ������ ���ڸ� ���� ���ʿ� ���´�. �� �ܴ� �����ʿ� ���´�.
