package week1.day1;

public class testCalcualtor {
	
	public int sub(int a, int b) {
		return a+b;
	}
	
	public int multiply(int a, int b) {
		return a*b;	
	}
	
	public static void main(String[] args) {
		testCalcualtor c1 = new testCalcualtor ();
		int s1 = c1.sub(200, 100);
		System.out.println(s1);
		int result = c1.multiply(20, 10);
		System.out.println(result);
	}
}
