
public class Runner {
	public static void main(String[] args) {

		System.out.println(q7(15, 5));

	}

	public static int q7(int rangeLow, int rangeHigh) {
		int counter = 0;

		if (rangeLow > rangeHigh) {
			int a = rangeHigh;
			rangeHigh = rangeLow;
			rangeLow = a;
		}

		for (int i = rangeLow; i <= rangeHigh; i++) {
			if (i % 5 == 0)
				counter++;
		}

		return counter;
	}
}
