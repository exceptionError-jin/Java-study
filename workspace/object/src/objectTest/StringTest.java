package objectTest;

public class StringTest {
	public static void main(String[] args) {
		String data1 = "ABC"; // �ּҿ� ��Ŀ��
		String data2 = "ABC";
		String data3 = new String("ABC"); // �ʵ忡 ��Ŀ��
		String data4 = new String("ABC");
		
		System.out.println(data1 == data2); // �ʵ��� �ּҰ� ��
//		.intern()�� ���� ����� ���� �ּҰ��� �������� ������ ��
		System.out.println(data3.intern() == data4.intern());
		
		System.out.println(data1.equals(data2));
		System.out.println(data3.equals(data4));
	}
}
