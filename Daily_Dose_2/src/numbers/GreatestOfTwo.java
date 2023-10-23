package numbers;
import java.util.Scanner;
public class GreatestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		String res=num1>num2?"num1":"num2";
		System.out.println(res);
	}

}
