package exceptionTest;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
//		int[] arData = new int[5];
//		
//		try {
//			arData[5] = 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); // ���� �������� ����� ��� �ڵ�κ��� ���� ��ȣ�� ��µȴ�.
//			System.out.println(e.getMessage());
//			System.out.println("ĭ�� �Ѿ���ϴ�.");
//		}
		
//		try {
//			System.out.println(10 / 0);
//		} catch (NumberFormatException e) {
//			System.out.println("0���� ���� �� �����ϴ�.");
////		} catch (Exception e) {
////			System.out.println("�� �� ���� ����");
//		} finally {
//			System.out.println("�ݵ�� ����Ǿ�� �ϴ� ����");
//		}
		
		
		
//		5���� ������ �Է� �ޱ�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�
		
		int[] arData = new int[5]; //5�� ���� �迭 ����
		String number = null; //�Է¹��� ��
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; ;) {
			System.out.print(i + 1 + "��° ����[q: ������]: ");
			
			number = sc.next(); // �Է°� �ۼ�
			
			if(number.equals("q")) {break;} //�Է°��� q��� ����
			
			try {
				arData[i] = Integer.parseInt(number); //�Է¹��� ���� ������ ��ȯ �� �迭�� �����
				i++;
			} catch (NumberFormatException e) { //���ڰ� �ƴ϶��
				System.out.println("������ �Է����ּ���");
			} catch (ArrayIndexOutOfBoundsException e) { //���ڰ� 5���� �ƴ϶��
				System.out.println("���� 5�������� �Է� �����մϴ�.");
				for (int j = 0; j < arData.length; j++) {
					System.out.println(" " + arData[i]);
				}
				break;
			} catch (Exception e) { //�ٸ� �������
				System.out.println("������");
			}
		}
		
		
	}
}













