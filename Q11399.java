import java.util.Scanner;

public class Q11399 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int arrayP[] = new int[number];
		int temp;
		int result = 0;
		
		for(int i=0; i<number; i++) {
			arrayP[i] = scanner.nextInt();
		}
		
		
		for(int i=0; i<number; i++) {
			for(int j=0; j<number-i-1; j++) {
				if(arrayP[j]>arrayP[j+1]) {
					temp = arrayP[j];
					arrayP[j] = arrayP[j+1];
					arrayP[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<number; i++) {
			int result2 = 0 ;
			for(int j=0; j<=i; j++) {
				result2 += arrayP[j];
			}
			result += result2;
		}
		
		System.out.println(result);

	}

}


// 문제 해결
// 1. 사람의 수와 시간을 입력 받는다.
// 2. 배열 p를 오름차순으로 정렬한다.
// 3. 배열의 각 원소마다, 합을 구해 더해준다.