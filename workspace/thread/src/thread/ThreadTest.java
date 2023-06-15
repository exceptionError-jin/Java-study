package thread;

public class ThreadTest {
	public static void main(String[] args) {
//		아래랑 같은 거임
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
		
		
		
		
		
//		자원의 공유
//		자원
//		Runnable mineral = new Thread2();
		
//		쓰레드 2개 -> 자원 공유
		Thread t1 = new Thread(mineral2, "!");
		Thread t2 = new Thread(mineral2, "2");
		
//		스케줄링으로 멀티쓰레드 변경
//		스타트가 되면 못멈춤
		t1.start();
		
//		join을 사용한 쓰레드가 끝나고 나서 나머지 쓰레드가 실행
//		단, 이미 join전에 start된 쓰레드는 멈출 수 없다
//		멈추게해서 순서 정할수 있음
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		
//		쓰레드
		System.out.println("메인 쓰레드 종료");
		
		
		
		
		
		
		
		
		
//		쓰레드 2개
//		Thread1 thread1 = new Thread1("★");
//		Thread1 thread2 = new Thread1("●");
		
//		멀티 쓰레드
//		start() -> 스케줄링을 해줌
//		스케줄링 :  단일 쓰레드를 멀티 쓰레드로 변경
//		thread1.start(); 
//		thread2.start();
		
//		단일 쓰레드
//		thread1.run();
//		thread2.run();
	}
}
