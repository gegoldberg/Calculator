import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in a number");
		int operand1 = sc.nextInt();
		System.out.println("Enter in a number");
		int operand2 = sc.nextInt();
		System.out.println((operand1 + operand2));
	}

}
