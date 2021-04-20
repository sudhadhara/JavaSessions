package JavaSessions;
//Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class FactorialPractise {

	public static void main(String[] args) {
		FactorialPractise FP=new FactorialPractise();
		FP.Factorial(3) ;
		
		
	}	
		public void Factorial(int num) 
		{
			 
		        long factorial = 1;
		        for(int i = 1; i <= num; i++)
		        {
		            factorial = factorial * i;
		            
		        }
		        System.out.printf("Factorial of %d=%d", num, factorial);
		    }
		
		}


