package bank;

public class KaKao extends Bank{
   @Override
   public int showBalance() {
      this.money /= 2;
      return super.showBalance();
   }
}