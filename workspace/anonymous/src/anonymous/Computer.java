package anonymous;

public class Computer {
	public static void main(String[] args) {
		
		Game rpg = () -> {
			System.out.println("재정의");
			};
		
//		Game rpg = new Game() {
//			
//			@Override
//			public void play() {
//				System.out.println("재정의");
//				
//			}
//			
//			@Override
//			public void exit() {
//				System.out.println("재정의, 종료");
//				
//			}
//		};
		
		rpg.play();
	}
}





















