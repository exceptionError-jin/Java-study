package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력 받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기
		
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5]; //정수 배열 5개
		String temp = null; //입력값
		
		for(int i=0;;) {
			System.out.print(i + 1 + "번째 정수[q: 나가기]: ");
			temp = sc.next();// 정수 입력
			if(temp.toLowerCase().equals("q")) {break;}// 입력값이 q이면 나감
			
			try {
				arData[i] = Integer.parseInt(temp);//문자열 입력값을 정수로 변환 후 배열에 넣음
				i++;//오류 발생시 i가 안더해지도록 뒤에 붙임
			} catch (NumberFormatException e) {// 숫자오류
				System.out.println("정수만 입력해주세요.");
				
			} catch (ArrayIndexOutOfBoundsException e) {// 배열갯수오류
				System.out.println("5개의 정수만 입력이 가능합니다.");
				
				for (int j = 0; j < arData.length; j++) {//배열갯수만큼 출력하기 한뒤 나감
					System.out.print(arData[j] + " ");
				}
				
				break;
				
			} catch (Exception e) {// 모든 오류
				System.out.println("다시 시도해주세요.");
			}
		}
	}
}













