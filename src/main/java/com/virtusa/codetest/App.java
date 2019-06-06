package com.virtusa.codetest;

import java.util.Scanner;

public class App {

	public static void main(final String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		String input = sc.next();

		try {
			int n = Integer.parseInt(input);
			NumberToWordFormat nw = new NumberToWordFormat();
			String words = nw.numberToWord(n);
			System.out.println(n + " : " + words);
		} catch (NumberFormatException ex) {
			System.out.println("Pleae enter Valid Number and Run again");
		}

	}
}
