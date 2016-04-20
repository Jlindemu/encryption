package com.gc.encrypt;

import java.util.Scanner;

public class EncryptorLab {

	static String output;
	static String action = "";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Encryptor! ");

		while (!action.equalsIgnoreCase("3")) {
			output = "";
			System.out.println("\n1   - encrypt a message");
			System.out.println("2     - decrypt a message");
			System.out.println("3     - Exit the program");
			System.out.println("Enter a command: ");

			menu(sc);

		}

		sc.close();

	}

	private static int menu(Scanner sc) {
		String input;

		{
			action = sc.next();
			System.out.println();
			sc.nextLine();
			if (action.equalsIgnoreCase("1")) {
				System.out.println("What would you like encrypted?");
				input = sc.nextLine();
				output = Security.encryptor(input.toLowerCase());
				return 1;
			} else if (action.equalsIgnoreCase("2")) {
				System.out.println("What would you like decrypted?");
				input = sc.nextLine();
				output = Security.decryptor(input.toLowerCase());
				return 2;
			} else if (action.equalsIgnoreCase("3")) {
				System.out.println("Thank you for using the Encryptor!\n");
				return 3;
			} else {
				System.out.println("Error! Not a valid command.\n");
				return 4;
			}

		}

	}

}
