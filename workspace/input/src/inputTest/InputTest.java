package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		�ʱⰪ : ���� � ���� ������ �� �� �ִ� ��
//		���� : ''
//		���ڿ� : null
		
		
		String name = null;
		
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.println(name + "��");
		
	}
}


