package inputTest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//      �� ������ �Է��� �� ���� ��� ���
//      ��, next()�� ����Ѵ�.
		
//		������ ���� ���� 2�� ����, ����� ����
		int number1 = 0, number2 = 0, result = 0;
//		next()�� ��Ʈ������ ���������ϱ�
//		��Ʈ�� �� ����, �޼��� ��Ʈ�� ����
//		String data1 = null, data2 = null;
		String message = "�� ������ �Է��� �� ����", example = "ex) 1 3", format = "%d * %d = %d";
//		scanner����
		Scanner sc = new Scanner(System.in);
//		���� �޼��� ���
		System.out.println(message);
		System.out.println(example);
//		next() ����
		number1 = sc.nextInt();
		number2 = sc.nextInt();
//		data�� int�� ����
//		number1 = Integer.parseInt(data1);
//		number2 = Integer.parseInt(data2);
//		����� ����
		result = number1 * number2;
//		���� ���
		System.out.printf(format,number1,number2,result);
	}
}
