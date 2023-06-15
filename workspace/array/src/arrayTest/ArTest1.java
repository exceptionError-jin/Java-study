package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTest1 {
	public static void main(String[] args) {
//		int[] arData = {2, 4, 5, 6, 8};
//		
//		System.out.println(arData);
//		System.out.println(arData.length);
//		
//		System.out.println("=============================");
//		
//		for(int i=0; i<arData.length; i++) {
//			System.out.println(arData[i]);
//		}
//		
//		System.out.println("=============================");
//		
////		5, 4, 3, 2, 1을 각 방에 넣고 출력
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 5 - i;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
//		System.out.println("=============================");
		
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		정수입력 배열 생성
//		메세지 작성
//		max, min 정의
//		scanner작성
//		메세지 출력
//		nextint정의
//		for입력값 작성
//		max,min arData정의
//		for(max,min값 정의)
//		최대 최소값 정의
		int[] arData = new int[5];
		String message = "정수를 입력하시오";
		int max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		for (int i = 0; i < arData.length; i++) {
			System.out.print(i + 1 +"번째 값 : ");
			arData[i] = sc.nextInt();
		}
		
		max = arData[0];
		min = arData[0];
		
		for (int i = 1; i < arData.length; i++) {
			if(max < arData[i]) {max = arData[i];}
			if(min > arData[i]) {min = arData[i];}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}

















