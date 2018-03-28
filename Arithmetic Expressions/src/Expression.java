import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		double firstValue =1; 
		double secondValue =0;
		double sum = 0;
		String expression ="";
		Scanner reader = new Scanner(System.in);
		System.out.println("Hi i will take 2 values and a expression to evalue ex. 2 * 4 = 8");	

		
		while(true) {
			System.out.println("Please enter expression:");
			firstValue= reader.nextDouble();
			if(firstValue ==0.0)break;
			expression = reader.next();
			secondValue = reader.nextDouble();
			
			switch(expression) {
			
			case "+":
				sum = firstValue + secondValue;
				break;
			case "-":
				sum = firstValue - secondValue;
				break;
			case "*":	
				sum = firstValue * secondValue;
				break;
			case "/":	
				sum = firstValue / secondValue;
				break;
			default:
			System.out.println("Wrong Expression");
			firstValue=0;
			}
			System.out.println(sum);
		}
	}
	
	
}
