package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		
//		System.out.println("안                   녕".replaceAll(" ", ""));
//		System.out.println("    안    녕    ".trim().replaceAll(" ", ""));
		
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("메세지: ");
		// 입력값에다가 공백, 문자교환 사용가능
		message = sc.nextLine().trim().replaceAll(" ", "");
		
		if(message.equals("비속어")) { //메세지가 비속어면
			try {
				throw new BadWordException("비속어 금지"); //비속어 금지
			} catch (BadWordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.print("*");//메세지를 *로 변환해서 보여줌
				}
				System.out.println("");
				System.out.println(e); //정지 이유
			}
		}
		
		
//		if(message.equals("바보")) {
////			예외 발생
//			try {
//				throw new BadWordException("비속어는 사용할 수 없습니다");
//			} catch (BadWordException e) {
//				for (int i = 0; i < message.length(); i++) {
//					System.out.print("*");
//				} 
//				System.out.println("");
//				System.out.println(e);
//			}
//		}
	}
}


















