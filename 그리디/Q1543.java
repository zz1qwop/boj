// 문제 링크 : https://www.acmicpc.net/problem/1543

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

// 문제 해결
// 문서에서 단어의 인덱스를 조사한다. 단어가 포함되어 있다면, 단어 이후의 문장들에서 단어의 인덱스를 조사.
// 해당 작업을 반복한다.
