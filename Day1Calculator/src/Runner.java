import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter 2 numbers:");

		float input1 = s.nextFloat();
		float input2 = s.nextFloat();

		System.out.println("Enter operator:");

		String operator = s.next();

		switch (operator) {
		case "+":
			System.out.println("Result: " + addNums(input1, input2));
			break;
		case "*":
			System.out.println("Result: " + multiplyNums(input1, input2));
			break;
		case "-":
			System.out.println("Result: " + subtractNums(input1, input2));
			break;
		case "/":
			System.out.println("Result: " + divideNums(input1, input2));
			break;
		case "%":
			System.out.println("Result: " + addNums(input1, input2));
			break;
		}
		
		s.close();
	}

	static float addNums(float num1, float num2) {
		float result = num1 + num2;
		return result;
	}

	static float multiplyNums(float num1, float num2) {
		float result = num1 * num2;
		return result;
	}

	static float subtractNums(float num1, float num2) {
		float result = num1 - num2;
		return result;
	}

	static float divideNums(float num1, float num2) {
		float result = num1 / num2;
		return result;
	}

	static float moduloNums(float num1, float num2) {
		float result = num1 % num2;
		return result;
	}
}
