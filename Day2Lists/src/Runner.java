import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			ints.add(i);
		}

		System.out.println(ints);

		System.out.println("Multiply multiples of 5 by 10: " + multiplyByTen(ints));

		ArrayList<String> listOstrings = new ArrayList<String>();
		listOstrings.add("one");
		listOstrings.add("two");
		listOstrings.add("three");
		listOstrings.add("three");
		listOstrings.add("two");
		listOstrings.add("one");

		System.out.println(listOstrings);

		String word = "two";

		System.out.println("Number of times the word " + word + " appears: " + numOfWordsStream(listOstrings, word));

		System.out.println("Sum of lists: " + sumOfList(ints));

		System.out.println("The largest number in the list is: " + largestNumStream(ints).get());

		System.out.println("The list without odd numbers is: " + removeOddsStream(ints));

		ArrayList<Integer> randomInts = new ArrayList<Integer>();
		randomInts.add(3);
		randomInts.add(1);
		randomInts.add(2);
		System.out.println(randomInts);
		System.out.println("The sorted list is: " + sortListAsc(randomInts));

	}

	public static boolean lookForNumber(ArrayList<Integer> listInput, int number) {
		return listInput.contains(number);
	}

	public static ArrayList<Integer> multiplyByTen(ArrayList<Integer> listInput) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i : listInput) {
			if (i % 5 == 0) {
				newList.add(i * 10);
			} else
				newList.add(i);
		}

		return newList;
	}

	public static int numOfWords(ArrayList<String> listInput, String word) { // this one
		int result = 0;
		for (String i : listInput) {
			if (i == word) {
				result++;
			}
		}

		return result;
	}

	public static int numOfWordsStream(ArrayList<String> listInput, String word) {
		return (int) listInput.stream().filter(i -> i == word).count();
	}

	public static int sumOfList(ArrayList<Integer> listInput) {
		int result = 0;
		for (int i : listInput) {
			result += i;
		}

		return result;
	}
	
	
	
	public static int largestNum(ArrayList<Integer> listInput) { // this one
		int result = 0;

		for (int i : listInput) {
			if (i > result)
				result = i;
		}

		return result;
	}

	public static Optional<Integer> largestNumStream(ArrayList<Integer> listInput) {
		return  listInput.stream().max(Integer::compare);
	}

	public static ArrayList<Integer> removeOdds(ArrayList<Integer> listInput) { // this one
		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (int i : listInput) {
			if (i % 2 == 0) {
				newList.add(i);
			}

		}

		return newList;
	}
	
	public static ArrayList<Integer> removeOddsStream(ArrayList<Integer> listInput){
		return (ArrayList<Integer>) listInput.stream().filter(i->i%2==0).collect(Collectors.toList());//removeIf(i->i%2!=0);.
	}
	
	

	public static ArrayList<Integer> sortListAsc(ArrayList<Integer> listInput) {
		ArrayList<Integer> newList = new ArrayList<Integer>();

		newList = listInput;

		// Collections.sort(newList);
		newList.sort(null);

		return newList;
	}
}
