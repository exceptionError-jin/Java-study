package objectTest;

public class StringTest {
	public static void main(String[] args) {
		String data1 = "ABC"; // 주소에 포커싱
		String data2 = "ABC";
		String data3 = new String("ABC"); // 필드에 포커싱
		String data4 = new String("ABC");
		
		System.out.println(data1 == data2); // 필드의 주소값 비교
//		.intern()은 직접 상수에 들어가서 주소값을 가져오는 역할을 함
		System.out.println(data3.intern() == data4.intern());
		
		System.out.println(data1.equals(data2));
		System.out.println(data3.equals(data4));
	}
}
