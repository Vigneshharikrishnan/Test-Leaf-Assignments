package week1.day2;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int input=13;
		boolean flag=false;
		for (int i = 2; i<=input; i++) {
			
		if(input%i==0) 
		{
			
			flag=true;
			break;
		}
	}
	
		if(!flag)
			System.out.println(input+ " is a not Prime Number");
		else
			System.out.println(input+ " is a Prime Number");	
		}
		
}
