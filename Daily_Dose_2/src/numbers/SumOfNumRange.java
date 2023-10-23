package numbers;

import java.util.Scanner;

public class SumOfNumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int init=sc.nextInt();
		int end=sc.nextInt();
		int sum=0;
		sc.close();
		for(int i=init;i<=end;i++) {
			sum+=i;
		}System.out.println(sum);
	}

}
