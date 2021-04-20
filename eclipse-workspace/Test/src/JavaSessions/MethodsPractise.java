package JavaSessions;
//Write a program to print the sum of two numbers entered by defining your own method.
public class MethodsPractise {
	
	
		//public static void main(String[] args) {
//			MethodsPractise MP=new MethodsPractise();
//			int c=MP.sum(2,6);
//			System.out.println(c);
//		
//	}
//		public int sum(int a,int b) {
//		int c = a+b;
//			return c;
			
			//Define a method that returns the product of two numbers entered 
//	public static void main(String[] args) {
//			MethodsPractise MP1=new MethodsPractise();
//			 MP1.multiply(5,7);
//			//System.out.println(z);
//	}
//			
//			public void multiply(int x,int y) {
//			int z=x*y;
//			
//			System.out.println(z);
			
	//-----------------------------------------------------------

//Define two methods to print the maximum and the minimum number respectively among three numbers entered.
			
	public static void main(String[] args) {
		MethodsPractise m1=new MethodsPractise();
		int c=m1.max(12,14,28);
		System.out.println(c + "is the Max Number" );
		
		
		}
	public int max(int x,int y,int z) {
		
		if(x>=y && x>=z) {
			return x;//System.out.println(x + " is Max number");
		}
			else if(y>=z) {
				return y;
				//System.out.println(y + " is Max number");	
			}
			 else {
				 //System.out.println(z + "is the Max number");
				 return z;
			
			 }
			
			 
		

		
//		if (x >= y) {
//		   c = x;
//		}
//		   else {
//			   c = y;
//		   }
//		if (c >= z) {
//			return c;
//			}
//			   else {
//				   return z;
//			   }
//			
	//-----------------------------------------------------------------
//	public static void main(String[] args) {
//	MethodsPractise m1=new MethodsPractise();
//	m1.min(10,14,15);
//    System.out.println(m1);
//	}
//    public void min(int x,int y,int z) {
//    	if(x<=y && x<=z) {
//		System.out.println(x + " is min number");
//    }
//    	else if(y<=z) {
//    		System.out.println(y + " is min number");
//    	}
//    		else {
//    			System.out.println(z + "is the Min number");
//    			}
////    			
    	}
    
    
		}

	
	
	



	
	
