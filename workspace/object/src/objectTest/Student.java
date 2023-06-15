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

	@Override //tostring 재정의
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
	@Override //equals 재정의
	public boolean equals(Object obj) {
		if(this == obj) { // obj가 필드에서 사용한 값이랑 같으면 리턴 트루
			return true;
		}
		
		if(obj instanceof Student) { // obj가 학생이라면
			Student anoStudent = (Student) obj; // 다운캐스팅해서 anoStudent에 넣어줌
			if(this.number == anoStudent.number) { // 디스.숫자랑 anoStudent.숫자랑 같으면 리턴 트루
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





















