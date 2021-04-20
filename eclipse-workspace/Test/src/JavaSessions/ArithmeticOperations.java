package JavaSessions;

public class ArithmeticOperations {


	public static void main(String[] args) {
		ArithmeticOperations sum1=new ArithmeticOperations();
		int Add =sum1.sum();
		ArithmeticOperations sub1=new ArithmeticOperations();
		int SUB=sub1.sub();
		ArithmeticOperations mul1=new ArithmeticOperations();
		int MUL=mul1.mul();
		ArithmeticOperations div1=new ArithmeticOperations();
		double DIV=div1.div();
		System.out.println(Add);
		System.out.println(SUB);
		System.out.println(MUL);
		System.out.println(DIV);
		

	}
	
	public int sum() {
		int a=30;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public int sub() {
		int e=30;
		int f=20;
		int g=e-f;
		return g;
	}
	
	public int mul() {
		int h=7;
		int j=8;
		int k=h*j;
		return k;
		
	}
	public double div() {
		int m=10;
		int n=7;
		double o=n%m;
		return o;
		
		
	}

}
