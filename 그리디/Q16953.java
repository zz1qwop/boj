// 문제 링크 : https://www.acmicpc.net/problem/16953

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q16953 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int a, b;
		int result = 0;
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer[]> list = new LinkedList<Integer[]>();
		list.add(new Integer[]{1,a*2,1}); // 각 줄의 첫번째 node면 1
		list.add(new Integer[]{1,a*10+1,0}); // 아니면 0
		
		Integer[] x;
		while(true) {
			x = list.remove(0);
			if(x[2]==0 && x[1]>b) {
				continue; // 굳이 다음 노드를 추가할 필요가 없음.
			}else if(x[1]>b){
				System.out.println(-1);
				break;
			}else if(x[1]==b) {
				System.out.println(x[0]+1);
				break;
			}else {
				if(x[2]==1) {
					list.add(new Integer[]{x[0]+1, x[1]*2, 1});
				}else {
					list.add(new Integer[]{x[0]+1, x[1]*2, 0});
				}
				list.add(new Integer[]{x[0]+1, x[1]*10+1, 0});
			}
			
			if(list.isEmpty()) {
				System.out.println(-1);
				break;
			}
		}
		

	}

}

// 문제 해결
// 너비 우선 탐색 방식. 왼쪽 노드에는 x2 값, 오른쪽 노드에는 x10 +1값 추가.
// 만약 해당 노드가 B보다 크다면 자식 노드를 추가하지 않는다.
// 각 줄의 첫 번째 노드가 B보다 크다면 종료, 값이 없으므로 -1 출력.
// 각 노드는 [몇 번째 줄인지, 값, 각 줄의 첫 번째 노드 여부] 를 가지고 있다.

// 오답
// 시간 초과가 발생하여 ArrayList를 LinkedList로 바꾸었더니 해결되었다.
// 해당 상황에서는 데이터의 추가와 삭제가 빈번하므로
// 인덱스가 움직이지 않는 LinkedList를 사용하였다.