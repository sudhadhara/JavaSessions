//Write a Java program to create a new array list, add some colors (string) and print out the collection

package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignmen {

	public static void main(String[] args) {
		ArrayList <String> colors = new ArrayList<String>();
		//ArrayList<Object> colors = new ArrayList<Object>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("White");
		colors.add("orange");
		colors.add("pink");
		colors.add((colors.size()-1),"Black");
		
		System.out.println(colors.size());
		System.out.println(colors.get(colors.size()-1));
		System.out.println((colors.size()-1) +"Black");
		System.out.println(colors.remove(1));
		if(colors.contains("White"))
		{
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
		
		//Write a Java program to extract a portion of a array list.
		List<String> sub_List = colors.subList(1, 4);
		System.out.println("List of first three elements: " + sub_List);
				
		
		System.out.println(colors);
		//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		//System.out.println(colors.get(2));
		//System.out.println("LI= " + 0);
		//System.out.println("HI= " + (colors.size()- 1));
		
		//Write a Java program of swap two elements in an array list.
		System.out.println("Array list before Swap:");
        for(String SW: colors){
        	System.out.println(SW);
      }
        
        Collections.swap(colors,0,3);
		 System.out.println("Array list after swap:");
		 System.out.println(colors);
		 
		 //Write a Java program to empty an array list.
		// colors.clear();
		 //System.out.println(colors);
		 
		// Write a program to trim the virtual capacity of an array list the current list size.
		 
		 System.out.println("virtual size is " +colors.size());
		 colors.trimToSize();
		 System.out.println("currentsize after trim: " + colors.size());
		 
		 //Write a Java program to print all the elements of a ArrayList using the position of the elements
		 for(int i=0;i<=colors.size()-1;i++)
		 {
			 System.out.println("This is list of elements using position of the elements " + colors.get(i)); 
		 }
		 //Write a Java program to reverse elements in a array list
		 
		 System.out.println("colors before Reverse" + colors);
		 Collections.reverse(colors);
		 System.out.println("colors After Reverse" + colors);
		 //Write a Java program to update specific array element by given element.
		 colors.set(2, "Brown");
		 System.out.println("colors After update" + colors);
		 
		// Write a Java program to insert an element into the array list at the first and last positions.
		 colors.add(0, "purple");
		 colors.add(colors.size(),"light blue");
		 System.out.println("colors After insert into an Array list at first positon" + colors);
		 
		 }
	}

		
		
	




