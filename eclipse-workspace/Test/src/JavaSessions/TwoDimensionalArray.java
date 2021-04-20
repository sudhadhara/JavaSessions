package JavaSessions;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String a[][]=new String[3][5];
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		//Row 0
		a[0][0]="A";
		a[0][1]="B";
		a[0][2]="C";
		a[0][3]="D";
		a[0][4]="E";
		
		
		//Row 1
		a[1][0]="A1";
		a[1][1]="A2";
		a[1][2]="A3";
		a[1][3]="A4";
		a[1][4]="A5";
		
		//Row2
		a[2][0]="A22";
		a[2][1]="A23";
		a[2][2]="A24";
		a[2][3]="A25";
		a[2][4]="A26";
		
		System.out.println(a[0][0]);
		
		for(int row=0;row<a.length;row++) {
			
			for(int col=0;col<a[0].length;col++)
			System.out.println(a [row][col]);
		}
		}
		
		
		
		
		
		
		

	


}
