package week3.day2;

public class FindCharCount {

	public static void main(String[] args) {
		String input = "Preferred";
		int count = 0;
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='e') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
