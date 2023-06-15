package lamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class TimerDeskLamp extends DeskLamp implements Runnable{

    final static int DELAY_MILLISECOND = 5000;

    private Thread offDelayThread; // ���� ���� ���� ������
    private Thread previousThread; // �������� ���� ������
    
//    TimerDeskLamp Ŭ������ ������ �ڵ带 ������ �ּ���.
    public void offDelay() {
    	if(previousThread != null) {
    		previousThread.interrupt();
    	}
    	
    	offDelayThread = new Thread(this);
    	offDelayThread.start();
    	previousThread = offDelayThread;
    }
    
    @Override
    public void run() {
    	while(true) {
    		try {
				Thread.sleep(DELAY_MILLISECOND);
				turnOff();
				previousThread = null;
				break;
			} catch (InterruptedException e) {
				System.out.println("Ÿ�̸� ����");
				break;
			}
    	}
    }
}

















