package inputTest;

import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
//		3���� ������ �� ���� �Է¹��� �� ���� ���
//		nextInt() : �Է¹��� ����
		
//		3���� ���� ������ ���� ����, ����������
		int data1 = 0, data2 = 0, data3 = 0, result = 0; 
//		���� �޼��� �����
		String message = "3���� ������ �ѹ��� �Է¹����� ����", example = "ex) 1 3 5", format = "%d + %d + %d = %d";
//		scanner����
		Scanner sc = new Scanner(System.in);
//		���� �޼��� ���
		System.out.println(message);
		System.out.println(example);
//		������ nextint����
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		data3 = sc.nextInt();
//		result����
		result = data1 + data2 + data3;
//		���� ���
		System.out.printf(format,data1,data2,data3,result);
      
	}
}
