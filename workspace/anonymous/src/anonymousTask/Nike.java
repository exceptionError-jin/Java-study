package anonymousTask;
//	�������� �޾ƾ� �� ��
public class Nike {
	public void register(Form form) {
		String[] menu = form.getMenu(); // ���� �ִ� �ٸ޴��� �޴��� ����
		
		for (int i = 0; i < menu.length; i++) {
//			�޴��� ���
			System.out.println(menu[i]);
		}
//			FormAdapter�� ��� ���� �����̶�� �� �˷��ֱ�
				if(form instanceof FormAdapter) {
					System.out.println("���� �����Դϴ�.");
					return;
				}
//				form�� ��� �������� ����ϱ�
				form.sell("�� ����");
	}
}
