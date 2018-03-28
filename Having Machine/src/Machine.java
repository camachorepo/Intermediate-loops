import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		int input = 0; 
		Scanner reader = new Scanner(System.in);
		System.out.println("Hello please input an integer");
		input = reader.nextInt();
		
		while (input > 1) {
			
			if(input%2 ==0) {
				input = input/2; 
			}
			else {
				input= ++input/2;
				
			}
			System.out.println(input);
		}
		
	}
	
	
	
}
