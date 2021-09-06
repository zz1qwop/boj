// 문제 링크 : https://www.acmicpc.net/problem/9576

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q9576 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		int result[] = new int[t];
		
		for(int i=0; i<t; i++) {
			result[i] = 0;
			st = new StringTokenizer(br.readLine());
			int bookCount = Integer.parseInt(st.nextToken());
			int studentCount = Integer.parseInt(st.nextToken());
			int range[][] = new int[studentCount][2];
			int selected[] = new int[bookCount]; // 책이 선택되었는지 여부. 
			
			for(int j=0; j<bookCount; j++) {
				selected[j] = 0;
			}
			for(int j=0; j<studentCount; j++) {
				st = new StringTokenizer(br.readLine());
				range[j][0] = Integer.parseInt(st.nextToken());
				range[j][1] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(range, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[1]==o2[1]) {
						return o1[0]-o2[0];
					}else {
						return o1[1]-o2[1];
					}
				}
				
			});
			
			for(int j=0; j<studentCount; j++) {
				for(int index=range[j][0]-1; index<=range[j][1]-1; index++) {
					if(selected[index]==0) {
						selected[index]=1;
						result[i]++;
						break;
					}
				}
			}
		
	}
		
		for(int i=0; i<t; i++) {
			System.out.println(result[i]);
		}
	
	

}
}

// 문제 해결 : 배열을 정렬만 하면 되는 문제였다. 해결법을 찾지 못해 많이 헤맸음.
