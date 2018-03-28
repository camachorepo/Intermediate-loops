import java.util.Scanner;

public class PrintCharacters {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		String input= "";
		System.out.println("Hello please enter a string:");
		input = reader. nextLine();
		System.out.println("Here are the letters one at a time");
		for(int i =0; i< input.length(); i++)
		{
			System.out.println(i +": " + input.charAt(i) );
		}
		
		
	}

}
