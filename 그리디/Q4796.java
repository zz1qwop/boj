// ���� ��ũ : https://www.acmicpc.net/problem/4796

import java.util.ArrayList;
import java.util.Scanner;

public class Q4796 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l=0, p=0, v=0;
		int count = 0, result = 0;
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subArray = new ArrayList<Integer>();
		
		while(true) {
			l = scanner.nextInt();
			p = scanner.nextInt();
			v = scanner.nextInt();
			
			if(l==0 && p==0 && v==0) break;
			subArray.add(l);
			subArray.add(p);
			subArray.add(v);
			array.add(subArray);
			subArray = new ArrayList<Integer>();
		}
		
		for(int i=0; i<array.size(); i++) {
			result = ( array.get(i).get(2) / array.get(i).get(1) ) * array.get(i).get(0);
			if((array.get(i).get(2) % array.get(i).get(1))>array.get(i).get(0))
				result += array.get(i).get(0);
			else
				result += array.get(i).get(2) % array.get(i).get(1);
			
			System.out.println("Case "+(++count)+": "+result);
			result = 0;	
		}
	}

}

// ���� �ذ�
// �����ϴ� P�� ��, L�ϸ� ���, V��¥�� �ް�. (1<L<P<V)
// V�� P�� ���� ���� x�̸�, x * L�� ��� �����ϴ�. �������� y��.
// y���� L���� ū ��� : +L�� ��� �����ϴ�.
// y���� L���� ���� ��� : +y�� ��� �����ϴ�.