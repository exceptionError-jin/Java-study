package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OneOrZero {
	public int solution(String s) {
		int result = 0;
//		arData��� array�迭 �����ؼ� 0���� ����
		ArrayList<String> arData = new ArrayList<String>(Arrays.asList(s.split("0")));
		
//		arData�� ���� ���̷� ������ �� list�� ����, �� �� �ݴ� �����Ͽ� arData[0]�� ���� �� ���� ���� �� �ְ� ����
//		�� �� �ٽ� list�� ����
		List<Integer> lengths = arData.stream().map(String::length).collect(Collectors.toList())
			.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
//		lengths�� ����� 0�̶�� 0 ���, �ƴϸ� lengths�� ���� �� �� ���
		result = lengths.size() == 0 ? 0 : lengths.get(0);
		
		return result;
	}
	
	public static void main(String[] args) {
		int result = new OneOrZero().solution("00000");
		System.out.println(result);
	}
}


















