// ���� ��ũ : https://www.acmicpc.net/problem/11047

import java.util.Scanner;

public class Q11047 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, k, result=0;
		n = scanner.nextInt();
		k = scanner.nextInt();
		
		int array[] = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = scanner.nextInt();
		}
		
		for(int i=array.length-1; i>=0; i--) {
			result += k / array[i];
			k = k % array[i];
		}
		
		System.out.println(result);
	}

}

<<<<<<< HEAD
=======

>>>>>>> a1fd5ce6d5db51dd568f382219710b156ff9f526
// ���� �ذ�
// 1. ���� ������ ���� N�� ���� �� K�� �Է¹޴´�.
// 2. ���� ���� �迭�� �������� K���� ������ ���� result�� �����Ѵ�.