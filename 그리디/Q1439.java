// 문제 링크 : https://www.acmicpc.net/problem/1439

import java.util.ArrayList;
import java.util.Scanner;

public class Q1439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		ArrayList<Character> array = new ArrayList<Character>();
		int zero=0, one=0;
		
		for(int i=0; i<num.length(); i++) {
			array.add(num.charAt(i));
		}
		
		// 구역 개수 세기
		for(int i=0; i<array.size(); i++) { // 0 구역 세기
			if(array.get(i)!='0') continue;
			if(i==array.size()-1) {
				zero++;
				break;
			}
			if(array.get(i+1)!='0') {
				zero++;
			}
		}
		for(int i=0; i<array.size(); i++) { // 1 구역 세기
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
			System.out.println(one);
		}
		else {
			System.out.println(zero);
		}

	}

}

// 문제 해결
// 1. 숫자를 입력받는다
// 2. 0과 1의 연속된 구역 수를 센다.
// 3. 적은 연속된 구역 수가 정답.