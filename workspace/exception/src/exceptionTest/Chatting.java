package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		
//		System.out.println("��                   ��".replaceAll(" ", ""));
//		System.out.println("    ��    ��    ".trim().replaceAll(" ", ""));
		
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("�޼���: ");
		// �Է°����ٰ� ����, ���ڱ�ȯ ��밡��
		message = sc.nextLine().trim().replaceAll(" ", "");
		
		if(message.equals("��Ӿ�")) { //�޼����� ��Ӿ��
			try {
				throw new BadWordException("��Ӿ� ����"); //��Ӿ� ����
			} catch (BadWordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.print("*");//�޼����� *�� ��ȯ�ؼ� ������
				}
				System.out.println("");
				System.out.println(e); //���� ����
			}
		}
		
		
//		if(message.equals("�ٺ�")) {
////			���� �߻�
//			try {
//				throw new BadWordException("��Ӿ�� ����� �� �����ϴ�");
//			} catch (BadWordException e) {
//				for (int i = 0; i < message.length(); i++) {
//					System.out.print("*");
//				} 
//				System.out.println("");
//				System.out.println(e);
//			}
//		}
	}
}


















