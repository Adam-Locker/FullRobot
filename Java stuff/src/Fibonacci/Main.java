package Fibonacci;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		long y = 1, output = 0, input;
		System.out.println("How many numbers of the Fibonacci sequence do you want?");
		input = scanner.nextInt();
		for (int x = 0; x < input; x++) {
			System.out.println(output);
			output = output + y;
			y = output - y;
		}
	}
}