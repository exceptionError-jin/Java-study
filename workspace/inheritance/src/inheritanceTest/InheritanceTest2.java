package inheritanceTest;

class Human{
	String name;
	
//	�⺻ �����ڴ� ���� �����Ѵ�.
	public Human() {;}
	
	public Human(String name) {
		super();
		this.name = name;
	}

	void eat() {
		System.out.println("�Ա�");
	}
	
	void sleep() {
		System.out.println("�ڱ�");
	}
	
	void walk() {
		System.out.println("�� �߷� �ȱ�");
	}
}

class Monkey extends Human{
	@Override
	void eat() {
		super.eat();
		System.out.println("Ǫ��������");
	}
	
	@Override
	void sleep() {
		super.sleep();
		System.out.println("8�ð� ����");
	}
	
	@Override
	void walk() {
		super.walk();
		System.out.println("�μ����� �ȱ�");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Human jin = new Human();
		Monkey kingkong = new Monkey();
		kingkong.walk();
		jin.walk();
	}
}


















