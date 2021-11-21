package krishna_test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Grad {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception, InputMismatchException {

		div();
		leapYear();
		vow_cons();

		string();
		volume();
	}

	public static boolean div() {
		boolean z;
		System.out.println("print the integer");
		int number = sc.nextInt();
		int res = number % 5;
		if (res == 0) {
			z = true;

		} else {
			z = false;

		}
		System.out.println(z);

		return z;
	}

	public static void leapYear() {
		int leapyear;
		int addyear = 4;
		int year;

		System.out.println("Please enter a year to print the next 20 years.");
		year = sc.nextInt();
		for (year = 2016; year <= 2092; year = year + 4) {
			System.out.println(year);
		}

	}

	public static ArrayList vow_cons() {
		System.out.println("Please enter string");
		String line = sc.next();
		// String line = "hi my name is srikrishna";
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;
		ArrayList res = new ArrayList();
		line = line.toLowerCase();
		for (int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);

			// check if character is any of a, e, i, o, u
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;

			}

			else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;

			}

		}
		res.add(vowels);
		res.add(consonants);
		System.out.println("vowels and consonents " + res);

		return res;
	}

	public static double volume() {
		System.out.println("diameter please");
		Scanner in = new Scanner(System.in);
		int diameter = in.nextInt();
		double pi = 2.73;
		int r = diameter / 2;
		double v = 4 / 3 * pi * r * r * r;
		System.out.println("volume with given diametr is " + v);

		return v;

	}

	public static int string() throws Exception {

		String s1 = "Please string enter string string";
		String s2 = "string";
		int count = 0;
		String[] words = s1.split("\\s+");
		int len = words.length;
		for (int i = 0; i < len; i++) {
			if (s2.equals(words[i])) {
				count++;
			}
		}
		System.out.println("the word " + s2 + " repeats " + count + " times");

		return count;

	}

}
