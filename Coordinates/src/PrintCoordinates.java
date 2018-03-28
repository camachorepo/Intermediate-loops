import java.util.Scanner;

public class PrintCoordinates {

	public static void main(String [] args) {
		int x, y =0;
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Hello this program prints out all possible values of coordinates on the X, Y Plane");
		System.out.println("Please give me your maximum X coordiante :");
		x= reader.nextInt();
		System.out.println("Please give me your maximum y coordiante :");
		y= reader.nextInt();
		
		System.out.println("Here are your possible cooridates");
		
		
		for (int i =0; i<= x; i++ )
		{
			
			for (int j=0; j<= y; j++) {
				System.out.println("{"+ i +"," + j + "}");
			}
		}
		
		
	}
	
	
}
