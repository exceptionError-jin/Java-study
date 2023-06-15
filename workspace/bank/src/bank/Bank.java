package bank;

public class Bank {

//   ������
//   ���¹�ȣ
//   �ڵ�����ȣ
//   ��й�ȣ
//   ����
	private String name;
	private String account;
	private String phoneNumber;
	private String password;
	protected int money;
   
   public Bank() {;}
   


public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getAccount() {
	return account;
}



public void setAccount(String account) {
	this.account = account;
}



public String getPhoneNumber() {
	return phoneNumber;
}



public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public int getMoney() {
	return money;
}



public void setMoney(int money) {
	this.money = money;
}



	//   *static
//   ���¹�ȣ �ߺ��˻�
//	checkAccount���� �� �ʿ��� �� : ����, ���� �ڸ�, ����
	public static final Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
//		bank�� ���� �𸣴ϱ� null
		Bank bank = null;
//		���� �����ִ��� Ȯ��
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
				for (j = 0; j < arCount.length; j++) {
					if(arrBank[i][j].getAccount().equals(account)) {break;}
				}
			if(j != arCount[i]) {break;}
		}
		return bank;
	}

//   �ڵ�����ȣ �ߺ��˻�
   public static final Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
	   Bank bank = null;
	   
	   for (int i = 0; i < arrBank.length; i++) {
		int j = 0;
			for (j = 0; j < arCount.length; j++) {
				if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) {break;}
			}
			if(j != arCount[i]) {break;}
	}
	   return bank;
   }
   
//   �α���
   public static final Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
	   Bank user = checkAccount(arrBank, arCount, account);
	   if(user != null) {
		   if(user.password.equals(password)) {return user;}
	   }
	   return null;
   }
   
//   *�Ϲ�
//   �Ա�
   public void deposit(int money) {
      this.money += money;
   }
   
//   ���
   public void withdraw(int money) {
      this.money -= money;
   }
   
//   �ܾ���ȸ
   public int showBalance() {
      return money;
   }
   
}
































