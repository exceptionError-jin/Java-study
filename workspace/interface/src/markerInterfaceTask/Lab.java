package markerInterfaceTask;

public class Lab extends Flower{
	public void lab(Flower flower) {
		if(flower instanceof CarnivoreMarker) {
			System.out.println("���� ��");
		}
		else if(flower instanceof HarnivoreMarker) {
			System.out.println("ä�� ��");
		}
		else {
			System.out.println("���");
		}
	}
	
	public static void main(String[] args) {
		
	}
}
