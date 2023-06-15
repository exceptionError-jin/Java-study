package inputTest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//      두 정수를 입력한 뒤 곱셈 결과 출력
//      단, next()만 사용한다.
		
//		정수를 담을 변수 2개 생성, 결과값 생성
		int number1 = 0, number2 = 0, result = 0;
//		next()는 스트링에서 쓸수있으니깐
//		스트링 값 생성, 메세지 스트링 생성
//		String data1 = null, data2 = null;
		String message = "두 정수를 입력한 뒤 곱셈", example = "ex) 1 3", format = "%d * %d = %d";
//		scanner생성
		Scanner sc = new Scanner(System.in);
//		문제 메세지 출력
		System.out.println(message);
		System.out.println(example);
//		next() 정의
		number1 = sc.nextInt();
		number2 = sc.nextInt();
//		data값 int로 변경
//		number1 = Integer.parseInt(data1);
//		number2 = Integer.parseInt(data2);
//		결과값 정의
		result = number1 * number2;
//		문제 출력
		System.out.printf(format,number1,number2,result);
	}
}
