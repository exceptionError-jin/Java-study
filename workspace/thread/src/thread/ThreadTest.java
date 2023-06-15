package thread;

public class ThreadTest {
	public static void main(String[] args) {
//		�Ʒ��� ���� ����
		Runnable mineral2 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		
		
		
		
//		�ڿ��� ����
//		�ڿ�
//		Runnable mineral = new Thread2();
		
//		������ 2�� -> �ڿ� ����
		Thread t1 = new Thread(mineral2, "!");
		Thread t2 = new Thread(mineral2, "2");
		
//		�����ٸ����� ��Ƽ������ ����
//		��ŸƮ�� �Ǹ� ������
		t1.start();
		
//		join�� ����� �����尡 ������ ���� ������ �����尡 ����
//		��, �̹� join���� start�� ������� ���� �� ����
//		���߰��ؼ� ���� ���Ҽ� ����
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		
//		������
		System.out.println("���� ������ ����");
		
		
		
		
		
		
		
		
		
//		������ 2��
//		Thread1 thread1 = new Thread1("��");
//		Thread1 thread2 = new Thread1("��");
		
//		��Ƽ ������
//		start() -> �����ٸ��� ����
//		�����ٸ� :  ���� �����带 ��Ƽ ������� ����
//		thread1.start(); 
//		thread2.start();
		
//		���� ������
//		thread1.run();
//		thread2.run();
	}
}
