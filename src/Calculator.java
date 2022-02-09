import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in a number");
		double operand1 = sc.nextDouble();
		System.out.println("Enter in a number");
		double operand2 = sc.nextDouble();
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Would you like to add, subtract, multiply, or divide?");
		String choice = sr.nextLine();
		if (choice.equalsIgnoreCase("add")) {
			System.out.println((operand1 + operand2));
		}
		else if (choice.equalsIgnoreCase("subtract")) {
			System.out.println((operand1 + operand2));
		}
		else if (choice.equalsIgnoreCase("multiply")) {
			System.out.println((operand1 * operand2));
		}
		else if (choice.equalsIgnoreCase("divide")) {
			System.out.println((operand1 / operand2));
		}
	}

}
