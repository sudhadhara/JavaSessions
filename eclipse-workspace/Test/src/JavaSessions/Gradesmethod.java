package JavaSessions;
import java.util.Scanner;
public class Gradesmethod {

	
	public String marks1(int marks) {
		
		if(marks>91 && marks<=100) {
			System.out.println("Grade is AA");
		}
		
		else if(marks>=81 && marks<=90) {
			System.out.println("Grade is AB");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("Grade is BB");
		}
		else if(marks>=61 && marks<=70) {
			System.out.println("Grade is AB");
		}
		else if(marks>=51 && marks<=60) {
			System.out.println("Grade is AB");
		}
		else if(marks>=41 && marks<=50) {
			System.out.println("Grade is AB");
		}
		else {
			
		System.out.println("Fail");
		
			//return "Fail";
		}
		return "Fail";
	
	}

	
	public static void main(String[] args) {
		Gradesmethod GM=new Gradesmethod();
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter your marks: ");
            int marks1= input.nextInt();
	    		String Result=GM.marks1(marks1);
	    		input.close();
		
//		Gradesmethod GM=new Gradesmethod();
//		String M1=GM.marks1(40);
//		System.out.print(M1);
		
	    
	}
}

