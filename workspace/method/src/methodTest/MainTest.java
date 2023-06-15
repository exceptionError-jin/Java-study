package methodTest;

public class MainTest {
//	실행 프로그램을 만들어주는 메소드
//	args는 매개변수이다 값없음
	public static void main(String[] args) {
		if(args.length != 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} else {
			System.out.println("NONE");
		}
	}
}
