package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int n=34343;
		int tem, rev= 0, temp;
	        temp = n;
	        while( n != 0 )
	        {
	            tem= n % 10;
	            rev= rev * 10 + tem;
	            n=n/10;
	        }
	        if (temp == rev)
	            System.out.println(temp + " is a palindrome.");
	        else
	            System.out.println(temp + " is not a palindrome.");
	    }
	}

