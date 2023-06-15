package inputTest;

import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 출력
//		nextInt() : 입력받은 변수
		
//		3개의 정수 저장할 변수 생성, 결과값만들기
		int data1 = 0, data2 = 0, data3 = 0, result = 0; 
//		문제 메세지 만들기
		String message = "3개의 정수를 한번에 입력받은후 덧셈", example = "ex) 1 3 5", format = "%d + %d + %d = %d";
//		scanner생성
		Scanner sc = new Scanner(System.in);
//		문제 메세지 출력
		System.out.println(message);
		System.out.println(example);
//		정수들 nextint정의
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		data3 = sc.nextInt();
//		result정의
		result = data1 + data2 + data3;
//		문제 출력
		System.out.printf(format,data1,data2,data3,result);
      
	}
}
