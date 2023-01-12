package week1.day1;

public class Calculator1 {
		public int add(int a,int b) {
	       return(a+b);
		}
	    public int add1(int a,int b,int c) {
	        return(a+b+c);
		}
	    public int mul(int a,int b) {
	         return(a*b);
		}
	    public double mul1(int a,double b) {
	        return(a*b);
		}
	    public int sub(int a,int b) {
	        return(a-b);
		}
	    public double sub1(double a,double b) {
	        return(a-b);
		}
	    public int div(int a,int b) {
	        return(a/b);
		}
	    public double div1(double a,int b) {
	         return(a/b);
		}
		public static void main(String[] args) {
			
	     Calculator1 obj=new Calculator1();
	     System.out.println(obj.add(5, 4));
	     System.out.println(obj.add1(5, 4, 9));
	     System.out.println(obj.mul(5, 4));
	     System.out.println(obj.mul1(5, 4.7));
	     System.out.println(obj.sub(5, 4));
	     System.out.println(obj.sub1(10.5, 2.5));
	     System.out.println(obj.div(20, 5));
	     System.out.println(obj.div1(21.5, 7));
	    
		}

}
