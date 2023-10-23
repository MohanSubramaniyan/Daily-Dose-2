package numbers;
import java.util.*;
public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int temp, a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		temp=a>b?a:b;
		int res=temp>c?temp:c;
		System.out.println(res);
	}

}
