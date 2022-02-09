import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in a number");
		int operand1 = sc.nextInt();
		System.out.println("Enter in a number");
		int operand2 = sc.nextInt();
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Would you like to add or subtract?");
		String choice = sr.nextLine();
		if (choice.equalsIgnoreCase("add")) {
			System.out.println((operand1 + operand2));
		}
		else if (choice.equalsIgnoreCase("subtract")) {
			System.out.println((operand1 + operand2));
		}
	
	}

}
