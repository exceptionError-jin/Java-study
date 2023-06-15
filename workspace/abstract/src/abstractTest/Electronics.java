package abstractTest;

public abstract class Electronics{
	public void on() {} //알아서 해
	public abstract void off(); //무조건 재정의
	public void printProduct() {} // 알아서 해라
	public final void sos() {System.out.println("119 연락");} // 절대 재정의하지마라
}
