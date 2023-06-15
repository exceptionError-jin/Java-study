package anonymousTask;

public class Building {
	public static void main(String[] args) {
//		매장 지점 정의
		Nike ilsan = new Nike(); // 일산 지점 만듦 => 무료매장으로 지정
		Nike gangnam = new Nike(); // 강남 지점 만듦
//		무료 매장
		ilsan.register(new FormAdapter() {
//			짭 팔다 걸려서 망함 => 그래서 무료 나눔함
			@Override
			public String[] getMenu() {
				return new String[] {"짭 조던", "짭 보르도", "짭 스캇"};
			}
		});
		
//		강남 매장
		gangnam.register(new Form() {
//			주문
			@Override
			public void sell(String order) {
				String[] menu = getMenu();
//				
				for (int i = 0; i < menu.length; i++) {
//					주문한게 맞으면 주문 내역 출력
					if(menu[i].equals(order)) {
						System.out.println(order + " 주문했음 진짜 살꺼야??");
						return;
					}
					System.out.println("너 뭔가 잘못함");
				}
				
			}
//			메뉴
			@Override
			public String[] getMenu() {
				return new String[] {"찐 조던", "찐 보르도", "찐 스캇"};
			}
		});
	}
}
