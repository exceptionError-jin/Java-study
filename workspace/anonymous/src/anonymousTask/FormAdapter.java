package anonymousTask;
//	필수 아닌 항목 제거
public abstract class FormAdapter implements Form{
//	@Override
//	public String[] getMenu() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	메뉴는 필수로 받겠다는 뜻

	@Override
	public void sell(String order) {;}
//	주문은 선택적으로 받아서 주문을 안받을 수도 있다는 뜻

}
