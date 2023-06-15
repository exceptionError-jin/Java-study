package bank;

public class BankTest {
//  ������
//  ���¹�ȣ
//  �ڵ�����ȣ
//  ��й�ȣ
//  ����
	String name;
	String accountNumber;
	String phoneNumber;
	String password;
	int money;
	
	public BankTest() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
	
	
	
	
//	���¹�ȣ �ߺ�����
//	�ʿ��� �� : ����, �ڽ�, ����
	public static final Bank accoutCheck(Bank[][] arrbank, int[] user, String account) {
//		� ���� ������ ��
		Bank bank = null;
//		����, ����� ���°� �´��� Ȯ��
		for (int i = 0; i < arrbank.length; i++) {
			int j = 0;
			for (j = 0; j < user.length; j++) {
				if(arrbank[i][j].getAccount().equals(account)) {break;} // ���� ������ ���߰� ����
				}
			if(j != user[i]) {break;} // ������ �ٸ��� ����
			}
		return bank;
		}
	
//	�ڵ��� ��ȣ �ߺ�����
	public static final Bank phoneNumberCheck(Bank[][] arrbank, int[] user, String phoneNumber) {
//	� ���� ������ ��	
		Bank bank = null;
//		����, ����� ��ȣ�� �´��� Ȯ��
		for (int i = 0; i < arrbank.length; i++) {
			int j = 0;
			for (j = 0; j < user.length; j++) {
				if(arrbank[i][j].getPhoneNumber().equals(phoneNumber)) {break;}
			}
			if(j != user[i]) {break;}
		}
		return bank;
	}

	
//  �α���
//	�α��ο� �ʿ��� �� : ����, �ڽ�, ����, ��й�ȣ
	public static final Bank login(Bank[][] arrbank, int[] user, String account, String password) {
//		accoutCheck ����
		Bank userJin = accoutCheck(arrbank, user, account);
//		���¹�ȣ �ߺ������� �����ߴٸ� ��й�ȣȮ�� �� ������ ���������� ����
		if(userJin != null) {
			if(userJin.getPassword().equals(password)) {return userJin;}
		}// �ƴ϶�� ��������
		return null;
	}

	
//	�Ա�
	public void deposit(int money) {
		this.money += money;
	}
//	���
	public void withdraw(int money) {
		this.money -= money;
	}
	
//	�ܾ���ȸ
	public int showMoney() {
		return money;
	}
	
}
