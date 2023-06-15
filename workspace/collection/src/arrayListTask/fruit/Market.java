package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Market {
	ArrayList<Fruit> fruits = DBConnecter.furits;
	
//	- ���� �˻�
	public Fruit checkFruit(String foodName) {
		for (Fruit fruitInDB : fruits) {
			if(fruitInDB.getName().equals(foodName)) {
				return fruitInDB;
			}
		}
		return null;
	}
	
//	- ���� �߰�
	public void add(Fruit fruit) {
		fruits.add(fruit);
	}
	
//	- ���� ����
	public void remove(String foodName) {
		Fruit fruit = checkFruit(foodName);
		fruits.remove(fruit);
	}
//	- ���� ������ ��� ���ݺ��� ���� �� �˻�
//	��� ���ϱ�
	public double getAverage() {
		int total = 0;
		
		for (Fruit fruitInDB : fruits) {
			total += fruitInDB.getPrice();
		}
		
		return (double)total / fruits.size();
	}
	
//	1. ȭ�鿡�� ���� �Է�
	public boolean checkPrice(int price) {
		return getAverage() > price;
	}
	
//	2. DB���� ��ü ��ȸ
	public ArrayList<Fruit> findByPriceLessThanAverage() {
		ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
		
		for (Fruit fruitInDB : fruits) {
			if(fruitInDB.getPrice() < getAverage()) {
				arFruit.add(fruitInDB);
			}
		}
		
		return arFruit;
	}
	
	
//	- ���� ��ü ��ȸ
	public ArrayList<Fruit> findAll() {
		ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
		
		for (Fruit fruitInDB : fruits) {
			arFruit.add(fruitInDB);
		}
		
		return arFruit;
	}
	
//	- ���� �̸����� ���� ��ȸ
	public int findByName(String fruitName) {
		return checkFruit(fruitName).getPrice();
	}
}








