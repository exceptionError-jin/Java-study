package arrayListTask.food;

import arrayListTask.DBConnecter;

public class Test {
	public static void main(String[] args) {
		Food[] foods = {new Food(), new Food(), new Food()};
		Restaurant restaurant = new Restaurant();
		
		foods[0].setName("�����");
		foods[0].setKind("�߽�");
		foods[0].setPrice(8000);
//
//		foods[1].setName("û���ѱ��ø�");
//		foods[1].setKind("�ѽ�");
//		foods[1].setPrice(7000);
//		
//		foods[2].setName("��������");
//		foods[2].setKind("�ѽ�");
//		foods[2].setPrice(9000);
//		
//		for (Food food : foods) {
//			restaurant.insert(food);
//		}
//		System.out.println(restaurant.findByKind("�ѽ�"));
		
		Food food = new Food();
//		Restaurant restaurant = new Restaurant();
//
		food.setName("���");
		food.setPrice(5000);
		food.setKind("���");
//		
		restaurant.insert(food);
//		
//		
		food = restaurant.select("���");
		
		food.setKind("�Ͻ�");
//		food.setPrice((int)(food.getPrice() * 1.1));
//		
		restaurant.update(food);
//		
		System.out.println(DBConnecter.foods);
	}
}





















