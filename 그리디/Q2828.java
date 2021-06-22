// 문제 링크 : https://www.acmicpc.net/problem/2828

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2828 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int j = Integer.parseInt(br.readLine());
		int array[] = new int[j];
		
		int mIndex[] = {1, m};
		int result = 0;
		
		for(int i=0; i<j; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<j; i++) {
			if(array[i]>=mIndex[0] && array[i]<=mIndex[1]) {
				continue;
			}
			
			if(array[i]<mIndex[0]) {
				int x = mIndex[0]-array[i];
				result += x;
				mIndex[0] -= x;
				mIndex[1] -= x;
			}else if(array[i]>mIndex[1]) {
				int x = array[i] - mIndex[1];
				result += x;
				mIndex[0] += x;
				mIndex[1] += x;
			}
		}
		
		System.out.println(result);
	}

}

// 문제 해결
// 바구니의 제일 왼쪽과 오른쪽 위치를 배열에 저장해둔다.
// 떨어지는 사과가 바구니의 좌표에 속하는지 확인한다.
// 속하지 않는다면 왼쪽보다 작은지 오른쪽보다 큰지 확인하여 좌표 차이만큼 바구니를 이동한다.
// 바구니 좌표를 변경하고 좌표 차이만큼 result에 더해준다.