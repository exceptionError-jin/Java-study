package anonymous;

public class Computer {
	public static void main(String[] args) {
		
		Game rpg = () -> {
			System.out.println("������");
			};
		
//		Game rpg = new Game() {
//			
//			@Override
//			public void play() {
//				System.out.println("������");
//				
//			}
//			
//			@Override
//			public void exit() {
//				System.out.println("������, ����");
//				
//			}
//		};
		
		rpg.play();
	}
}





















