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
////		5, 4, 3, 2, 1�� �� �濡 �ְ� ���
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 5 - i;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
//		System.out.println("=============================");
		
//		5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//		�����Է� �迭 ����
//		�޼��� �ۼ�
//		max, min ����
//		scanner�ۼ�
//		�޼��� ���
//		nextint����
//		for�Է°� �ۼ�
//		max,min arData����
//		for(max,min�� ����)
//		�ִ� �ּҰ� ����
		int[] arData = new int[5];
		String message = "������ �Է��Ͻÿ�";
		int max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		for (int i = 0; i < arData.length; i++) {
			System.out.print(i + 1 +"��° �� : ");
			arData[i] = sc.nextInt();
		}
		
		max = arData[0];
		min = arData[0];
		
		for (int i = 1; i < arData.length; i++) {
			if(max < arData[i]) {max = arData[i];}
			if(min > arData[i]) {min = arData[i];}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
}

















