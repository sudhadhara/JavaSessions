package JavaSessions;
//A person is elligible to vote if his/her age is greater than or equal to 18.
//Define a method to find out if he/she is elligible to vote.
public class Eligibility {

	public static void main(String[] args) {
		
		Eligibility E=new Eligibility();
		E.eligible(1);
		

	}

	public void eligible(int a) {
		if(a>=18) {
			System.out.println("Person is Eligible");
		}
		
		else if(a<18) {
			System.out.println("Person is Not Eligible");
			
		}
		
	}
}
