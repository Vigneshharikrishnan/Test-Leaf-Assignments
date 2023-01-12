package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom {

	public static void main(String[] args) {
		//litreal
		String name = "TeastLeaf";
		String name1 = "TeastLeaf";
		//object
		String str = new String("TeastLeaf");
		System.out.println(name==name1);
		System.out.println(name.equals(str));
		
		//how to count legnth
		int length = str.length();
		System.out.println();
	}

}
