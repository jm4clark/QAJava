import java.util.Scanner;
public class CheckString {

	public static void main(String[] args) {
		
		String firstWord;
		String secondWord;
		Scanner user_input = new Scanner( System.in );
		firstWord = user_input.next();
		System.out.println("You entered: "+firstWord);
		secondWord = user_input.next();
		System.out.println("You entered: "+secondWord);
		if(firstWord.equalsIgnoreCase(secondWord)) {
			System.out.println("The first word equalled the second word");			
		}
		else 
		{
			System.out.println("The words do not match");
		}
	}

}
