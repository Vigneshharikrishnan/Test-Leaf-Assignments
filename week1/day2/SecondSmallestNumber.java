package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int Number[]= {23,45,67,32,89,22};
		Arrays.sort(Number);
		int length=Number.length;
			System.out.println("The Length of the array is: " +length);
			System.out.println("The Second Smallest Number is: " +Number[1]);
			}

}
