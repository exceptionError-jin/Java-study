package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է� �ޱ�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5]; //���� �迭 5��
		String temp = null; //�Է°�
		
		for(int i=0;;) {
			System.out.print(i + 1 + "��° ����[q: ������]: ");
			temp = sc.next();// ���� �Է�
			if(temp.toLowerCase().equals("q")) {break;}// �Է°��� q�̸� ����
			
			try {
				arData[i] = Integer.parseInt(temp);//���ڿ� �Է°��� ������ ��ȯ �� �迭�� ����
				i++;//���� �߻��� i�� �ȴ��������� �ڿ� ����
			} catch (NumberFormatException e) {// ���ڿ���
				System.out.println("������ �Է����ּ���.");
				
			} catch (ArrayIndexOutOfBoundsException e) {// �迭��������
				System.out.println("5���� ������ �Է��� �����մϴ�.");
				
				for (int j = 0; j < arData.length; j++) {//�迭������ŭ ����ϱ� �ѵ� ����
					System.out.print(arData[j] + " ");
				}
				
				break;
				
			} catch (Exception e) {// ��� ����
				System.out.println("�ٽ� �õ����ּ���.");
			}
		}
	}
}













