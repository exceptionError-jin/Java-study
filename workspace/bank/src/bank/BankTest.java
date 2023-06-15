package bank;

public class BankTest {
//  예금주
//  계좌번호
//  핸드폰번호
//  비밀번호
//  통장
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
	
	
	
	
//	계좌번호 중복방지
//	필요한 것 : 은행, 자신, 계좌
	public static final Bank accoutCheck(Bank[][] arrbank, int[] user, String account) {
//		어떤 은행 만들지 모름
		Bank bank = null;
//		은행, 사람의 계좌가 맞는지 확인
		for (int i = 0; i < arrbank.length; i++) {
			int j = 0;
			for (j = 0; j < user.length; j++) {
				if(arrbank[i][j].getAccount().equals(account)) {break;} // 계좌 맞으면 멈추고 리턴
				}
			if(j != user[i]) {break;} // 유저가 다르면 나감
			}
		return bank;
		}
	
//	핸드폰 번호 중복방지
	public static final Bank phoneNumberCheck(Bank[][] arrbank, int[] user, String phoneNumber) {
//	어떤 은행 만들지 모름	
		Bank bank = null;
//		은행, 사람의 번호가 맞는지 확인
		for (int i = 0; i < arrbank.length; i++) {
			int j = 0;
			for (j = 0; j < user.length; j++) {
				if(arrbank[i][j].getPhoneNumber().equals(phoneNumber)) {break;}
			}
			if(j != user[i]) {break;}
		}
		return bank;
	}

	
//  로그인
//	로그인에 필요한 것 : 은행, 자신, 계좌, 비밀번호
	public static final Bank login(Bank[][] arrbank, int[] user, String account, String password) {
//		accoutCheck 정의
		Bank userJin = accoutCheck(arrbank, user, account);
//		계좌번호 중복방지에 성공했다면 비밀번호확인 후 맞으면 유저진으로 리턴
		if(userJin != null) {
			if(userJin.getPassword().equals(password)) {return userJin;}
		}// 아니라면 참조안함
		return null;
	}

	
//	입금
	public void deposit(int money) {
		this.money += money;
	}
//	출금
	public void withdraw(int money) {
		this.money -= money;
	}
	
//	잔액조회
	public int showMoney() {
		return money;
	}
	
}
