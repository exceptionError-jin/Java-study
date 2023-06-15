package classTest;

import java.util.Scanner;

//�õ� �ѱ�
//���� ���¸� Ȯ���ϰ�
//�õ��� �����ִٸ�, "�õ� ����" ���
//�̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���

//�õ� ����
//���� ���¸� Ȯ���ϰ�
//�õ��� �����ִٸ�, "�õ� ����" ���
//�̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���

//�õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
//3�� ���� �߸� �Է����� �� "���� �⵿" ���
//�� ���ڿ� �񱳴� equals()�� ���Ѵ�.
//"ABC".equals("���ڿ�");
class Car{
	boolean engine;
	String password;
	int errorCount;
	
	{
		this.password = "0000";
	}
	
	public Car() {;}
	
	
	
	void engineStart() {
			engine = true;
	}
	
	boolean engineStop() {
		if(engine) {
			engine = false;
			return true;
		}
		return false;
	}
	
	boolean checkPassword(String password) {
		return this.password.equals(password);
		
	}
}

public class Super {
	public static void main(String[] args) {
		Car jin = new Car();
		
		Scanner sc = new Scanner(System.in);
		
		String menu = "1.�õ��ѱ�\n2.�õ�����";
		int choice = 0;
		String password = null;
		boolean check = false;
		
		while (true) {
			System.out.println(menu);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(!jin.engine) {
					System.out.println("��й�ȣ : ");
					password = sc.next();
					
					if(jin.checkPassword(password)) {
						jin.engineStart();
						System.out.println("�õ�����");
						jin.errorCount = 0;
						break;
					}
					jin.errorCount++;
					System.out.println(jin.errorCount + "ȸ ����");
					
					if(jin.errorCount == 3) {
						System.out.println("����");
						check = true;
					}
					break;
				}
				System.out.println("�̹� ����");
				break;

			case 2:
				if(jin.engine) {
					jin.engineStop();
					System.out.println("�õ�����");
					check = true;
					break;
				}
				System.out.println("�̹� ����");
				break;
			}
			if(check) {break;}
		}
	}
}
