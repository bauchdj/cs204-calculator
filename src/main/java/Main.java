import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create an instance of the Calculator class
		Calculator calculator = new Calculator();

		// Create a scanner object to read inputs from the console
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter <command>: \n");

		// Continuously read input commands and process them
		while (scanner.hasNextLine()) {
			// Read the next line of input
			String input = scanner.nextLine();

			// Split the input into parts (command and parameters)
			String[] inputParts = input.split(" ");

			// Get the command and parameters from the input
			String command = inputParts[0];
			int num1 = Integer.parseInt(inputParts[1]);

			// Process based on the command
			switch (command) {
				case "add":
					int addResult = calculator.add(num1, Integer.parseInt(inputParts[2]));
					System.out.println(addResult);
					break;

				case "subtract":
					int subtractResult = calculator.subtract(num1, Integer.parseInt(inputParts[2]));
					System.out.println(subtractResult);
					break;

				case "multiply":
					int multiplyResult = calculator.multiply(num1, Integer.parseInt(inputParts[2]));
					System.out.println(multiplyResult);
					break;

				case "divide":
					try {
						int divideResult = calculator.divide(num1, Integer.parseInt(inputParts[2]));
						System.out.println(divideResult);
					} catch (ArithmeticException e) {
						System.out.println("Error: Division by zero");
					}
					break;

				case "fibonacci":
					int fibonacciResult = calculator.fibonacciNumberFinder(num1);
					System.out.println(fibonacciResult);
					break;

				case "binary":
					String binaryResult = calculator.intToBinaryNumber(num1);
					System.out.println(binaryResult);
					break;

				default:
					System.out.println("Unknown command");
					break;
			}
		}
	}
}
