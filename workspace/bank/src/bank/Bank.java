package bank;

public class Bank {

//   예금주
//   계좌번호
//   핸드폰번호
//   비밀번호
//   통장
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
//   계좌번호 중복검사
//	checkAccount만들 때 필요한 것 : 은행, 만들 자리, 계좌
	public static final Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
//		bank값 뭔지 모르니깐 null
		Bank bank = null;
//		동일 계좌있는지 확인
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
				for (j = 0; j < arCount.length; j++) {
					if(arrBank[i][j].getAccount().equals(account)) {break;}
				}
			if(j != arCount[i]) {break;}
		}
		return bank;
	}

//   핸드폰번호 중복검사
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
   
//   로그인
   public static final Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
	   Bank user = checkAccount(arrBank, arCount, account);
	   if(user != null) {
		   if(user.password.equals(password)) {return user;}
	   }
	   return null;
   }
   
//   *일반
//   입금
   public void deposit(int money) {
      this.money += money;
   }
   
//   출금
   public void withdraw(int money) {
      this.money -= money;
   }
   
//   잔액조회
   public int showBalance() {
      return money;
   }
   
}
































