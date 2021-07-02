// 문제 링크 : https://www.acmicpc.net/problem/13413

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q13413 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		ArrayList<char[][]> array = new ArrayList<char[][]>();
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			char[][] c = new char[2][n];
			
			String string = br.readLine();
			for(int j=0; j<n; j++) {
				c[0][j] = string.charAt(j);
			}
			
			String string2 = br.readLine();
			for(int j=0; j<n; j++) {
				c[1][j] = string2.charAt(j);
			}
			
			array.add(c);
		}
		
		for(int i=0; i<t; i++) {
			int wToB = 0;
			int bToW = 0;
			for(int j=0; j<array.get(i)[0].length; j++) {
				char one = array.get(i)[0][j];
				char two = array.get(i)[1][j];
				
				
				
				if(one=='W' && two=='B') {
					wToB += 1;
				}else if(one=='B' && two=='W') {
					bToW += 1;
				}
			}
			
			if(wToB > bToW) {
				System.out.println(wToB);
			}else {
				System.out.println(bToW);
			}
		}

	}

}

// 문제 해결
// W->B가 x, B->W가 y라고 했을 때. 만약 x < y 라면, x번 교환과 (y-x)번 뒤집기를 하면 된다.
// = x + (y-x)번이므로 y번.
// x == y라면 마찬가지로 y번.(x번)