package markerInterfaceTask;

public class Lab extends Flower{
	public void lab(Flower flower) {
		if(flower instanceof CarnivoreMarker) {
			System.out.println("½ÄÀÎ ²É");
		}
		else if(flower instanceof HarnivoreMarker) {
			System.out.println("Ã¤½Ä ²É");
		}
		else {
			System.out.println("Àâ½Ä");
		}
	}
	
	public static void main(String[] args) {
		
	}
}
