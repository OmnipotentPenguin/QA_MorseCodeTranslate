package main;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> morseInput = StringSplitter.splitString(
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--");

		// System.out.println(morseInput);

		Translator.translate(morseInput, Translator.morseValues());

	}

}
