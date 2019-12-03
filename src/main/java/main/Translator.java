package main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Translator {

	public static Map<String, String> morseValues() {

		Map<String, String> morseCode = new HashMap<String, String>();

		morseCode.put(".-", "A");
		morseCode.put("-...", "B");
		morseCode.put("-.-.", "C");
		morseCode.put("-..", "D");
		morseCode.put(".", "E");
		morseCode.put("..-.", "F");
		morseCode.put("--.", "G");
		morseCode.put("....", "H");
		morseCode.put("..", "I");
		morseCode.put(".---", "J");
		morseCode.put("-.-", "K");
		morseCode.put(".-..", "L");
		morseCode.put("--", "M");
		morseCode.put("-.", "N");
		morseCode.put("---", "O");
		morseCode.put(".--.", "P");
		morseCode.put("--.-", "Q");
		morseCode.put(".-.", "R");
		morseCode.put("...", "S");
		morseCode.put("-", "T");
		morseCode.put("..-", "U");
		morseCode.put("...-", "V");
		morseCode.put(".--", "W");
		morseCode.put("-..-", "X");
		morseCode.put("-.--", "Y");
		morseCode.put("--..", "Z");

		morseCode.put(".----", "1");
		morseCode.put("..---", "2");
		morseCode.put("...--", "3");
		morseCode.put("....-", "4");
		morseCode.put(".....", "5");
		morseCode.put("-....", "6");
		morseCode.put("--...", "7");
		morseCode.put("---..", "8");
		morseCode.put("----.", "9");
		morseCode.put("-----", "0");

		morseCode.put(".-.-.-", ".");
		morseCode.put("--..--", ",");
		morseCode.put("..--..", "?");

		morseCode.put("/", " ");

		return morseCode;
	};

	public static void translate(LinkedList<String> letters, Map<String, String> morse) {

		for (String letter : letters) {
			System.out.print(morse.get(letter));
		}
	}

}

/*
 * Map<Long, Person> people = new HashMap<>(); people.put(1L, new Person());
 * Person person = people.get(1L); System.out.println(person);
 */