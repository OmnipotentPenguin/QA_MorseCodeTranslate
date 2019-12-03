package main;

import java.util.LinkedList;

public class StringSplitter {

	public static LinkedList<String> splitString(String input) {

		LinkedList<String> letters = new LinkedList<String>();

		String[] words = input.split(" ");
		for (String word : words) {

			letters.add(word);
		}
		return letters;
	}
}
