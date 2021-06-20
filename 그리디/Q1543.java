// ���� ��ũ : https://www.acmicpc.net/problem/1543

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1543 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		String word = br.readLine();
		int result = 0;
		
		while(true) {
			int index = string.indexOf(word);
			if(index == -1) {
				break;
			}
			string = string.substring(index+word.length());
			result += 1;
		}
		
		System.out.println(result);
	}

}

// ���� �ذ�
// �������� �ܾ��� �ε����� �����Ѵ�. �ܾ ���ԵǾ� �ִٸ�, �ܾ� ������ ����鿡�� �ܾ��� �ε����� ����.
// �ش� �۾��� �ݺ��Ѵ�.
