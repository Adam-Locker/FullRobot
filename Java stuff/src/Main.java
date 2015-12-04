import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static int FindingPrime(int x) {
		boolean Prime = true;
		int q = 2;
		if (x == 1) {
			Prime = false;
		}
		while (q < x) {
			if (x % q == 0) {
				Prime = false;
			}
			q++;
		}

		if (Prime == true) {
			return x;

		} else {
			return 0;
		}
	}

	public static void main(String args[]) {
		/*
		 * int x = 1; int y = 0; int c = 0; int counter = 0; boolean done =
		 * false;
		 * 
		 * while (done == false) { c = FindingPrime(x); y = y + c; if (counter
		 * == 1000) { done = true; } if (c != 0) { counter++;
		 * System.out.println(c); } x++; }
		 * 
		 * System.out.print(y);
		 */
		int x;
		System.out.println("Welcome to Prime Checker \nWhat number would you like to check?");
		x = scanner.nextInt();
		if (FindingPrime(x) != 0) {
			System.out.println(x + " is a prime number");
		} else {
			System.out.println(x + " is not a prime number");
		}
	}
}
