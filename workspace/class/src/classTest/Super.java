package classTest;

import java.util.Scanner;

//시동 켜기
//엔진 상태를 확인하고
//시동이 꺼져있다면, "시동 켜짐" 출력
//이미 시동이 켜져있다면, "시동이 이미 켜져있습니다." 출력

//시동 끄기
//엔진 상태를 확인하고
//시동이 켜져있다면, "시동 꺼짐" 출력
//이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다." 출력

//시동을 켜기 위해서 비밀번호 4자리를 입력받아야 한다.
//3번 연속 잘못 입력했을 시 "경찰 출동" 출력
//※ 문자열 비교는 equals()로 비교한다.
//"ABC".equals("문자열");
class Car{
	boolean engine;
	String password;
	int errorCount;
	
	{
		this.password = "0000";
	}
	
	public Car() {;}
	
	
	
	void engineStart() {
			engine = true;
	}
	
	boolean engineStop() {
		if(engine) {
			engine = false;
			return true;
		}
		return false;
	}
	
	boolean checkPassword(String password) {
		return this.password.equals(password);
		
	}
}

public class Super {
	public static void main(String[] args) {
		Car jin = new Car();
		
		Scanner sc = new Scanner(System.in);
		
		String menu = "1.시동켜기\n2.시동끄기";
		int choice = 0;
		String password = null;
		boolean check = false;
		
		while (true) {
			System.out.println(menu);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(!jin.engine) {
					System.out.println("비밀번호 : ");
					password = sc.next();
					
					if(jin.checkPassword(password)) {
						jin.engineStart();
						System.out.println("시동켜짐");
						jin.errorCount = 0;
						break;
					}
					jin.errorCount++;
					System.out.println(jin.errorCount + "회 오류");
					
					if(jin.errorCount == 3) {
						System.out.println("경찰");
						check = true;
					}
					break;
				}
				System.out.println("이미 켜짐");
				break;

			case 2:
				if(jin.engine) {
					jin.engineStop();
					System.out.println("시동꺼짐");
					check = true;
					break;
				}
				System.out.println("이미 꺼짐");
				break;
			}
			if(check) {break;}
		}
	}
}
