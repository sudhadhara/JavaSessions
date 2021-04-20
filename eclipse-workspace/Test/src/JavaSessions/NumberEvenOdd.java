package JavaSessions;

import java.util.Scanner;
//public class NumberEvenOdd {
//
//    
//  public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int day = in.nextInt();
//
//        System.out.println(getDayName(day));
//    }
//
//    // Get the name for the Week
//    public static String getDayName(int day) {
//        String dayName = "";
//        switch (day) {
//            case 1: dayName = "Monday"; break;
//            case 2: dayName = "Tuesday"; break;
//            case 3: dayName = "Wednesday"; break;
//            case 4: dayName = "Thursday"; break;
//            case 5: dayName = "Friday"; break;
//            case 6: dayName = "Saturday"; break;
//            case 7: dayName = "Sunday"; break;
//            default:dayName = "Invalid day range";
//        }
//
//        return dayName;
        
        public class NumberEvenOdd {
        	
        
      public static void main(String[] args)
     {
        int n;
        Scanner s = new Scanner(System.in);
        {
        System.out.println("Enter the number you want to check:");
        
        n = s. nextInt();
        
        if(n % 2 == 0) {
        System. out. println("The given number "+n+" is Even ");
        }
        else 
        	System. out. println("The given number "+n+" is Odd ");
        }
        
    }
}
        