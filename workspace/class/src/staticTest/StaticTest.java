package staticTest;

class Data {
	int data = 10; //�ν��Ͻ� ����(��ü)
//	��� ��ü�� �����ؾ� �� �� static �ʵ带 �����Ѵ�.
	static int data_s = 10; //Ŭ���� ����
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data();
		
		Data.data_s = 20;
		System.out.println(Data.data_s);
		
		data1.data = 20;
		System.out.println(data2.data);
		
		data2.increase();
		data1.increase_s();
		
//		Data data = new Data();
//		
//		System.out.println(data.data);
//		System.out.println(Data.data_s);
		

//		data.increase_s();
//		
//		data = new Data();
//		
//		data.increase_s();
		
//		data.increase();

//		
//		data = new Data();
//		
		
	}
}














