import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		HashMap<String, String> binary = new HashMap<String, String>();
		
		//Binary to English
		binary.put(".-", "A");
		binary.put("-..", "B");
		binary.put("-.-.", "C");
		binary.put("-..", "D");
		binary.put(".", "E");
		binary.put("..-.", "F");
		binary.put("--.", "G");
		binary.put("....", "H");
		binary.put("..", "I");
		binary.put(".---", "J");
		binary.put("-.-", "K");
		binary.put(".-..", "L");
		binary.put("--", "M");
		binary.put("-.", "N");
		binary.put("---", "O");
		binary.put(".--.", "P");
		binary.put("--.-", "Q");
		binary.put(".-.", "R");
		binary.put("...", "S");
		binary.put("-", "T");
		binary.put("..-", "U");
		binary.put("...-", "V");
		binary.put(".--", "W");
		binary.put("-..-", "X");
		binary.put("-.--", "Y");
		binary.put("--..", "Z");
		binary.put("/", " ");

		//English to Binary
		binary.put("A", ".- ");
		binary.put("B", "-.. ");
		binary.put("C", "-.-. ");
		binary.put("D", "-.. ");
		binary.put("E", ". ");
		binary.put("F", "..-. ");
		binary.put("G", "--. ");
		binary.put("H", ".... ");
		binary.put("I", ".. ");
		binary.put("J", ".--- ");
		binary.put("K", "-.- ");
		binary.put("L", ".-.. ");
		binary.put("M","-- " );
		binary.put("N","-. ");
		binary.put("O","--- ");
		binary.put("P", ".--. ");
		binary.put("Q", "--.- ");
		binary.put("R", ".-. ");
		binary.put("S", "... ");
		binary.put("T", "- ");
		binary.put("U", "..- ");
		binary.put("V", "...-");
		binary.put("W",".-- ");
		binary.put("X", "-..- ");
		binary.put("Y", "-.-- ");
		binary.put("Z", "--.. ");
		binary.put(" ", "/ ");

		String s = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";

		String s1 = "HELLO WORLD";
		System.out.println(translateFromBinary(s, binary));
		
		System.out.println(translateFromBinary(translateToBinary(s1, binary),binary));

	}

	public static String translateFromBinary(String b, HashMap<String, String> binary) {
		String result = "";

		String[] split = b.split(" ");

		for (int i = 0; i < split.length; i++) {
			result += binary.get(split[i]);
		}

		return result;
	}
	
	public static String translateToBinary(String b, HashMap<String, String> binary) {
		String result = "";
		b.toUpperCase();
		
		String[] split = b.split("");

		for (int i = 0; i < split.length; i++) {
			result += binary.get(split[i]);
		}

		return result;
	}
}
