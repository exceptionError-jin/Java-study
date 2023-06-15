package anonymousTask;
//	본점에서 받아야 할 것
public class Nike {
	public void register(Form form) {
		String[] menu = form.getMenu(); // 폼에 있는 겟메뉴를 메뉴에 넣음
		
		for (int i = 0; i < menu.length; i++) {
//			메뉴판 출력
			System.out.println(menu[i]);
		}
//			FormAdapter인 경우 무료 매장이라는 것 알려주기
				if(form instanceof FormAdapter) {
					System.out.println("무료 매장입니다.");
					return;
				}
//				form인 경우 에어포스 출력하기
				form.sell("찐 조던");
	}
}
