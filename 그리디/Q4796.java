// 문제 링크 : https://www.acmicpc.net/problem/4796

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

// 문제 해결
// 연속하는 P일 중, L일만 사용, V일짜리 휴가. (1<L<P<V)
// V를 P로 나눈 값이 x이면, x * L번 사용 가능하다. 나머지는 y일.
// y일이 L보다 큰 경우 : +L번 사용 가능하다.
// y일이 L보다 작은 경우 : +y번 사용 가능하다.