// ���� ��ũ : https://www.acmicpc.net/problem/2810

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2810 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String string = br.readLine();
		ArrayList<Character[]> cup = new ArrayList<Character[]>();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			if(i==0) {
				Character[] c = {'*', 'O'};
				cup.add(c);
			}
			
			if(string.charAt(i)=='S') {
				Character[] s = {'S', 'X'};
				Character[] c = {'*', 'O'};
				cup.add(s);
				cup.add(c);
			}else if(string.charAt(i)=='L') {
				Character[] l = {'L', 'X'};
				Character[] l2 = {'L', 'X'};
				Character[] c = {'*', 'O'};
				cup.add(l);
				cup.add(l2);
				cup.add(c);
				i += 1;
			}
		}
		
		for(int i=0; i<cup.size(); i++) {
			if(cup.get(i)[0]=='*') {
				continue;
			}
			
			if(i-1>=0) {
				if(cup.get(i-1)[1]=='O') {
					result += 1;
					cup.get(i-1)[1] = 'X';
					continue;
				}
			}
			if(i+1<cup.size()) {
				if(cup.get(i+1)[1]=='O') {
					result += 1;
					cup.get(i+1)[1] = 'X';
				}
			}
		}
		
		System.out.println(result);

	}

}

// ���� �ذ�
// ��Ȧ���� ��ġ�� ������ �迭�� ���� ��������. ó�� ���� ����(index==0) *�� ���� �����ߴ�.
// �� �¼��� �ְ� �� ���Ŀ� *�� ������ �־��µ�, Ŀ�ü��� ��� �� ���� ���� ���� *�� �����ߴ�.
// �� �迭 ��Ҹ��� ��Ȧ���� ���� �� �ִ��� ���θ� O, X�� ����ص״�.
