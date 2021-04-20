package JavaSessions;

//public class MethodOverLoadingPractise {
//
//void sum (int a, int b)
//		  {
//		    System.out.println("sum is" + (a+b)) ;
//		  }
//		  void sum (float a, float b)
//		  {
//		    System.out.println("sum is" + (a+b));
//		  }
//		  public void Subtract(double c, double d)
//		  {
//			  
//			  System.out.println("sub is" + (c-d)) ;
//			  
//			
//		  }
//            public static void main(String[] args) {
//		  {
//			  MethodOverLoadingPractise  cal = new MethodOverLoadingPractise();
//		    cal.sum (8,5);      //sum(int a, int b) is method is called.
//		    cal.sum (4.6f, 3.8f); //sum(float a, float b) is called.
//		    cal.Subtract(20.00, 10.00);
//		    
//		  }
//		}	
//}

//class MethodOverLoadingPractise
//{
//	  void multiply(int l, int b)
//	  {
//	    System.out.println("Result is"+(l*b)) ;
//	  }
//	  void multiply(int l, int b,int h)
//	  {
//	    System.out.println("Result is"+(l*b*h));
//	  }
//	  public static void main(String[] args)
//	  {
//		  MethodOverLoadingPractise  ar = new MethodOverLoadingPractise();
//	    ar.multiply(8,5);   //multiply(int l, int b) is method is called
//	    ar.multiply(4,6,2);   //multiply(int l, int b,int h) is called
//	  }
//	}


class MethodOverLoadingPractise
{
	
	
    int method(int i, int d) {
    System.out.println(i+d);
    return i+d;
    }
    {
        
    }
   
     
    static int method(int i, double d)
    {
    	System.out.println(i+d);
        return (int)(i+d);
    
        
    }
    
     
    double method(double i, int d)
    
    {
    	System.out.println(i+d);
        return i+d;
    }
     
    static double method(double i, double d)
    {
    	System.out.println(i+d);
        return i+d;
    }
    public static void main(String[] args)
    {
    	MethodOverLoadingPractise obj=new MethodOverLoadingPractise();
    	
        obj.method(2,3);
        obj.method(3,20.22);
        obj.method(20.22,2);
        obj.method(13.22,2.33);
        
        
        
    	
}
}


