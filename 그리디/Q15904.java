// 문제 링크 : https://www.acmicpc.net/problem/15904

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15904 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char array[] = {'U','C','P','C'};
		int index = 0;

		String string = br.readLine();
		
		for(int i=0; i<string.length(); i++) {
			char c = string.charAt(i);
			if(array[index] == c) {
				index++;
			}
			if(index == 4) {
				break;
			}
		}
		
		if(index == 4) {
			System.out.println("I love UCPC");
		}else {
			System.out.println("I hate UCPC");
		}
	}

}
