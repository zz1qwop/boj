// 문제 링크 : https://www.acmicpc.net/problem/1700

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1700 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = 0;
		
		LinkedList<Integer> multi = new LinkedList<Integer>();
		
		LinkedList<Integer> array = new LinkedList<Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<k; i++) {
			array.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0; i<k; i++) {
			if(multi.contains(array.get(0))) {
				array.poll();
				continue;
			}
			
			if(multi.size()<n) {
				multi.add(array.poll());
				continue;
			}
			
			int lastIndex = 0;
			int multiIndex = 0;
			for(int j=0; j<n; j++) {
				int index = array.indexOf(multi.get(j));
				if(index==-1) {
					multiIndex = j;
					break;
				}
				if(lastIndex<=index) {
					lastIndex = index;
					multiIndex = j;
				}
			}
			
			multi.remove(multiIndex);
			multi.add(multiIndex, array.poll());
			result += 1;
			
		}
		
		System.out.println(result);

	}

}

// 문제 해결
// 전기용품 배열 : 사용해야 되는 전기용품들을 저장. 사용 시 해당 요소 삭제.
// 멀티탭 배열 : 꽂혀있는 전기용품의 번호가 저장되어있다.
// 1. 해당 전기용품이 멀티탭에 꽂혀 있는지 확인한다. 멀티탭 배열에 포함 시 continue
// 2. 멀티탭 구멍이 남아 있으면 멀티탭 배열에 해당 전기용품 번호를 저장하고, 전기용품 요소는 삭제한다.
// 3. 전기용품이 멀티탭에 꽂혀 있지 않고 멀티탭이 꽉 차 있을 때
// 3-1. 멀티탭에 꽂혀 있는 전기용품들이 전기용품 배열에 몇 번째의 인덱스를 가지고 있는지 조사한다.
// 3-2. 앞으로 사용할 전기용품 배열에 해당 요소가 존재하지 않거나, 가장 인덱스가 큰 (늦게 사용할) 전기용품을 고른다.
