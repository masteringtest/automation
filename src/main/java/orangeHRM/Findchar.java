package orangeHRM;

import java.util.Scanner;

public class Findchar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read input
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();

		System.out.print("Enter a character to remove: ");
		char c = scanner.nextLine().charAt(0);

		// Remove first and last character occurrences
		String result = removeFirstLastChar(str, c);

		// Print the updated string
		System.out.println("Updated string: " + result);

		scanner.close();
	}

	public static String removeFirstLastChar(String str, char c) {
		int firstIndex = str.indexOf(c);
		int lastIndex = str.lastIndexOf(c);

		if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {
			return str.substring(0, firstIndex) + str.substring(firstIndex + 1, lastIndex)
					+ str.substring(lastIndex + 1);
		} else {
			return str;
		}
	}
}