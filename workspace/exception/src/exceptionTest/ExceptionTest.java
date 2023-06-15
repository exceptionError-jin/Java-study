package exceptionTest;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
//		int[] arData = new int[5];
//		
//		try {
//			arData[5] = 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); // 현재 시점에서 연계된 모든 코드부분의 라인 번호가 출력된다.
//			System.out.println(e.getMessage());
//			System.out.println("칸을 넘어갔습니다.");
//		}
		
//		try {
//			System.out.println(10 / 0);
//		} catch (NumberFormatException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
////		} catch (Exception e) {
////			System.out.println("알 수 없는 오류");
//		} finally {
//			System.out.println("반드시 실행되어야 하는 문장");
//		}
		
		
		
//		5개의 정수만 입력 받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기
		
		int[] arData = new int[5]; //5개 정수 배열 생성
		String number = null; //입력받을 값
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; ;) {
			System.out.print(i + 1 + "번째 정수[q: 나가기]: ");
			
			number = sc.next(); // 입력값 작성
			
			if(number.equals("q")) {break;} //입력값이 q라면 나감
			
			try {
				arData[i] = Integer.parseInt(number); //입력받은 값을 정수로 변환 후 배열에 담아줌
				i++;
			} catch (NumberFormatException e) { //숫자가 아니라면
				System.out.println("정수를 입력해주세요");
			} catch (ArrayIndexOutOfBoundsException e) { //숫자가 5개가 아니라면
				System.out.println("값은 5개까지만 입력 가능합니다.");
				for (int j = 0; j < arData.length; j++) {
					System.out.println(" " + arData[i]);
				}
				break;
			} catch (Exception e) { //다른 오류라면
				System.out.println("오류남");
			}
		}
		
		
	}
}













