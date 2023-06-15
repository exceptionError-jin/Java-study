package anonymousTask;

public class Building {
	public static void main(String[] args) {
//		���� ���� ����
		Nike ilsan = new Nike(); // �ϻ� ���� ���� => ����������� ����
		Nike gangnam = new Nike(); // ���� ���� ����
//		���� ����
		ilsan.register(new FormAdapter() {
//			¬ �ȴ� �ɷ��� ���� => �׷��� ���� ������
			@Override
			public String[] getMenu() {
				return new String[] {"¬ ����", "¬ ������", "¬ ��ı"};
			}
		});
		
//		���� ����
		gangnam.register(new Form() {
//			�ֹ�
			@Override
			public void sell(String order) {
				String[] menu = getMenu();
//				
				for (int i = 0; i < menu.length; i++) {
//					�ֹ��Ѱ� ������ �ֹ� ���� ���
					if(menu[i].equals(order)) {
						System.out.println(order + " �ֹ����� ��¥ �첨��??");
						return;
					}
					System.out.println("�� ���� �߸���");
				}
				
			}
//			�޴�
			@Override
			public String[] getMenu() {
				return new String[] {"�� ����", "�� ������", "�� ��ı"};
			}
		});
	}
}
