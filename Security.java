package com.gc.encrypt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Security {

	private static final Path encryptorPath = Paths.get("encryption.txt");
	private static final File encryptorFile = encryptorPath.toFile();

	static String decryptor(String input) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'm':
				output.append('a');
				break;
			case 'n':
				output.append('b');
				break;
			case 'o':
				output.append('c');
				break;
			case 'p':
				output.append('d');
				break;
			case 'q':
				output.append('e');
				break;
			case 'r':
				output.append('f');
				break;
			case 's':
				output.append('g');
				break;
			case 't':
				output.append('h');
				break;
			case 'u':
				output.append('i');
				break;
			case 'v':
				output.append('j');
				break;
			case 'w':
				output.append('k');
				break;
			case 'x':
				output.append('l');
				break;
			case 'y':
				output.append('m');
				break;
			case 'z':
				output.append('n');
				break;
			case '1':
				output.append('o');
				break;
			case '2':
				output.append('p');
				break;
			case '3':
				output.append('q');
				break;
			case '4':
				output.append('r');
				break;
			case '5':
				output.append('s');
				break;
			case '6':
				output.append('t');
				break;
			case '7':
				output.append('u');
				break;
			case '8':
				output.append('v');
				break;
			case '9':
				output.append('w');
				break;
			case '0':
				output.append('x');
				break;
			case 'a':
				output.append('y');
				break;
			case 'b':
				output.append('z');
				break;
			case 'c':
				output.append('1');
				break;
			case 'd':
				output.append('2');
				break;
			case 'e':
				output.append('3');
				break;
			case 'f':
				output.append('4');
				break;
			case 'g':
				output.append('5');
				break;
			case 'h':
				output.append('6');
				break;
			case 'i':
				output.append('7');
				break;
			case 'j':
				output.append('8');
				break;
			case 'k':
				output.append('9');
				break;
			case 'l':
				output.append('0');
				break;
			case ' ':
				output.append(' ');
				break;
			default:
				output.append(input.charAt(i));
			}
		}
		System.out.println(output);
		saveAll(output);
		return output.toString();
	}

	static String encryptor(String input) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'a':
				output.append('m');
				break;
			case 'b':
				output.append('n');
				break;
			case 'c':
				output.append('o');
				break;
			case 'd':
				output.append('p');
				break;
			case 'e':
				output.append('q');
				break;
			case 'f':
				output.append('r');
				break;
			case 'g':
				output.append('s');
				break;
			case 'h':
				output.append('t');
				break;
			case 'i':
				output.append('u');
				break;
			case 'j':
				output.append('v');
				break;
			case 'k':
				output.append('w');
				break;
			case 'l':
				output.append('x');
				break;
			case 'm':
				output.append('y');
				break;
			case 'n':
				output.append('z');
				break;
			case 'o':
				output.append('1');
				break;
			case 'p':
				output.append('2');
				break;
			case 'q':
				output.append('3');
				break;
			case 'r':
				output.append('4');
				break;
			case 's':
				output.append('5');
				break;
			case 't':
				output.append('6');
				break;
			case 'u':
				output.append('7');
				break;
			case 'v':
				output.append('8');
				break;
			case 'w':
				output.append('9');
				break;
			case 'x':
				output.append('0');
				break;
			case 'y':
				output.append('a');
				break;
			case 'z':
				output.append('b');
				break;
			case '1':
				output.append('c');
				break;
			case '2':
				output.append('d');
				break;
			case '3':
				output.append('e');
				break;
			case '4':
				output.append('f');
				break;
			case '5':
				output.append('g');
				break;
			case '6':
				output.append('h');
				break;
			case '7':
				output.append('i');
				break;
			case '8':
				output.append('j');
				break;
			case '9':
				output.append('k');
				break;
			case '0':
				output.append('l');
				break;
			case ' ':
				output.append(' ');
				break;
			default:
				output.append(input.charAt(i));
			}
		}
		System.out.println(output);
		saveAll(output);
		return output.toString();
	}

	private static boolean saveAll(StringBuilder output) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(encryptorFile)))) {
			out.println(output);
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}

		return true;
	}

}
