package numbers;

import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();
//		String y=num>0?"pos":"neg";
//		
//		System.out.println(y);
		if (num > 0)
			System.out.println("possitive");
		else if (num < 0)
			System.out.println("negative");

		else
			System.out.println("zero");

	}

}
