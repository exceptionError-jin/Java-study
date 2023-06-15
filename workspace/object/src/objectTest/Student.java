package objectTest;

public class Student {
	private int number;
	private String name;
	
	public Student() {;}

	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override //tostring ������
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
	@Override //equals ������
	public boolean equals(Object obj) {
		if(this == obj) { // obj�� �ʵ忡�� ����� ���̶� ������ ���� Ʈ��
			return true;
		}
		
		if(obj instanceof Student) { // obj�� �л��̶��
			Student anoStudent = (Student) obj; // �ٿ�ĳ�����ؼ� anoStudent�� �־���
			if(this.number == anoStudent.number) { // ��.���ڶ� anoStudent.���ڶ� ������ ���� Ʈ��
				return true;
			}
		}
		return false;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		
//		if(obj instanceof Student) {
//			Student anotherStudent = (Student) obj;
//			if(this.number == anotherStudent.number) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
}





















