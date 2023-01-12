package week1.day1;

public class Calculator {

	public void add() {
		int a = 5;
		int b = 10;
		System.out.println(a+b);
	}
	
	public void add1() {
		int a = 5;
		int b = 10;
		int c = 15;
		System.out.println(a+b+c);
	}
	
	public void subract() {
		int a = 5;
		int b = 10;
		System.out.println(a-b);
		
	}
	public int  multiply(int a, int b) {
		System.out.println();
		return a*b;
		
	}

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.subract();
		int result=cl.multiply(10,20);
				System.out.println(result);
		
	}
	
 
}
