// ���� ��ũ : https://www.acmicpc.net/problem/1439

import java.util.ArrayList;
import java.util.Scanner;

public class Q1439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		ArrayList<Character> array = new ArrayList<Character>();
		int zero=0, one=0, result=0;
		char type, origin;
		boolean exit = false;
		
		for(int i=0; i<num.length(); i++) {
			array.add(num.charAt(i));
		}
		
		// ���� ���� ����
		for(int i=0; i<array.size(); i++) { // 0 ���� ����
			if(array.get(i)!='0') continue;
			if(i==array.size()-1) {
				zero++;
				break;
			}
			if(array.get(i+1)!='0') {
				zero++;
			}
		}
		for(int i=0; i<array.size(); i++) { // 1 ���� ����
			if(array.get(i)!='1') continue;
			if(i==array.size()-1) {
				one++;
				break;
			}
			if(array.get(i+1)!='1') {
				one++;
			}
		}
		
		if(one<=zero) {
			type = '1';
			origin = '0';
		}
		else {
			type = '0';
			origin = '1';
		}
		
		while(true) {
			if(!array.contains(type)) break;
			
			for(int i=0; i<array.size(); i++) {
				if(array.get(i)!=type) {
					continue;
				}else {
					array.set(i, origin);
				}

				if(i==array.size()-1) {
					result++;
					break;
				}
				if(array.get(i+1)==origin) {
					result++;
					break;
				}
			}
		}
		
		System.out.println(result);
	}

}

// ���� �ذ�
// 1. ���ڸ� �Է¹޴´�
// 2. 0�� 1�� ������ ���� ����. ���ӵ� ������ ���� ���� �����´�.
// 3. �տ������� �����´�. type ���ڰ� ���� ������ �ݺ�.
