package randomClass;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
//		nextInt(3) = 0,1,2�߿��� �������� ���
		for (int i = 0; i < 100; i++) {
			System.out.println(random.nextInt(3));
		}
	}
}
