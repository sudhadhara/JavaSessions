package JavaSessions;

public class Areaofcircle {

	public static void main(String[] args) {
		Areaofcircle AC=new Areaofcircle ();
		double AC1= AC.Area();
		
		System.out.println(AC1);

	}
	
	public double Area() {
		
		int r=2;
		double pi = 3.14;
		double area = pi * r * r;
		return area;		
	
	}

}
