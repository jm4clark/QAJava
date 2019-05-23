import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int variable1 = 0;
		int variable2 = 0;
		String operator;
		
		Scanner user_input = new Scanner( System.in );
		System.out.println("Enter two variables");
		variable1 = Integer.parseInt(user_input.next( ));
		variable2 = Integer.parseInt(user_input.next( ));
		System.out.println("Enter operator");
		operator = user_input.next();
		switch (operator) {
		case "+": 
			System.out.println("The product of these numbers is "+(variable1+variable2));
			break;
		case "-":
			System.out.println("Number 1 - Number 2 "+(variable1-variable2));
			break;
		case "*":
			System.out.println("Number 1 * Number 2 "+(variable1*variable2));
			break;
		case "/":
			System.out.println("Number 1 / Number 2 "+(variable1/variable2));
			break;
		}
	}
	
	

}
