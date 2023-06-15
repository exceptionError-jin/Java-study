package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTask {
	public int change(int number) {
		return 10 - number;
	}
	
	public static int changeToInteger(int c) {
	      return c - 48;
	   }
	
	public static void main(String[] args) {
	//  10~1까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		StreamTask streamTask = new StreamTask();
//		IntStream.range(0, 10).map(streamTask::change).forEach(datas::add);
//		IntStream.range(0, 10).map(data -> 10 - data).forEach(datas::add);
//		System.out.println(datas);
		
		
	//  1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
	
		
	//  ABCDEF를 각 문자별로 출력
//		String data = "ABCDEF";
//		data.chars().forEach(c -> System.out.println((char)c));
		
		
	//  1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(data -> data % 2 != 0).forEach(datas::add);
//		System.out.println(datas);
		
		
	//  1~100까지 중 짝수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(data -> data % 2 == 0).forEach(datas::add);
//		System.out.println(datas);
		
		
	//  A~F까지 중 D제외하고 ArrayList에 담고 출력
		ArrayList<Character> datas = new ArrayList<Character>();
		IntStream.range('A', 'F').map(n -> n > 67 ? n + 1 : n).forEach(n -> datas.add((char)n));
		System.out.println(datas);
		
		
	//  5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase() 사용
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
		
	//  Apple, banana, Melon 중 첫 번째 문자가 대문자인 문자열 출력
//		charat로 첫번째 값들 선택 -> 첫번째 값이 대문자인지 확인 -> 대문자이면 출력
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		System.out.println(datas.stream().filter(data -> data.charAt(0) >= 'A').filter(data -> data.charAt(0) <= 'Z').collect(Collectors.joining(", ")));
//		datas.stream().filter(data -> data.charAt(0) >= 'A').filter(data -> data.charAt(0) <= 'Z').forEach(System.out::println));
		
		
	//  한글을 정수로 변경
//		String hangul = "공일이삼사오육칠팔구";
//		String input = "일공이사";
//		input.chars().map(hangul::indexOf).forEach(System.out::println);
		
	//  정수를 한글로 변경
//      String hangle = "공일이삼사오육칠팔구";
//      String input = "1024";
//      input.chars().map(StreamTask::changeToInteger).forEach(i -> System.out.print(hangle.charAt(i)));

		
		
		
	}
}
