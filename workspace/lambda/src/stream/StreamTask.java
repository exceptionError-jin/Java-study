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
	//  10~1���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		StreamTask streamTask = new StreamTask();
//		IntStream.range(0, 10).map(streamTask::change).forEach(datas::add);
//		IntStream.range(0, 10).map(data -> 10 - data).forEach(datas::add);
//		System.out.println(datas);
		
		
	//  1~10���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
	
		
	//  ABCDEF�� �� ���ں��� ���
//		String data = "ABCDEF";
//		data.chars().forEach(c -> System.out.println((char)c));
		
		
	//  1~100���� �� Ȧ���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(data -> data % 2 != 0).forEach(datas::add);
//		System.out.println(datas);
		
		
	//  1~100���� �� ¦���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(data -> data % 2 == 0).forEach(datas::add);
//		System.out.println(datas);
		
		
	//  A~F���� �� D�����ϰ� ArrayList�� ��� ���
		ArrayList<Character> datas = new ArrayList<Character>();
		IntStream.range('A', 'F').map(n -> n > 67 ? n + 1 : n).forEach(n -> datas.add((char)n));
		System.out.println(datas);
		
		
	//  5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase() ���
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
		
	//  Apple, banana, Melon �� ù ��° ���ڰ� �빮���� ���ڿ� ���
//		charat�� ù��° ���� ���� -> ù��° ���� �빮������ Ȯ�� -> �빮���̸� ���
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		System.out.println(datas.stream().filter(data -> data.charAt(0) >= 'A').filter(data -> data.charAt(0) <= 'Z').collect(Collectors.joining(", ")));
//		datas.stream().filter(data -> data.charAt(0) >= 'A').filter(data -> data.charAt(0) <= 'Z').forEach(System.out::println));
		
		
	//  �ѱ��� ������ ����
//		String hangul = "�����̻�����ĥ�ȱ�";
//		String input = "�ϰ��̻�";
//		input.chars().map(hangul::indexOf).forEach(System.out::println);
		
	//  ������ �ѱ۷� ����
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String input = "1024";
//      input.chars().map(StreamTask::changeToInteger).forEach(i -> System.out.print(hangle.charAt(i)));

		
		
		
	}
}
