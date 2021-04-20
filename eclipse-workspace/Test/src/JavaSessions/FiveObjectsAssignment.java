package JavaSessions;

public class FiveObjectsAssignment {
	
	String name;
	int Age;

	public static void main(String[] args) {
		FiveObjectsAssignment first=new FiveObjectsAssignment();
		first.m1("Sudha",30);
		FiveObjectsAssignment second=new FiveObjectsAssignment();
		second.m2("Siju",13);
		FiveObjectsAssignment third=new FiveObjectsAssignment();
		third.m3("Saahi",18);
		FiveObjectsAssignment Fourth=new FiveObjectsAssignment();
		Fourth.m4("Satya",45);
		FiveObjectsAssignment Fifth=new FiveObjectsAssignment();
		Fifth.m5("Rama",60);
		

	}
	
	public void m1(String name,int Age) {
		System.out.println("This is first object Name & Age is " +name  +Age);
		
	}
	public void m2(String name,int Age) {
		System.out.println("This is Second object Name & Age is  " +name +Age);
	}
	public void m3(String name,int Age) {
		System.out.println("This is Third object Name & Age is  " +name +Age);
	}
	public void m4(String name,int Age) {
		System.out.println("This is fourth object Name & Age  is " +name +Age);
	}
	public void m5(String name,int Age) {
		System.out.println("This is fifth object Name & Age is " +name +Age);
	}
	
	

}
