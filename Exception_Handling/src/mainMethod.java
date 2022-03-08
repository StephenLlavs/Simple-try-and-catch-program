import java.util.Scanner;

public class mainMethod {

	public static void main(String[] args) {

		int denominator, numerator, result;

		boolean flag = false;

		while (flag != true) {

			Scanner input = new Scanner(System.in);
			System.out.print("enter a numerator>> ");

			numerator = input.nextInt();

			System.out.print("Enter a Denominator>> ");

			denominator = input.nextInt();

			try {
				result = numerator / denominator;
				System.out.println(numerator + " / " + denominator + " = " + result);
			} catch (ArithmeticException mistake) {
				System.out.println("Arithmetic exception was thrown and caught");
			}

			System.out.println("Would you like to contnue? yes/no>> ");
			Scanner inputs = new Scanner(System.in);
			String userCont = inputs.nextLine();

			if (userCont.equals("no")) {
				System.out.println("Have a good Day!");
				break;

			}

		}
	}

}
