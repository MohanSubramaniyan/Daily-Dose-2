package numbers;
import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		String res=num%2==0?"even":"odd";
		System.out.println(res);
	}
}