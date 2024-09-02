package fizzbuzz;

public class FIzzBuzzApp {

	public static void main(String[] args) {
		// User story #1 - The program prints the numbers 1-100 to the console 
		 
		for(int i = 1; i <= 100; i++) {
			// User Story #2 - If a number is divisible by 3 replace the numeric console output with the word "fizz"
			if (i  % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
				continue; 
				// User Story #3 - If a number is divisible by 5 replace the numeric console output with the word “buzz”.
			} else if (i % 3 == 0) {
				System.out.println("fizz");
				continue;
				// User Story #4 - If a number is divisible by both 3 and 5 replace the numeric console output with "fizzbuzz".
			} else if (i % 5 == 0) {
				System.out.println("buzz");
				continue;
			}
			System.out.println(i);
		}

	}

}
