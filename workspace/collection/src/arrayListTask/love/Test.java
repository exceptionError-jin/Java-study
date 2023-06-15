package arrayListTask.love;

import arrayListTask.DBConnecter;

public class Test {
	public static void main(String[] args) {
		DateApp dateApp = new DateApp();
		Love love1 = new Love();
		love1.setAge(22);
		love1.setName("영희");
		love1.setNumber(1);

		Love love2 = new Love();
		love2.setAge(20);
		love2.setName("순자");
		love2.setNumber(2);
		
		Love love3 = new Love();
		love3.setAge(20);
		love3.setName("미자");
		love3.setNumber(3);
		
		dateApp.insert(love1);
		dateApp.insert(love2);
		dateApp.insert(love3);
		
		System.out.println(DBConnecter.loves);
		
		System.out.println(dateApp.sortByAge());
		System.out.println(DBConnecter.loves);
	}
}

















