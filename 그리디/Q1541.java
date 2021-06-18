// ���� ��ũ : https://www.acmicpc.net/problem/1541

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

// �޸� : ��Ÿ ���ڴ� split�� �״�� ����ϸ� ������ �߻��Ѵ�.
// "\\+" ������� ����ؾ� �Ѵ�.
// ���� �ذ�
// - �� ���ڿ��� �ɰ���.
// - �ڿ� ���� ���ڵ��� +�� ����Ǿ� ������ �Ѳ����� ���ؼ� ���� ���. ���� ���ڸ� �ִ��� ũ�� �����.