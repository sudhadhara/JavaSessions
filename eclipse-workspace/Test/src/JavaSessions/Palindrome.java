package JavaSessions;

public class Palindrome {

	public static void main(String[] args) {
		
			int r,sum=0,temp;
			int n=557;//It is the number variable to be checked for palindrome.
			temp=n;
			while(n>0){
			r=n%10; //getting remainder.
			sum=(sum*10)+r;
			n = n/10;    
		       }    
		      if(temp==sum)    
		        System.out.println("It is a Palindrome number.");    
		      else    
		        System.out.println("Not a palindrome");
            System.out.println();
	}

	}

