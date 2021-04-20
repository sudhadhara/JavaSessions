package JavaSessions;

public class Switch1 {

	public void marks(String studentname) {
		int marks=0;
		switch(studentname)
		{
		case "john":
			marks=90;
				 
				System.out.println(studentname +"got" +marks);
			break;
		case "vedhava":
			marks=55;
			System.out.println(studentname +"got" +marks);
			break;
			
			default:
				System.out.println("fail");
		}
		
	}
	
	public static void main(String[] args) {
		
		Switch1 marks1=new Switch1();
		marks1.marks("vedhava");

	}

}
