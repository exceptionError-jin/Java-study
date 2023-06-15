package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("½Ãµ¿ ÄÑÁü");
	}
	
	void engineStop() {
		System.out.println("½Ãµ¿ ²¨Áü");
	}
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("½´ÆÛÄ« ¿£Áø");
	}
	
	@Override
	void engineStop() {
		super.engineStop();
		System.out.println("½´ÆÛÄ« ¿£Áø!!!!!!");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar jin = new SuperCar("toyota","white",1900,"superCar");
		System.out.println(jin.brand);
		
		jin.engineStart();
		jin.engineStop();
	}
}

















