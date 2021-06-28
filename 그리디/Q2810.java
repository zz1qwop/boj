// 문제 링크 : https://www.acmicpc.net/problem/2810

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

// 문제 해결
// 컵홀더의 위치를 포함한 배열을 새로 만들어줬다. 처음 넣을 때는(index==0) *을 먼저 삽입했다.
// 각 좌석을 넣고 그 이후에 *을 삽입해 주었는데, 커플석의 경우 두 개를 넣은 다음 *을 삽입했다.
// 각 배열 요소마다 컵홀더를 놓을 수 있는지 여부를 O, X로 기록해뒀다.
