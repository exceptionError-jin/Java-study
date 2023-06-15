package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OneOrZero {
	public int solution(String s) {
		int result = 0;
//		arData라는 array배열 생생해서 0으로 끊음
		ArrayList<String> arData = new ArrayList<String>(Arrays.asList(s.split("0")));
		
//		arData의 값을 길이로 변경한 뒤 list로 변경, 그 후 반대 정렬하여 arData[0]에 가장 긴 값을 넣을 수 있게 만듦
//		그 후 다시 list로 변경
		List<Integer> lengths = arData.stream().map(String::length).collect(Collectors.toList())
			.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
//		lengths의 사이즈가 0이라면 0 출력, 아니면 lengths의 가장 긴 값 출력
		result = lengths.size() == 0 ? 0 : lengths.get(0);
		
		return result;
	}
	
	public static void main(String[] args) {
		int result = new OneOrZero().solution("00000");
		System.out.println(result);
	}
}


















