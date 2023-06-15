package copy;

public class CopyTest {
	public static void main(String[] args) {
		Address address = new Address("������", "�����", "���ѹα�");
		User original = new User("John", "John", address);
		User shallowCopy = new User(original.getFirstName(), original.getLastName(), original.getAddress());
		User deepCopy = new User(original);
		
//		shallowCopy.getAddress().setStreet("������");
		deepCopy.getAddress().setStreet("������");
		
		System.out.println(original.getAddress().getStreet());
		
	}
}
