package JavaSessions;

	import java.util.Arrays;
import java.util.Scanner;

	//Write a program which will have three methods ,
	//one which take input at run time and other compute multiplication and the thirt prints the result. *
	public class Assignment {

		public static void main(String[] args) {
		
			System.out.println("Enter the amount of sums you would like to calculate: ");
			
		        Scanner sc = null;
				@SuppressWarnings("null")
				int n = sc.nextInt();

		        int a[] = new int[n];
		        int b[] = new int[n];

		        System.out.println("Please enter the values you would like to sum as pairs of two numbers: ");
		        for (int i = 0; i < a.length; i++) {
		            a[i] = sc.nextInt();
		            b[i] = sc.nextInt();
		        }
		}

	
	}
	


