// 문제 링크 : https://www.acmicpc.net/problem/1541

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1541 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		int result = 0;
		
		String array[] = string.split("-");
		
		for(int i=0; i<array.length; i++) {
			int plusSum = 0;
			if(array[i].contains("+")) {
				String array2[] = array[i].split("\\+");
				plusSum = sum(array2);
			}
			
			if(i==0) {
				if(plusSum==0) {
					result += Integer.parseInt(array[i]);
				}else {
					result += plusSum;
				}
			}else {
				if(plusSum==0) {
					result -= Integer.parseInt(array[i]);
				}else {
					result -= plusSum;
				}
			}
			
		}
		
		System.out.println(result);

	}
	
	public static int sum(String array[]) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += Integer.parseInt(array[i]);
		}
		return sum;
	}

}

// 메모 : 메타 문자는 split에 그대로 사용하면 에러가 발생한다.
// "\\+" 방식으로 사용해야 한다.
// 문제 해결
// - 로 문자열을 쪼갠다.
// - 뒤에 오는 숫자들이 +로 연결되어 있으면 한꺼번에 더해서 빼는 방식. 빼는 숫자를 최대한 크게 만든다.