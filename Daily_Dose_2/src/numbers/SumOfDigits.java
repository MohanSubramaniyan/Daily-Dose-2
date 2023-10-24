package numbers;

import java.util.*;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		sc.close();
		int sum = 0, rem = n;
		while (n != 0) {
			rem = n % 10;
			sum += rem;
			n /= 10;
		}
		System.out.println(sum);
	}

}
