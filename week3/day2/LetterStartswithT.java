package week3.day2;



public class LetterStartswithT {

	public static void main(String[] args) {
		String input = "Test leaf twin tower teynapet";
		String[] split = input.split(" ");
		
		for (int i = 0; i < split.length; i++) {
		
			if (split[i].startsWith("T") || split[i].startsWith("t")) {
			System.out.println(split[i] );
		}
		}
	}
}
