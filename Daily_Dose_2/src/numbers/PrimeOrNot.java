package numbers;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner ik = new Scanner(System.in);
		int num = ik.nextInt();
		ik.close();
		boolean isPrime = true;

		if (num < 2)
			isPrime = false;
		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		String result = isPrime ? "prime" : "not prime";
		System.out.println(result);
	}

}
