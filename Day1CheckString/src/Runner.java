import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter strings:");
		
		String input1 = s.nextLine();
		String input2 = s.nextLine();
		
		if(input1.equals(input2))
		{
			System.out.println("The strings match!");
		}
		else
		{
			System.out.println("The strings don't match...");
		}
		
		s.close();
	}
}
